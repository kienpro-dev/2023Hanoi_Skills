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
    public partial class Register : Form
    {
        private bool viewTerm = false;
        Session1Entities entity = new Session1Entities();

        public Register()
        {
            InitializeComponent();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Close();
            new Login().Show();
        }

        private void term_LinkClicked(object sender, LinkLabelLinkClickedEventArgs e)
        {
            new Term().Show();
            viewTerm = true;
        }

        private void agree_CheckedChanged(object sender, EventArgs e)
        {
            if(!viewTerm)
            {
                MessageBox.Show("You must view terms and condition first");
                agree.Checked = false;
                return;
            }
        }

        private void regist_Click(object sender, EventArgs e)
        {
            if(!agree.Checked)
            {
                MessageBox.Show("You must agree with terms and condition");
                return;
            } 
            else if(username.Text == "" || name.Text == "" || (!male.Checked && !female.Checked) || pass1.Text == "" || pass2.Text == "" || pass1.Text != pass2.Text)
            {
                MessageBox.Show("Please review your information");
                return;
            }
            User u = new User()
            {
                ID = entity.Users.ToList().LastOrDefault().ID + 1,
                GUID = Guid.NewGuid(),
                Username = username.Text,
                FullName = name.Text,
                Password = pass1.Text,
                FamilyCount = Convert.ToInt32(member.Value),
                Gender = male.Checked,
                BirthDate = Convert.ToDateTime(birthday.Value.ToString("yyyy-MM-dd")),
                UserTypeID = 2
            };
            entity.Users.Add(u);
            entity.SaveChanges();

            MessageBox.Show("Register successfully");
            Hide();
            new Listing(u).Show();
        }
    }
}
