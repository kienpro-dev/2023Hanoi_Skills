namespace Session4
{
    partial class SimpleSearch
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
            this.searchTb = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.fromDate = new System.Windows.Forms.DateTimePicker();
            this.nightNum = new System.Windows.Forms.NumericUpDown();
            this.peopleNum = new System.Windows.Forms.NumericUpDown();
            this.simpleSearchBtn = new System.Windows.Forms.Button();
            this.changeAdvanceBtn = new System.Windows.Forms.Button();
            this.simpleData = new System.Windows.Forms.DataGridView();
            this.Property = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Area = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.AvarageScore = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Total = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.AmountPayable = new System.Windows.Forms.DataGridViewTextBoxColumn();
            ((System.ComponentModel.ISupportInitialize)(this.nightNum)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.peopleNum)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.simpleData)).BeginInit();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(48, 22);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(75, 13);
            this.label1.TabIndex = 0;
            this.label1.Text = "Simple Search";
            // 
            // searchTb
            // 
            this.searchTb.Location = new System.Drawing.Point(51, 50);
            this.searchTb.Name = "searchTb";
            this.searchTb.Size = new System.Drawing.Size(512, 20);
            this.searchTb.TabIndex = 1;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(48, 96);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(30, 13);
            this.label2.TabIndex = 2;
            this.label2.Text = "From";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(236, 96);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(22, 13);
            this.label3.TabIndex = 3;
            this.label3.Text = "For";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(369, 96);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(66, 13);
            this.label4.TabIndex = 4;
            this.label4.Text = "night      and";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(524, 96);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(39, 13);
            this.label5.TabIndex = 5;
            this.label5.Text = "people";
            // 
            // fromDate
            // 
            this.fromDate.Format = System.Windows.Forms.DateTimePickerFormat.Short;
            this.fromDate.Location = new System.Drawing.Point(93, 95);
            this.fromDate.Name = "fromDate";
            this.fromDate.Size = new System.Drawing.Size(86, 20);
            this.fromDate.TabIndex = 6;
            // 
            // nightNum
            // 
            this.nightNum.Location = new System.Drawing.Point(276, 96);
            this.nightNum.Name = "nightNum";
            this.nightNum.Size = new System.Drawing.Size(75, 20);
            this.nightNum.TabIndex = 7;
            // 
            // peopleNum
            // 
            this.peopleNum.Location = new System.Drawing.Point(441, 95);
            this.peopleNum.Name = "peopleNum";
            this.peopleNum.Size = new System.Drawing.Size(75, 20);
            this.peopleNum.TabIndex = 8;
            // 
            // simpleSearchBtn
            // 
            this.simpleSearchBtn.Location = new System.Drawing.Point(626, 50);
            this.simpleSearchBtn.Name = "simpleSearchBtn";
            this.simpleSearchBtn.Size = new System.Drawing.Size(123, 23);
            this.simpleSearchBtn.TabIndex = 9;
            this.simpleSearchBtn.Text = "Search Properties";
            this.simpleSearchBtn.UseVisualStyleBackColor = true;
            // 
            // changeAdvanceBtn
            // 
            this.changeAdvanceBtn.Location = new System.Drawing.Point(626, 95);
            this.changeAdvanceBtn.Name = "changeAdvanceBtn";
            this.changeAdvanceBtn.Size = new System.Drawing.Size(123, 23);
            this.changeAdvanceBtn.TabIndex = 10;
            this.changeAdvanceBtn.Text = "Advanced Search";
            this.changeAdvanceBtn.UseVisualStyleBackColor = true;
            // 
            // simpleData
            // 
            this.simpleData.AllowUserToAddRows = false;
            this.simpleData.AllowUserToDeleteRows = false;
            this.simpleData.AutoSizeColumnsMode = System.Windows.Forms.DataGridViewAutoSizeColumnsMode.Fill;
            this.simpleData.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.simpleData.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.Property,
            this.Area,
            this.AvarageScore,
            this.Total,
            this.AmountPayable});
            this.simpleData.Location = new System.Drawing.Point(51, 147);
            this.simpleData.Name = "simpleData";
            this.simpleData.ReadOnly = true;
            this.simpleData.Size = new System.Drawing.Size(698, 291);
            this.simpleData.TabIndex = 11;
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
            // SimpleSearch
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.simpleData);
            this.Controls.Add(this.changeAdvanceBtn);
            this.Controls.Add(this.simpleSearchBtn);
            this.Controls.Add(this.peopleNum);
            this.Controls.Add(this.nightNum);
            this.Controls.Add(this.fromDate);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.searchTb);
            this.Controls.Add(this.label1);
            this.Name = "SimpleSearch";
            this.Text = "Seoul Stay - Search Properties and Listings";
            ((System.ComponentModel.ISupportInitialize)(this.nightNum)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.peopleNum)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.simpleData)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox searchTb;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.DateTimePicker fromDate;
        private System.Windows.Forms.NumericUpDown nightNum;
        private System.Windows.Forms.NumericUpDown peopleNum;
        private System.Windows.Forms.Button simpleSearchBtn;
        private System.Windows.Forms.Button changeAdvanceBtn;
        private System.Windows.Forms.DataGridView simpleData;
        private System.Windows.Forms.DataGridViewTextBoxColumn Property;
        private System.Windows.Forms.DataGridViewTextBoxColumn Area;
        private System.Windows.Forms.DataGridViewTextBoxColumn AvarageScore;
        private System.Windows.Forms.DataGridViewTextBoxColumn Total;
        private System.Windows.Forms.DataGridViewTextBoxColumn AmountPayable;
    }
}

