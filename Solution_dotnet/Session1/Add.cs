using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Session1
{
    public partial class Add : Form
    {
        Session1Entities entity = new Session1Entities();
        private Item item = null;
        private User user = null;
        public Add()
        {
            InitializeComponent();
        }

        public Add(User user) 
        {
            InitializeComponent();
            this.user = user;
            loadData();
        }

        public Add(Item item) 
        {
            InitializeComponent();
            this.item = item;
            this.user = item.User;
            loadData();
        }

        public void loadData()
        {
            type.DataSource = entity.ItemTypes.Select(x => x.Name).ToList();
            entity.Amenities.ToList().ForEach(x => { ame.Rows.Add(x.Name, false); }) ;
            entity.Attractions.ToList().ForEach(x => { attData.Rows.Add(x.Name, x.Area.Name); });
            if (item != null)
            {
                type.SelectedText = entity.ItemTypes.Where(x => x.ID == item.ItemTypeID).FirstOrDefault().ToString();
                title.Text = item.Title;
                capacity.Value = item.Capacity;
                bed.Value = item.NumberOfBeds;
                bedroom.Value = item.NumberOfBedrooms;
                bathroom.Value = item.NumberOfBathrooms;
                address1.Text = item.ApproximateAddress;
                address2.Text = item.ExactAddress;
                description.Text = item.Description;
                rule.Text = item.HostRules;
                min.Value = item.MinimumNights;
                max.Value = item.MaximumNights;
                entity.Amenities.ToList().ForEach(x => { 
                    ame.Rows.Add(x.Name, entity.ItemAmenities.Where(y => y.ItemID == item.ID).Select(z => z.AmenityID).ToList().Contains(x.ID)); 
                });
                entity.Attractions.ToList().ForEach(x => { attData.Rows.Add(x.Name, x.Area.Name); });

            }
        }

        private void next_Click(object sender, EventArgs e)
        {
            tab.SelectedIndex = (tab.SelectedIndex + 1) % tab.TabCount;
            finish.Enabled = tab.SelectedIndex == 2;
        }

        private void finish_Click(object sender, EventArgs e)
        {

        }
    }
}
