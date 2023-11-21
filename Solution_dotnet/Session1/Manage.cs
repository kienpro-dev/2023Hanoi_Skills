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
    public partial class Listing : Form
    {
        private User user;
        Session1Entities entity = new Session1Entities();
        public Listing(User user)
        {
            InitializeComponent();
            this.user = user;
        }

        private void exit_Click(object sender, EventArgs e)
        {
            Environment.Exit(0);
        }

        private void logout_Click(object sender, EventArgs e)
        {
            Close();
            new Login().Show();
        }

        private void add_Click(object sender, EventArgs e)
        {
            Hide();
            new Add(user).Show();
        }

        private void loadTraver()
        {
            entity.Items.ToList().ForEach(i => { data.Rows.Add(i.Title, i.Area.Name, i.Capacity, i.ItemType.Name); });
        }

        private void loadManage()
        {
            entity.Items.Where(i => i.ID == user.ID).ToList().ForEach(i => { data2.Rows.Add(i.Title, i.Area.Name, i.Capacity, i.ItemType.Name, "Edit detail"); });
        }

        private void data2_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            if (e.RowIndex >= 0 && e.ColumnIndex == 4)
            {
                DataGridViewRow clickedRow = data2.Rows[e.RowIndex];
                string title = Convert.ToString(clickedRow.Cells[0].Value);
                Item item = entity.Items.Where(i => i.Title == title).FirstOrDefault();
                Hide();
                new Add(item).Show();
            }
        }

        private void search_Click(object sender, EventArgs e)
        {
            data.Rows.Clear();
            entity.Items.Where(x => x.Title.Contains(searchT.Text)).ToList().ForEach(i => {
                data.Rows.Add(i.Title, i.Area.Name, i.Capacity, i.ItemType.Name);
            });
        }

        private void Listing_Load(object sender, EventArgs e)
        {
            loadTraver();
            loadManage();
        }
    }
}
