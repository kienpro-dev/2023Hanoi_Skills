using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Session4
{
    public partial class AdvancedSearch : Form
    {
        Session4Entities entity = new Session4Entities();
        public AdvancedSearch()
        {
            InitializeComponent();
            loadData();
        }

        private void changeSimpleBtn_Click(object sender, EventArgs e)
        {
            Close();
            new SimpleSearch().Show();
        }

        private void loadData()
        {
            areaCbb.Items.AddRange(entity.Areas.Select(a => a.Name).ToArray());
            attractCbb.Items.AddRange(entity.Attractions.Select(a => a.Name).ToArray());
            titleCbb.Items.AddRange(entity.Items.Select(a => a.Title).ToArray());

            areaCbb.SelectedIndexChanged += areaCbb_SelectedIndexChanged;
            toDate.ValueChanged += toDate_ValueChanged;
            fromDate.ValueChanged += fromDate_ValueChanged;

            typeCbb.Items.AddRange(entity.ItemTypes.Select(a => a.Name).ToArray());

            ameCbb1.Items.AddRange(entity.Amenities.Select(a => a.Name).ToArray());
            ameCbb2.Items.AddRange(entity.Amenities.Select(a => a.Name).ToArray());
            ameCbb3.Items.AddRange(entity.Amenities.Select(a => a.Name).ToArray());

        }

        private void areaCbb_SelectedIndexChanged(object sender, EventArgs e)
        {
            attractCbb.Items.Clear();
            titleCbb.Items.Clear();
            if (areaCbb.SelectedItem != null)
            {
                entity.Attractions.Where(x => x.Areas.Name == areaCbb.SelectedItem.ToString())
                    .ToList().ForEach(a => attractCbb.Items.Add(a.Name));

                entity.Items.Where(x => x.Areas.Name == areaCbb.SelectedItem.ToString())
                    .ToList().ForEach(a => titleCbb.Items.Add(a.Title));
            }
        }

        private void fromDate_ValueChanged(object sender, EventArgs e)
        {
            if (DateTime.Compare(fromDate.Value, DateTime.Now) < 0)
            {
                MessageBox.Show("The start date can't be before the current date");
            }
            
        }

        private void toDate_ValueChanged(object sender, EventArgs e)
        {
            if (DateTime.Compare(toDate.Value, fromDate.Value) < 0)
            {
                MessageBox.Show("The end date can't be before the start date");
            }
        }

        private void advanceSearchBtn_Click(object sender, EventArgs e)
        {
            int capacity = Convert.ToInt32(peopleNum.Value);
            int night = Convert.ToInt32(nightNum.Value);
            HashSet<Items> items = (from it in entity.Items
                                    join ia in entity.ItemAmenities on it.ID equals ia.ItemID
                                    join iat in entity.ItemAttractions on it.ID equals iat.ItemID
                                    where it.Capacity >= capacity && it.MaximumNights - it.MinimumNights >= night
                                    && (it.Title == titleCbb.SelectedValue.ToString()
                                    && it.Areas.Name == areaCbb.SelectedValue.ToString()
                                    && it.ItemTypes.Name == typeCbb.SelectedValue.ToString()
                                    && iat.Attractions.Name == attractCbb.SelectedValue.ToString()
                                    && it.ItemAmenities.Select(x => x.Amenities.Name).ToList()
                                    .Contains(ameCbb1.SelectedValue.ToString() + ameCbb2.SelectedValue.ToString()
                                    + ameCbb3.SelectedValue.ToString())) select it).ToHashSet();
            if (items.Count <= 0)
            {
                MessageBox.Show("Not found properties");
            }
            else
            {
                foreach (Items item in items)
                {
                    List<ItemScores> itemScores = (from it in entity.ItemScores where it.ItemID == item.ID select it).ToList();
                    HashSet<Bookings> bookings = (from b in entity.Bookings
                                                  join bd in entity.BookingDetails on
                                                  b.ID equals bd.BookingID
                                                  join ip in entity.ItemPrices on
                                                  bd.ItemPriceID equals ip.ID
                                                  where ip.ItemID == item.ID
                                                  select b).ToHashSet();
                    double avg = itemScores.Count <= 0 ? 0 : itemScores.Average(v => v.Value);
                    double payable = Convert.ToDouble(bookings.Sum(p => p.AmountPaid));
                    advanceData.Rows.Add(item.Title, item.Areas.Name, avg, bookings.Count, payable);
                }
            }
        }
    }
}
