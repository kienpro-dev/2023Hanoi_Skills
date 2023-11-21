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
            Item item = new Item()
            {
                ItemTypeID = entity.ItemTypes.ToList()[type.SelectedIndex].ID,
                Title = title.Text,
                Capacity = Convert.ToInt32(capacity.Value),
                NumberOfBeds = Convert.ToInt32(bed.Value),
                NumberOfBedrooms = Convert.ToInt32(bedroom.Value),
                NumberOfBathrooms = Convert.ToInt32(bathroom.Value),
                ApproximateAddress = address1.Text,
                ExactAddress = address2.Text,
                Description = description.Text,
                HostRules = rule.Text,
                MinimumNights = Convert.ToInt32(min.Value),
                MaximumNights = Convert.ToInt32(max.Value),
                UserID = user.ID
            };

            if(this.item == null)
            {
                item.ID = entity.Items.ToList().LastOrDefault().ID + 1;
                item.GUID = Guid.NewGuid();
            } 
            else
            {
                item.ID = this.item.ID; 
                item.GUID = this.item.GUID;
            }

            List<ItemAmenity> itemAmenities = new List<ItemAmenity>();
            long imId = entity.ItemAmenities.OrderByDescending(x => x.ID)
                .FirstOrDefault().ID + 1;
            for (int i = 0; i < ame.Rows.Count; i++)
            {
                if ((bool)ame.Rows[i].Cells[1].Value)
                {
                    ItemAmenity im = new ItemAmenity()
                    {
                        ID = imId++,
                        GUID = Guid.NewGuid(),
                        ItemID = item.ID,
                        AmenityID = entity.Amenities.ToList()[i].ID,
                    };
                    itemAmenities.Add(im);
                }
            }
            item.ItemAmenities = itemAmenities;

            List<ItemAttraction> itemAttractions = new List<ItemAttraction>();
            long iatId = entity.ItemAttractions.OrderByDescending(x => x.ID)
                .FirstOrDefault().ID + 1;
            for (int i = 0; i < attData.Rows.Count; i++)
            {
                decimal Distance;
                long DurationOnFoot, DurationByCar;
                if (decimal.TryParse((string)attData.Rows[i].Cells[2].Value, out Distance)
                    && long.TryParse((string)attData.Rows[i].Cells[3].Value, out DurationOnFoot)
                    && long.TryParse((string)attData.Rows[i].Cells[4].Value, out DurationByCar))
                {
                    ItemAttraction iat = new ItemAttraction()
                    {
                        ID = iatId++,
                        GUID = Guid.NewGuid(),
                        ItemID = item.ID,
                        Attraction = entity.Attractions.ToList()[i],
                        Distance = Distance,
                        DurationOnFoot = DurationOnFoot,
                        DurationByCar = DurationByCar
                    };
                    itemAttractions.Add(iat);
                }
            }
            if (itemAttractions.Count > 0)
            {
                item.ItemAttractions = itemAttractions;
                ItemAttraction minIat = itemAttractions[0];
                item.AreaID = minIat.Attraction.AreaID;
                foreach (ItemAttraction i in itemAttractions)
                {
                    if (minIat.Distance > i.Distance)
                    {
                        item.AreaID = i.Attraction.AreaID;
                    }
                }
            }
            else
            {
                MessageBox.Show("Choose at least 1 attraction");
                return;
            }

            if (this.item == null)
            {
                entity.Items.Add(item);
                entity.SaveChanges();
                MessageBox.Show("Add listing successfull");
            }
            else
            {
                entity.Entry(item).State = System.Data.Entity.EntityState.Modified;
                entity.SaveChanges();
                MessageBox.Show("Edit listing successfull");
            }

            Close();
            new Listing(user).Show();
        }
    }
}
