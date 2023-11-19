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
    public partial class SimpleSearch : Form
    {
        Session4Entities entity = new Session4Entities();

        public SimpleSearch()
        {
            InitializeComponent();
        }

        private void changeAdvanceBtn_Click(object sender, EventArgs e)
        {
            Close();
            new AdvancedSearch().Show();
        }

        private void simpleSearchBtn_Click(object sender, EventArgs e)
        {
            simpleData.Rows.Clear();
            string search = searchTb.Text;
            int capacity = Convert.ToInt32(peopleNum.Text);
            int night = Convert.ToInt32(nightNum.Text);

            HashSet<Items> items = (from it in entity.Items
                                 join ia in entity.ItemAmenities on it.ID equals ia.ItemID
                                 join iat in entity.ItemAttractions on it.ID equals iat.ItemID
                                 where it.MaximumNights - it.MinimumNights >= night && it.Capacity >= capacity && (
                                 it.Title.Contains(search) || it.ItemTypes.Name.Contains(search) ||
                                 it.Areas.Name.Contains(search) || ia.Amenities.Name.Contains(search) ||
                                 iat.Attractions.Name.Contains(search))
                                 select it).ToHashSet();

            if (items.Count <= 0)
            {
                MessageBox.Show("Not found property: " + search);
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
                    simpleData.Rows.Add(item.Title, item.Areas.Name, avg, bookings.Count, payable);
                }
            }
        }
    }
}
