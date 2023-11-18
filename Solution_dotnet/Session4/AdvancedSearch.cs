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
        public AdvancedSearch()
        {
            InitializeComponent();
        }

        private void changeSimpleBtn_Click(object sender, EventArgs e)
        {
            Close();
            new SimpleSearch().Show();
        }
    }
}
