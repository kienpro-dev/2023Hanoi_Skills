namespace Session1
{
    partial class Login
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
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.employ = new System.Windows.Forms.TextBox();
            this.user = new System.Windows.Forms.TextBox();
            this.pass = new System.Windows.Forms.TextBox();
            this.sign = new System.Windows.Forms.CheckBox();
            this.show = new System.Windows.Forms.CheckBox();
            this.log = new System.Windows.Forms.Button();
            this.exit = new System.Windows.Forms.Button();
            this.label5 = new System.Windows.Forms.Label();
            this.create = new System.Windows.Forms.LinkLabel();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 24F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(317, 53);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(117, 37);
            this.label1.TabIndex = 0;
            this.label1.Text = "LOGIN";
            this.label1.TextAlign = System.Drawing.ContentAlignment.TopCenter;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(127, 138);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(101, 24);
            this.label2.TabIndex = 1;
            this.label2.Text = "Employee:";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(127, 182);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(54, 24);
            this.label3.TabIndex = 2;
            this.label3.Text = "User:";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label4.Location = new System.Drawing.Point(127, 227);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(97, 24);
            this.label4.TabIndex = 3;
            this.label4.Text = "Password:";
            // 
            // employ
            // 
            this.employ.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.employ.Location = new System.Drawing.Point(249, 133);
            this.employ.Name = "employ";
            this.employ.Size = new System.Drawing.Size(272, 29);
            this.employ.TabIndex = 4;
            // 
            // user
            // 
            this.user.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.user.Location = new System.Drawing.Point(249, 182);
            this.user.Name = "user";
            this.user.Size = new System.Drawing.Size(272, 29);
            this.user.TabIndex = 5;
            // 
            // pass
            // 
            this.pass.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.pass.Location = new System.Drawing.Point(249, 227);
            this.pass.Name = "pass";
            this.pass.Size = new System.Drawing.Size(272, 29);
            this.pass.TabIndex = 6;
            this.pass.UseSystemPasswordChar = true;
            // 
            // sign
            // 
            this.sign.AutoSize = true;
            this.sign.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.sign.Location = new System.Drawing.Point(577, 165);
            this.sign.Name = "sign";
            this.sign.Size = new System.Drawing.Size(188, 28);
            this.sign.TabIndex = 7;
            this.sign.Text = "Keep me signed in";
            this.sign.UseVisualStyleBackColor = true;
            // 
            // show
            // 
            this.show.AutoSize = true;
            this.show.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.show.Location = new System.Drawing.Point(577, 203);
            this.show.Name = "show";
            this.show.Size = new System.Drawing.Size(163, 28);
            this.show.TabIndex = 8;
            this.show.Text = "Show password";
            this.show.UseVisualStyleBackColor = true;
            this.show.CheckedChanged += new System.EventHandler(this.showCb_CheckedChanged);
            // 
            // log
            // 
            this.log.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.log.Location = new System.Drawing.Point(267, 295);
            this.log.Name = "log";
            this.log.Size = new System.Drawing.Size(98, 31);
            this.log.TabIndex = 9;
            this.log.Text = "LOGIN";
            this.log.UseVisualStyleBackColor = true;
            // 
            // exit
            // 
            this.exit.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.exit.Location = new System.Drawing.Point(382, 295);
            this.exit.Name = "exit";
            this.exit.Size = new System.Drawing.Size(98, 31);
            this.exit.TabIndex = 10;
            this.exit.Text = "EXIT";
            this.exit.UseVisualStyleBackColor = true;
            this.exit.Click += new System.EventHandler(this.button2_Click);
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label5.Location = new System.Drawing.Point(197, 347);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(207, 24);
            this.label5.TabIndex = 11;
            this.label5.Text = "Don\'t have an account?";
            // 
            // create
            // 
            this.create.AutoSize = true;
            this.create.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.create.Location = new System.Drawing.Point(437, 347);
            this.create.Name = "create";
            this.create.Size = new System.Drawing.Size(103, 24);
            this.create.TabIndex = 12;
            this.create.TabStop = true;
            this.create.Text = "Create one";
            this.create.LinkClicked += new System.Windows.Forms.LinkLabelLinkClickedEventHandler(this.create_LinkClicked);
            // 
            // Login
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.create);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.exit);
            this.Controls.Add(this.log);
            this.Controls.Add(this.show);
            this.Controls.Add(this.sign);
            this.Controls.Add(this.pass);
            this.Controls.Add(this.user);
            this.Controls.Add(this.employ);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Name = "Login";
            this.Text = "Seoul Stay - Welcome";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox employ;
        private System.Windows.Forms.TextBox user;
        private System.Windows.Forms.TextBox pass;
        private System.Windows.Forms.CheckBox sign;
        private System.Windows.Forms.CheckBox show;
        private System.Windows.Forms.Button log;
        private System.Windows.Forms.Button exit;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.LinkLabel create;
    }
}

