using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Session1
{
    public partial class Term : Form
    {
        public Term()
        {
            InitializeComponent();
            richTextBox1.Text = File.ReadAllText(@"C:\Users\tienk\OneDrive\Documents\Code\Thi_Tay_Nghe\2023HANOI_Skills (GPPM CNTT)\2023HANOI_Skills (GPPM CNTT)\DataFiles\WSC2022SE_TP09_Session1_actual_en\Terms.txt");
        }
    }
}
