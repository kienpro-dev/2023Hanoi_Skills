namespace Session4
{
    partial class AdvancedSearch
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.areaCbb = new System.Windows.Forms.ComboBox();
            this.attractCbb = new System.Windows.Forms.ComboBox();
            this.label3 = new System.Windows.Forms.Label();
            this.titleCbb = new System.Windows.Forms.ComboBox();
            this.label4 = new System.Windows.Forms.Label();
            this.peopleNum = new System.Windows.Forms.NumericUpDown();
            this.nightNum = new System.Windows.Forms.NumericUpDown();
            this.fromDate = new System.Windows.Forms.DateTimePicker();
            this.label5 = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.label7 = new System.Windows.Forms.Label();
            this.label8 = new System.Windows.Forms.Label();
            this.toDate = new System.Windows.Forms.DateTimePicker();
            this.label9 = new System.Windows.Forms.Label();
            this.startPriceNum = new System.Windows.Forms.NumericUpDown();
            this.label10 = new System.Windows.Forms.Label();
            this.maxPriceNum = new System.Windows.Forms.NumericUpDown();
            this.label11 = new System.Windows.Forms.Label();
            this.typeCbb = new System.Windows.Forms.ComboBox();
            this.label12 = new System.Windows.Forms.Label();
            this.ameCbb3 = new System.Windows.Forms.ComboBox();
            this.label13 = new System.Windows.Forms.Label();
            this.ameCbb2 = new System.Windows.Forms.ComboBox();
            this.label14 = new System.Windows.Forms.Label();
            this.ameCbb1 = new System.Windows.Forms.ComboBox();
            this.label15 = new System.Windows.Forms.Label();
            this.changeSimpleBtn = new System.Windows.Forms.Button();
            this.clearBtn = new System.Windows.Forms.Button();
            this.advanceSearchBtn = new System.Windows.Forms.Button();
            this.advanceData = new System.Windows.Forms.DataGridView();
            this.Property = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Area = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.AvarageScore = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Total = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.AmountPayable = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Checkin = new System.Windows.Forms.DataGridViewTextBoxColumn();
            ((System.ComponentModel.ISupportInitialize)(this.peopleNum)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.nightNum)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.startPriceNum)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.maxPriceNum)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.advanceData)).BeginInit();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(63, 26);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(93, 13);
            this.label1.TabIndex = 0;
            this.label1.Text = "Advanced Search";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(63, 59);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(29, 13);
            this.label2.TabIndex = 1;
            this.label2.Text = "Area";
            // 
            // areaCbb
            // 
            this.areaCbb.FormattingEnabled = true;
            this.areaCbb.Location = new System.Drawing.Point(110, 56);
            this.areaCbb.Name = "areaCbb";
            this.areaCbb.Size = new System.Drawing.Size(121, 21);
            this.areaCbb.TabIndex = 2;
            // 
            // attractCbb
            // 
            this.attractCbb.FormattingEnabled = true;
            this.attractCbb.Location = new System.Drawing.Point(374, 56);
            this.attractCbb.Name = "attractCbb";
            this.attractCbb.Size = new System.Drawing.Size(121, 21);
            this.attractCbb.TabIndex = 4;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(305, 59);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(52, 13);
            this.label3.TabIndex = 3;
            this.label3.Text = "Attraction";
            // 
            // titleCbb
            // 
            this.titleCbb.FormattingEnabled = true;
            this.titleCbb.Location = new System.Drawing.Point(623, 56);
            this.titleCbb.Name = "titleCbb";
            this.titleCbb.Size = new System.Drawing.Size(121, 21);
            this.titleCbb.TabIndex = 6;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(528, 59);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(69, 13);
            this.label4.TabIndex = 5;
            this.label4.Text = "Property Title";
            // 
            // peopleNum
            // 
            this.peopleNum.Location = new System.Drawing.Point(623, 92);
            this.peopleNum.Name = "peopleNum";
            this.peopleNum.Size = new System.Drawing.Size(75, 20);
            this.peopleNum.TabIndex = 15;
            this.peopleNum.Value = new decimal(new int[] {
            1,
            0,
            0,
            0});
            // 
            // nightNum
            // 
            this.nightNum.Location = new System.Drawing.Point(458, 93);
            this.nightNum.Name = "nightNum";
            this.nightNum.Size = new System.Drawing.Size(75, 20);
            this.nightNum.TabIndex = 14;
            this.nightNum.Value = new decimal(new int[] {
            1,
            0,
            0,
            0});
            // 
            // fromDate
            // 
            this.fromDate.Format = System.Windows.Forms.DateTimePickerFormat.Short;
            this.fromDate.Location = new System.Drawing.Point(111, 93);
            this.fromDate.Name = "fromDate";
            this.fromDate.Size = new System.Drawing.Size(86, 20);
            this.fromDate.TabIndex = 13;
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(706, 93);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(39, 13);
            this.label5.TabIndex = 12;
            this.label5.Text = "people";
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(551, 93);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(66, 13);
            this.label6.TabIndex = 11;
            this.label6.Text = "night      and";
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Location = new System.Drawing.Point(418, 93);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(22, 13);
            this.label7.TabIndex = 10;
            this.label7.Text = "For";
            // 
            // label8
            // 
            this.label8.AutoSize = true;
            this.label8.Location = new System.Drawing.Point(66, 94);
            this.label8.Name = "label8";
            this.label8.Size = new System.Drawing.Size(30, 13);
            this.label8.TabIndex = 9;
            this.label8.Text = "From";
            // 
            // toDate
            // 
            this.toDate.Format = System.Windows.Forms.DateTimePickerFormat.Short;
            this.toDate.Location = new System.Drawing.Point(299, 94);
            this.toDate.Name = "toDate";
            this.toDate.Size = new System.Drawing.Size(86, 20);
            this.toDate.TabIndex = 17;
            // 
            // label9
            // 
            this.label9.AutoSize = true;
            this.label9.Location = new System.Drawing.Point(254, 95);
            this.label9.Name = "label9";
            this.label9.Size = new System.Drawing.Size(20, 13);
            this.label9.TabIndex = 16;
            this.label9.Text = "To";
            // 
            // startPriceNum
            // 
            this.startPriceNum.Location = new System.Drawing.Point(156, 127);
            this.startPriceNum.Name = "startPriceNum";
            this.startPriceNum.Size = new System.Drawing.Size(75, 20);
            this.startPriceNum.TabIndex = 19;
            // 
            // label10
            // 
            this.label10.AutoSize = true;
            this.label10.Location = new System.Drawing.Point(63, 129);
            this.label10.Name = "label10";
            this.label10.Size = new System.Drawing.Size(69, 13);
            this.label10.TabIndex = 18;
            this.label10.Text = "Starting price";
            // 
            // maxPriceNum
            // 
            this.maxPriceNum.Location = new System.Drawing.Point(393, 127);
            this.maxPriceNum.Name = "maxPriceNum";
            this.maxPriceNum.Size = new System.Drawing.Size(75, 20);
            this.maxPriceNum.TabIndex = 21;
            // 
            // label11
            // 
            this.label11.AutoSize = true;
            this.label11.Location = new System.Drawing.Point(291, 129);
            this.label11.Name = "label11";
            this.label11.Size = new System.Drawing.Size(77, 13);
            this.label11.TabIndex = 20;
            this.label11.Text = "Maximum price";
            // 
            // typeCbb
            // 
            this.typeCbb.FormattingEnabled = true;
            this.typeCbb.Location = new System.Drawing.Point(623, 129);
            this.typeCbb.Name = "typeCbb";
            this.typeCbb.Size = new System.Drawing.Size(121, 21);
            this.typeCbb.TabIndex = 23;
            // 
            // label12
            // 
            this.label12.AutoSize = true;
            this.label12.Location = new System.Drawing.Point(528, 132);
            this.label12.Name = "label12";
            this.label12.Size = new System.Drawing.Size(73, 13);
            this.label12.TabIndex = 22;
            this.label12.Text = "Property Type";
            // 
            // ameCbb3
            // 
            this.ameCbb3.FormattingEnabled = true;
            this.ameCbb3.Location = new System.Drawing.Point(623, 168);
            this.ameCbb3.Name = "ameCbb3";
            this.ameCbb3.Size = new System.Drawing.Size(121, 21);
            this.ameCbb3.TabIndex = 29;
            // 
            // label13
            // 
            this.label13.AutoSize = true;
            this.label13.Location = new System.Drawing.Point(528, 171);
            this.label13.Name = "label13";
            this.label13.Size = new System.Drawing.Size(44, 13);
            this.label13.TabIndex = 28;
            this.label13.Text = "Amenity";
            // 
            // ameCbb2
            // 
            this.ameCbb2.FormattingEnabled = true;
            this.ameCbb2.Location = new System.Drawing.Point(374, 168);
            this.ameCbb2.Name = "ameCbb2";
            this.ameCbb2.Size = new System.Drawing.Size(121, 21);
            this.ameCbb2.TabIndex = 27;
            // 
            // label14
            // 
            this.label14.AutoSize = true;
            this.label14.Location = new System.Drawing.Point(305, 171);
            this.label14.Name = "label14";
            this.label14.Size = new System.Drawing.Size(44, 13);
            this.label14.TabIndex = 26;
            this.label14.Text = "Amenity";
            // 
            // ameCbb1
            // 
            this.ameCbb1.FormattingEnabled = true;
            this.ameCbb1.Location = new System.Drawing.Point(110, 168);
            this.ameCbb1.Name = "ameCbb1";
            this.ameCbb1.Size = new System.Drawing.Size(121, 21);
            this.ameCbb1.TabIndex = 25;
            // 
            // label15
            // 
            this.label15.AutoSize = true;
            this.label15.Location = new System.Drawing.Point(63, 171);
            this.label15.Name = "label15";
            this.label15.Size = new System.Drawing.Size(44, 13);
            this.label15.TabIndex = 24;
            this.label15.Text = "Amenity";
            // 
            // changeSimpleBtn
            // 
            this.changeSimpleBtn.Location = new System.Drawing.Point(394, 195);
            this.changeSimpleBtn.Name = "changeSimpleBtn";
            this.changeSimpleBtn.Size = new System.Drawing.Size(87, 23);
            this.changeSimpleBtn.TabIndex = 30;
            this.changeSimpleBtn.Text = "Simple Search";
            this.changeSimpleBtn.UseVisualStyleBackColor = true;
            this.changeSimpleBtn.Click += new System.EventHandler(this.changeSimpleBtn_Click);
            // 
            // clearBtn
            // 
            this.clearBtn.Location = new System.Drawing.Point(515, 195);
            this.clearBtn.Name = "clearBtn";
            this.clearBtn.Size = new System.Drawing.Size(87, 23);
            this.clearBtn.TabIndex = 31;
            this.clearBtn.Text = "Clear form";
            this.clearBtn.UseVisualStyleBackColor = true;
            // 
            // advanceSearchBtn
            // 
            this.advanceSearchBtn.Location = new System.Drawing.Point(645, 195);
            this.advanceSearchBtn.Name = "advanceSearchBtn";
            this.advanceSearchBtn.Size = new System.Drawing.Size(100, 23);
            this.advanceSearchBtn.TabIndex = 32;
            this.advanceSearchBtn.Text = "Search properties";
            this.advanceSearchBtn.UseVisualStyleBackColor = true;
            // 
            // advanceData
            // 
            this.advanceData.AllowUserToAddRows = false;
            this.advanceData.AllowUserToDeleteRows = false;
            this.advanceData.AutoSizeColumnsMode = System.Windows.Forms.DataGridViewAutoSizeColumnsMode.Fill;
            this.advanceData.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.advanceData.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.Property,
            this.Area,
            this.AvarageScore,
            this.Total,
            this.AmountPayable,
            this.Checkin});
            this.advanceData.Location = new System.Drawing.Point(47, 224);
            this.advanceData.Name = "advanceData";
            this.advanceData.ReadOnly = true;
            this.advanceData.Size = new System.Drawing.Size(698, 214);
            this.advanceData.TabIndex = 33;
            // 
            // Property
            // 
            this.Property.HeaderText = "Property";
            this.Property.Name = "Property";
            this.Property.ReadOnly = true;
            // 
            // Area
            // 
            this.Area.HeaderText = "Area";
            this.Area.Name = "Area";
            this.Area.ReadOnly = true;
            // 
            // AvarageScore
            // 
            this.AvarageScore.HeaderText = "Avarage Score";
            this.AvarageScore.Name = "AvarageScore";
            this.AvarageScore.ReadOnly = true;
            // 
            // Total
            // 
            this.Total.HeaderText = "Total completed reservations";
            this.Total.Name = "Total";
            this.Total.ReadOnly = true;
            // 
            // AmountPayable
            // 
            this.AmountPayable.HeaderText = "Amount Payable";
            this.AmountPayable.Name = "AmountPayable";
            this.AmountPayable.ReadOnly = true;
            // 
            // Checkin
            // 
            this.Checkin.HeaderText = "Check-in at";
            this.Checkin.Name = "Checkin";
            this.Checkin.ReadOnly = true;
            // 
            // AdvancedSearch
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.advanceData);
            this.Controls.Add(this.advanceSearchBtn);
            this.Controls.Add(this.clearBtn);
            this.Controls.Add(this.changeSimpleBtn);
            this.Controls.Add(this.ameCbb3);
            this.Controls.Add(this.label13);
            this.Controls.Add(this.ameCbb2);
            this.Controls.Add(this.label14);
            this.Controls.Add(this.ameCbb1);
            this.Controls.Add(this.label15);
            this.Controls.Add(this.typeCbb);
            this.Controls.Add(this.label12);
            this.Controls.Add(this.maxPriceNum);
            this.Controls.Add(this.label11);
            this.Controls.Add(this.startPriceNum);
            this.Controls.Add(this.label10);
            this.Controls.Add(this.toDate);
            this.Controls.Add(this.label9);
            this.Controls.Add(this.peopleNum);
            this.Controls.Add(this.nightNum);
            this.Controls.Add(this.fromDate);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.label8);
            this.Controls.Add(this.titleCbb);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.attractCbb);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.areaCbb);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Name = "AdvancedSearch";
            this.Text = "Seoul Stay - Search Properties and Listings";
            ((System.ComponentModel.ISupportInitialize)(this.peopleNum)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.nightNum)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.startPriceNum)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.maxPriceNum)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.advanceData)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.ComboBox areaCbb;
        private System.Windows.Forms.ComboBox attractCbb;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.ComboBox titleCbb;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.NumericUpDown peopleNum;
        private System.Windows.Forms.NumericUpDown nightNum;
        private System.Windows.Forms.DateTimePicker fromDate;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.Label label8;
        private System.Windows.Forms.DateTimePicker toDate;
        private System.Windows.Forms.Label label9;
        private System.Windows.Forms.NumericUpDown startPriceNum;
        private System.Windows.Forms.Label label10;
        private System.Windows.Forms.NumericUpDown maxPriceNum;
        private System.Windows.Forms.Label label11;
        private System.Windows.Forms.ComboBox typeCbb;
        private System.Windows.Forms.Label label12;
        private System.Windows.Forms.ComboBox ameCbb3;
        private System.Windows.Forms.Label label13;
        private System.Windows.Forms.ComboBox ameCbb2;
        private System.Windows.Forms.Label label14;
        private System.Windows.Forms.ComboBox ameCbb1;
        private System.Windows.Forms.Label label15;
        private System.Windows.Forms.Button changeSimpleBtn;
        private System.Windows.Forms.Button clearBtn;
        private System.Windows.Forms.Button advanceSearchBtn;
        private System.Windows.Forms.DataGridView advanceData;
        private System.Windows.Forms.DataGridViewTextBoxColumn Property;
        private System.Windows.Forms.DataGridViewTextBoxColumn Area;
        private System.Windows.Forms.DataGridViewTextBoxColumn AvarageScore;
        private System.Windows.Forms.DataGridViewTextBoxColumn Total;
        private System.Windows.Forms.DataGridViewTextBoxColumn AmountPayable;
        private System.Windows.Forms.DataGridViewTextBoxColumn Checkin;
    }
}