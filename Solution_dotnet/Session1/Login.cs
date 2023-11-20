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
    }
}
