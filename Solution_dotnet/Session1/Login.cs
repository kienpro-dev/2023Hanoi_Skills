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
    public partial class Login : Form
    {
        Session1Entities entity = new Session1Entities();
        public Login()
        {
            InitializeComponent();
            
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Environment.Exit(0);
        }

        private void showCb_CheckedChanged(object sender, EventArgs e)
        {
            pass.PasswordChar = show.Checked ? '\0' : '*';
        }

        private void create_LinkClicked(object sender, LinkLabelLinkClickedEventArgs e)
        {
            Hide();
            new Register().Show();
        }

        private void log_Click(object sender, EventArgs e)
        {
            List<User> users = entity.Users.ToList();

            foreach (User u in users) 
            {
                if((u.Username == employ.Text && u.Password == pass.Text && u.UserTypeID == 1) 
                    || (u.Username == user.Text && u.Password == pass.Text && u.UserTypeID == 2))
                {
                    MessageBox.Show("Login successfully!");
                    Hide();
                    new Listing(u).Show();
                    return;
                }
            }

            MessageBox.Show("Wrong username or password");
        }
    }
}
