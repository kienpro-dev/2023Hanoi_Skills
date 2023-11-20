namespace Session1
{
    partial class Register
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
            this.username = new System.Windows.Forms.TextBox();
            this.checkBox1 = new System.Windows.Forms.CheckBox();
            this.male = new System.Windows.Forms.RadioButton();
            this.female = new System.Windows.Forms.RadioButton();
            this.name = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.member = new System.Windows.Forms.NumericUpDown();
            this.label5 = new System.Windows.Forms.Label();
            this.birthday = new System.Windows.Forms.DateTimePicker();
            this.pass1 = new System.Windows.Forms.TextBox();
            this.label6 = new System.Windows.Forms.Label();
            this.label7 = new System.Windows.Forms.Label();
            this.pass2 = new System.Windows.Forms.TextBox();
            this.agree = new System.Windows.Forms.CheckBox();
            this.term = new System.Windows.Forms.LinkLabel();
            this.regist = new System.Windows.Forms.Button();
            this.button2 = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.member)).BeginInit();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 24F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(271, 39);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(256, 37);
            this.label1.TabIndex = 0;
            this.label1.Text = "Your Information";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(42, 105);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(102, 24);
            this.label2.TabIndex = 1;
            this.label2.Text = "Username:";
            // 
            // username
            // 
            this.username.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.username.Location = new System.Drawing.Point(180, 102);
            this.username.Name = "username";
            this.username.Size = new System.Drawing.Size(181, 29);
            this.username.TabIndex = 2;
            // 
            // checkBox1
            // 
            this.checkBox1.AutoSize = true;
            this.checkBox1.Location = new System.Drawing.Point(0, 0);
            this.checkBox1.Name = "checkBox1";
            this.checkBox1.Size = new System.Drawing.Size(80, 17);
            this.checkBox1.TabIndex = 3;
            this.checkBox1.Text = "checkBox1";
            this.checkBox1.UseVisualStyleBackColor = true;
            // 
            // male
            // 
            this.male.AutoSize = true;
            this.male.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.male.Location = new System.Drawing.Point(539, 103);
            this.male.Name = "male";
            this.male.Size = new System.Drawing.Size(69, 28);
            this.male.TabIndex = 4;
            this.male.TabStop = true;
            this.male.Text = "Male";
            this.male.UseVisualStyleBackColor = true;
            // 
            // female
            // 
            this.female.AutoSize = true;
            this.female.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.female.Location = new System.Drawing.Point(636, 105);
            this.female.Name = "female";
            this.female.Size = new System.Drawing.Size(92, 28);
            this.female.TabIndex = 5;
            this.female.TabStop = true;
            this.female.Text = "Female";
            this.female.UseVisualStyleBackColor = true;
            // 
            // name
            // 
            this.name.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.name.Location = new System.Drawing.Point(180, 141);
            this.name.Name = "name";
            this.name.Size = new System.Drawing.Size(181, 29);
            this.name.TabIndex = 7;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(42, 144);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(94, 24);
            this.label3.TabIndex = 6;
            this.label3.Text = "Fullname:";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label4.Location = new System.Drawing.Point(426, 144);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(241, 24);
            this.label4.TabIndex = 8;
            this.label4.Text = "Number of family members:";
            // 
            // member
            // 
            this.member.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.member.Location = new System.Drawing.Point(678, 139);
            this.member.Minimum = new decimal(new int[] {
            1,
            0,
            0,
            0});
            this.member.Name = "member";
            this.member.Size = new System.Drawing.Size(50, 29);
            this.member.TabIndex = 9;
            this.member.Value = new decimal(new int[] {
            1,
            0,
            0,
            0});
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label5.Location = new System.Drawing.Point(42, 188);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(82, 24);
            this.label5.TabIndex = 10;
            this.label5.Text = "Birthday:";
            // 
            // birthday
            // 
            this.birthday.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.birthday.Format = System.Windows.Forms.DateTimePickerFormat.Short;
            this.birthday.Location = new System.Drawing.Point(180, 183);
            this.birthday.Name = "birthday";
            this.birthday.Size = new System.Drawing.Size(134, 29);
            this.birthday.TabIndex = 12;
            // 
            // pass1
            // 
            this.pass1.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.pass1.Location = new System.Drawing.Point(180, 228);
            this.pass1.Name = "pass1";
            this.pass1.PasswordChar = '*';
            this.pass1.Size = new System.Drawing.Size(181, 29);
            this.pass1.TabIndex = 14;
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label6.Location = new System.Drawing.Point(42, 231);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(97, 24);
            this.label6.TabIndex = 13;
            this.label6.Text = "Password:";
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label7.Location = new System.Drawing.Point(392, 229);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(161, 24);
            this.label7.TabIndex = 15;
            this.label7.Text = "Retype Password:";
            // 
            // pass2
            // 
            this.pass2.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.pass2.Location = new System.Drawing.Point(559, 231);
            this.pass2.Name = "pass2";
            this.pass2.PasswordChar = '*';
            this.pass2.Size = new System.Drawing.Size(181, 29);
            this.pass2.TabIndex = 16;
            this.pass2.TabStop = false;
            // 
            // agree
            // 
            this.agree.AutoSize = true;
            this.agree.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.agree.Location = new System.Drawing.Point(127, 292);
            this.agree.Name = "agree";
            this.agree.Size = new System.Drawing.Size(315, 28);
            this.agree.TabIndex = 17;
            this.agree.Text = "I agreed with terms and conditions";
            this.agree.UseVisualStyleBackColor = true;
            // 
            // term
            // 
            this.term.AutoSize = true;
            this.term.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.term.Location = new System.Drawing.Point(480, 292);
            this.term.Name = "term";
            this.term.Size = new System.Drawing.Size(242, 24);
            this.term.TabIndex = 18;
            this.term.TabStop = true;
            this.term.Text = "View Terms and Conditions";
            this.term.LinkClicked += new System.Windows.Forms.LinkLabelLinkClickedEventHandler(this.term_LinkClicked);
            // 
            // regist
            // 
            this.regist.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.regist.Location = new System.Drawing.Point(321, 346);
            this.regist.Name = "regist";
            this.regist.Size = new System.Drawing.Size(196, 34);
            this.regist.TabIndex = 19;
            this.regist.Text = "Register and Login";
            this.regist.UseVisualStyleBackColor = true;
            // 
            // button2
            // 
            this.button2.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button2.Location = new System.Drawing.Point(548, 346);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(196, 34);
            this.button2.TabIndex = 20;
            this.button2.Text = "Return Login Form";
            this.button2.UseVisualStyleBackColor = true;
            this.button2.Click += new System.EventHandler(this.button2_Click);
            // 
            // Register
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.button2);
            this.Controls.Add(this.regist);
            this.Controls.Add(this.term);
            this.Controls.Add(this.agree);
            this.Controls.Add(this.pass2);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.pass1);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.birthday);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.member);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.name);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.female);
            this.Controls.Add(this.male);
            this.Controls.Add(this.checkBox1);
            this.Controls.Add(this.username);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Name = "Register";
            this.Text = "Seoul Stay - Create Account";
            ((System.ComponentModel.ISupportInitialize)(this.member)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox username;
        private System.Windows.Forms.CheckBox checkBox1;
        private System.Windows.Forms.RadioButton male;
        private System.Windows.Forms.RadioButton female;
        private System.Windows.Forms.TextBox name;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.NumericUpDown member;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.DateTimePicker birthday;
        private System.Windows.Forms.TextBox pass1;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.TextBox pass2;
        private System.Windows.Forms.CheckBox agree;
        private System.Windows.Forms.LinkLabel term;
        private System.Windows.Forms.Button regist;
        private System.Windows.Forms.Button button2;
    }
}