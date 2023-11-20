namespace Session1
{
    partial class Listing
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
            this.tabControl1 = new System.Windows.Forms.TabControl();
            this.tabPage1 = new System.Windows.Forms.TabPage();
            this.data = new System.Windows.Forms.DataGridView();
            this.searchT = new System.Windows.Forms.TextBox();
            this.tabPage2 = new System.Windows.Forms.TabPage();
            this.add = new System.Windows.Forms.Button();
            this.data2 = new System.Windows.Forms.DataGridView();
            this.dataGridViewTextBoxColumn1 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn2 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn3 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn4 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.edit = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.logout = new System.Windows.Forms.Button();
            this.exit = new System.Windows.Forms.Button();
            this.search = new System.Windows.Forms.Button();
            this.Tittle = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Area = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Capacity = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.Type = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.tabControl1.SuspendLayout();
            this.tabPage1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.data)).BeginInit();
            this.tabPage2.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.data2)).BeginInit();
            this.SuspendLayout();
            // 
            // tabControl1
            // 
            this.tabControl1.Controls.Add(this.tabPage1);
            this.tabControl1.Controls.Add(this.tabPage2);
            this.tabControl1.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.tabControl1.Location = new System.Drawing.Point(21, 73);
            this.tabControl1.Name = "tabControl1";
            this.tabControl1.SelectedIndex = 0;
            this.tabControl1.Size = new System.Drawing.Size(755, 353);
            this.tabControl1.TabIndex = 0;
            // 
            // tabPage1
            // 
            this.tabPage1.Controls.Add(this.search);
            this.tabPage1.Controls.Add(this.data);
            this.tabPage1.Controls.Add(this.searchT);
            this.tabPage1.Location = new System.Drawing.Point(4, 33);
            this.tabPage1.Name = "tabPage1";
            this.tabPage1.Padding = new System.Windows.Forms.Padding(3);
            this.tabPage1.Size = new System.Drawing.Size(747, 316);
            this.tabPage1.TabIndex = 0;
            this.tabPage1.Text = "I\'m Traveler";
            this.tabPage1.UseVisualStyleBackColor = true;
            // 
            // data
            // 
            this.data.AllowUserToAddRows = false;
            this.data.AllowUserToDeleteRows = false;
            this.data.AutoSizeColumnsMode = System.Windows.Forms.DataGridViewAutoSizeColumnsMode.Fill;
            this.data.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.data.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.Tittle,
            this.Area,
            this.Capacity,
            this.Type});
            this.data.Location = new System.Drawing.Point(18, 41);
            this.data.Name = "data";
            this.data.ReadOnly = true;
            this.data.Size = new System.Drawing.Size(708, 256);
            this.data.TabIndex = 1;
            // 
            // searchT
            // 
            this.searchT.Location = new System.Drawing.Point(18, 6);
            this.searchT.Name = "searchT";
            this.searchT.Size = new System.Drawing.Size(367, 29);
            this.searchT.TabIndex = 0;
            // 
            // tabPage2
            // 
            this.tabPage2.Controls.Add(this.add);
            this.tabPage2.Controls.Add(this.data2);
            this.tabPage2.Location = new System.Drawing.Point(4, 33);
            this.tabPage2.Name = "tabPage2";
            this.tabPage2.Padding = new System.Windows.Forms.Padding(3);
            this.tabPage2.Size = new System.Drawing.Size(747, 316);
            this.tabPage2.TabIndex = 1;
            this.tabPage2.Text = "I\'m Owner / Manager";
            this.tabPage2.UseVisualStyleBackColor = true;
            // 
            // add
            // 
            this.add.Location = new System.Drawing.Point(18, 7);
            this.add.Name = "add";
            this.add.Size = new System.Drawing.Size(137, 32);
            this.add.TabIndex = 3;
            this.add.Text = "Add Listing";
            this.add.UseVisualStyleBackColor = true;
            this.add.Click += new System.EventHandler(this.add_Click);
            // 
            // data2
            // 
            this.data2.AllowUserToAddRows = false;
            this.data2.AllowUserToDeleteRows = false;
            this.data2.AutoSizeColumnsMode = System.Windows.Forms.DataGridViewAutoSizeColumnsMode.Fill;
            this.data2.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.data2.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.dataGridViewTextBoxColumn1,
            this.dataGridViewTextBoxColumn2,
            this.dataGridViewTextBoxColumn3,
            this.dataGridViewTextBoxColumn4,
            this.edit});
            this.data2.Location = new System.Drawing.Point(18, 45);
            this.data2.Name = "data2";
            this.data2.ReadOnly = true;
            this.data2.Size = new System.Drawing.Size(708, 256);
            this.data2.TabIndex = 2;
            this.data2.CellContentClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.data2_CellContentClick);
            // 
            // dataGridViewTextBoxColumn1
            // 
            this.dataGridViewTextBoxColumn1.HeaderText = "Tittle";
            this.dataGridViewTextBoxColumn1.Name = "dataGridViewTextBoxColumn1";
            this.dataGridViewTextBoxColumn1.ReadOnly = true;
            // 
            // dataGridViewTextBoxColumn2
            // 
            this.dataGridViewTextBoxColumn2.HeaderText = "Area";
            this.dataGridViewTextBoxColumn2.Name = "dataGridViewTextBoxColumn2";
            this.dataGridViewTextBoxColumn2.ReadOnly = true;
            // 
            // dataGridViewTextBoxColumn3
            // 
            this.dataGridViewTextBoxColumn3.HeaderText = "Capacity";
            this.dataGridViewTextBoxColumn3.Name = "dataGridViewTextBoxColumn3";
            this.dataGridViewTextBoxColumn3.ReadOnly = true;
            // 
            // dataGridViewTextBoxColumn4
            // 
            this.dataGridViewTextBoxColumn4.HeaderText = "Type";
            this.dataGridViewTextBoxColumn4.Name = "dataGridViewTextBoxColumn4";
            this.dataGridViewTextBoxColumn4.ReadOnly = true;
            // 
            // edit
            // 
            this.edit.HeaderText = "";
            this.edit.Name = "edit";
            this.edit.ReadOnly = true;
            // 
            // logout
            // 
            this.logout.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.logout.Location = new System.Drawing.Point(576, 44);
            this.logout.Name = "logout";
            this.logout.Size = new System.Drawing.Size(91, 34);
            this.logout.TabIndex = 1;
            this.logout.Text = "Log out";
            this.logout.UseVisualStyleBackColor = true;
            this.logout.Click += new System.EventHandler(this.logout_Click);
            // 
            // exit
            // 
            this.exit.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.exit.Location = new System.Drawing.Point(673, 44);
            this.exit.Name = "exit";
            this.exit.Size = new System.Drawing.Size(91, 34);
            this.exit.TabIndex = 2;
            this.exit.Text = "Exit";
            this.exit.UseVisualStyleBackColor = true;
            this.exit.Click += new System.EventHandler(this.exit_Click);
            // 
            // search
            // 
            this.search.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.search.Location = new System.Drawing.Point(401, 4);
            this.search.Name = "search";
            this.search.Size = new System.Drawing.Size(91, 34);
            this.search.TabIndex = 3;
            this.search.Text = "Search";
            this.search.UseVisualStyleBackColor = true;
            this.search.Click += new System.EventHandler(this.search_Click);
            // 
            // Tittle
            // 
            this.Tittle.HeaderText = "Tittle";
            this.Tittle.Name = "Tittle";
            this.Tittle.ReadOnly = true;
            this.Tittle.SortMode = System.Windows.Forms.DataGridViewColumnSortMode.Programmatic;
            // 
            // Area
            // 
            this.Area.HeaderText = "Area";
            this.Area.Name = "Area";
            this.Area.ReadOnly = true;
            // 
            // Capacity
            // 
            this.Capacity.HeaderText = "Capacity";
            this.Capacity.Name = "Capacity";
            this.Capacity.ReadOnly = true;
            // 
            // Type
            // 
            this.Type.HeaderText = "Type";
            this.Type.Name = "Type";
            this.Type.ReadOnly = true;
            // 
            // Listing
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.exit);
            this.Controls.Add(this.logout);
            this.Controls.Add(this.tabControl1);
            this.Name = "Listing";
            this.Text = "Seoul Stay - Management";
            this.tabControl1.ResumeLayout(false);
            this.tabPage1.ResumeLayout(false);
            this.tabPage1.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.data)).EndInit();
            this.tabPage2.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.data2)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.TabControl tabControl1;
        private System.Windows.Forms.TabPage tabPage1;
        private System.Windows.Forms.TabPage tabPage2;
        private System.Windows.Forms.TextBox searchT;
        private System.Windows.Forms.DataGridView data;
        private System.Windows.Forms.DataGridView data2;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn1;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn2;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn3;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn4;
        private System.Windows.Forms.Button add;
        private System.Windows.Forms.DataGridViewTextBoxColumn edit;
        private System.Windows.Forms.Button logout;
        private System.Windows.Forms.Button exit;
        private System.Windows.Forms.Button search;
        private System.Windows.Forms.DataGridViewTextBoxColumn Tittle;
        private System.Windows.Forms.DataGridViewTextBoxColumn Area;
        private System.Windows.Forms.DataGridViewTextBoxColumn Capacity;
        private System.Windows.Forms.DataGridViewTextBoxColumn Type;
    }
}