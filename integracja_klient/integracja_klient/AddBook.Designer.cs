namespace integracja_klient
{
    partial class AddBook
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
            this.tb_Title = new System.Windows.Forms.TextBox();
            this.tb_Author = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.tb_Publisher = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.tb_ISBN = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.tb_Year = new System.Windows.Forms.TextBox();
            this.label5 = new System.Windows.Forms.Label();
            this.tb_Pagecount = new System.Windows.Forms.TextBox();
            this.label6 = new System.Windows.Forms.Label();
            this.btn_Add = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(12, 15);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(32, 13);
            this.label1.TabIndex = 0;
            this.label1.Text = "Tytuł";
            // 
            // tb_Title
            // 
            this.tb_Title.Location = new System.Drawing.Point(96, 12);
            this.tb_Title.Name = "tb_Title";
            this.tb_Title.Size = new System.Drawing.Size(194, 20);
            this.tb_Title.TabIndex = 1;
            // 
            // tb_Author
            // 
            this.tb_Author.Location = new System.Drawing.Point(96, 38);
            this.tb_Author.Name = "tb_Author";
            this.tb_Author.Size = new System.Drawing.Size(194, 20);
            this.tb_Author.TabIndex = 3;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(12, 41);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(32, 13);
            this.label2.TabIndex = 2;
            this.label2.Text = "Autor";
            // 
            // tb_Publisher
            // 
            this.tb_Publisher.Location = new System.Drawing.Point(96, 64);
            this.tb_Publisher.Name = "tb_Publisher";
            this.tb_Publisher.Size = new System.Drawing.Size(194, 20);
            this.tb_Publisher.TabIndex = 5;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(12, 67);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(55, 13);
            this.label3.TabIndex = 4;
            this.label3.Text = "Wydawca";
            // 
            // tb_ISBN
            // 
            this.tb_ISBN.Location = new System.Drawing.Point(96, 90);
            this.tb_ISBN.Name = "tb_ISBN";
            this.tb_ISBN.Size = new System.Drawing.Size(194, 20);
            this.tb_ISBN.TabIndex = 7;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(12, 93);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(32, 13);
            this.label4.TabIndex = 6;
            this.label4.Text = "ISBN";
            // 
            // tb_Year
            // 
            this.tb_Year.Location = new System.Drawing.Point(96, 116);
            this.tb_Year.Name = "tb_Year";
            this.tb_Year.Size = new System.Drawing.Size(80, 20);
            this.tb_Year.TabIndex = 9;
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(12, 119);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(27, 13);
            this.label5.TabIndex = 8;
            this.label5.Text = "Rok";
            // 
            // tb_Pagecount
            // 
            this.tb_Pagecount.Location = new System.Drawing.Point(96, 142);
            this.tb_Pagecount.Name = "tb_Pagecount";
            this.tb_Pagecount.Size = new System.Drawing.Size(80, 20);
            this.tb_Pagecount.TabIndex = 11;
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(12, 145);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(55, 13);
            this.label6.TabIndex = 10;
            this.label6.Text = "Ilość stron";
            // 
            // btn_Add
            // 
            this.btn_Add.Location = new System.Drawing.Point(182, 116);
            this.btn_Add.Name = "btn_Add";
            this.btn_Add.Size = new System.Drawing.Size(108, 49);
            this.btn_Add.TabIndex = 12;
            this.btn_Add.Text = "Dodaj";
            this.btn_Add.UseVisualStyleBackColor = true;
            this.btn_Add.Click += new System.EventHandler(this.btn_Add_Click);
            // 
            // AddBook
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(305, 178);
            this.Controls.Add(this.btn_Add);
            this.Controls.Add(this.tb_Pagecount);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.tb_Year);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.tb_ISBN);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.tb_Publisher);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.tb_Author);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.tb_Title);
            this.Controls.Add(this.label1);
            this.Name = "AddBook";
            this.Text = "AddBook";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox tb_Title;
        private System.Windows.Forms.TextBox tb_Author;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox tb_Publisher;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox tb_ISBN;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox tb_Year;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.TextBox tb_Pagecount;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Button btn_Add;
    }
}