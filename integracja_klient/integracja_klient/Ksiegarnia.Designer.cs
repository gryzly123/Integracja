namespace integracja_klient
{
    partial class Ksiegarnia
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
            this.cb_SearchCriteria = new System.Windows.Forms.ComboBox();
            this.tb_SearchQuery = new System.Windows.Forms.TextBox();
            this.btn_SearchButton = new System.Windows.Forms.Button();
            this.dgv_Results = new System.Windows.Forms.DataGridView();
            ((System.ComponentModel.ISupportInitialize)(this.dgv_Results)).BeginInit();
            this.SuspendLayout();
            // 
            // cb_SearchCriteria
            // 
            this.cb_SearchCriteria.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.cb_SearchCriteria.FormattingEnabled = true;
            this.cb_SearchCriteria.Items.AddRange(new object[] {
            "Tytuł",
            "Autor",
            "ISBN"});
            this.cb_SearchCriteria.Location = new System.Drawing.Point(12, 12);
            this.cb_SearchCriteria.Name = "cb_SearchCriteria";
            this.cb_SearchCriteria.Size = new System.Drawing.Size(137, 21);
            this.cb_SearchCriteria.TabIndex = 0;
            // 
            // tb_SearchQuery
            // 
            this.tb_SearchQuery.Location = new System.Drawing.Point(155, 13);
            this.tb_SearchQuery.Name = "tb_SearchQuery";
            this.tb_SearchQuery.Size = new System.Drawing.Size(231, 20);
            this.tb_SearchQuery.TabIndex = 1;
            // 
            // btn_SearchButton
            // 
            this.btn_SearchButton.Location = new System.Drawing.Point(392, 10);
            this.btn_SearchButton.Name = "btn_SearchButton";
            this.btn_SearchButton.Size = new System.Drawing.Size(75, 23);
            this.btn_SearchButton.TabIndex = 2;
            this.btn_SearchButton.Text = "Szukaj";
            this.btn_SearchButton.UseVisualStyleBackColor = true;
            this.btn_SearchButton.Click += new System.EventHandler(this.btn_SearchButton_Click);
            // 
            // dgv_Results
            // 
            this.dgv_Results.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dgv_Results.Location = new System.Drawing.Point(12, 39);
            this.dgv_Results.Name = "dgv_Results";
            this.dgv_Results.Size = new System.Drawing.Size(455, 278);
            this.dgv_Results.TabIndex = 3;
            // 
            // Ksiegarnia
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(479, 329);
            this.Controls.Add(this.dgv_Results);
            this.Controls.Add(this.btn_SearchButton);
            this.Controls.Add(this.tb_SearchQuery);
            this.Controls.Add(this.cb_SearchCriteria);
            this.Name = "Ksiegarnia";
            this.Text = "Księgarnia";
            ((System.ComponentModel.ISupportInitialize)(this.dgv_Results)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ComboBox cb_SearchCriteria;
        private System.Windows.Forms.TextBox tb_SearchQuery;
        private System.Windows.Forms.Button btn_SearchButton;
        private System.Windows.Forms.DataGridView dgv_Results;
    }
}

