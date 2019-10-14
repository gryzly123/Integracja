namespace BusSystem
{
    partial class DriverSession
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
            this.ListDrivers = new System.Windows.Forms.ComboBox();
            this.label1 = new System.Windows.Forms.Label();
            this.ListLines = new System.Windows.Forms.ComboBox();
            this.ButtonStart = new System.Windows.Forms.Button();
            this.label2 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.ButtonNextStop = new System.Windows.Forms.Button();
            this.LabelEstimatedDuration = new System.Windows.Forms.Label();
            this.LabelNextStop = new System.Windows.Forms.Label();
            this.LabelCurrentStop = new System.Windows.Forms.Label();
            this.label7 = new System.Windows.Forms.Label();
            this.ListBuses = new System.Windows.Forms.ComboBox();
            this.cbAB = new System.Windows.Forms.CheckBox();
            this.SuspendLayout();
            // 
            // ListDrivers
            // 
            this.ListDrivers.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.ListDrivers.FormattingEnabled = true;
            this.ListDrivers.Location = new System.Drawing.Point(118, 12);
            this.ListDrivers.Name = "ListDrivers";
            this.ListDrivers.Size = new System.Drawing.Size(228, 21);
            this.ListDrivers.TabIndex = 3;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(12, 15);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(38, 13);
            this.label1.TabIndex = 2;
            this.label1.Text = "Driver:";
            // 
            // ListLines
            // 
            this.ListLines.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.ListLines.FormattingEnabled = true;
            this.ListLines.Location = new System.Drawing.Point(118, 39);
            this.ListLines.Name = "ListLines";
            this.ListLines.Size = new System.Drawing.Size(179, 21);
            this.ListLines.TabIndex = 4;
            // 
            // ButtonStart
            // 
            this.ButtonStart.Location = new System.Drawing.Point(352, 11);
            this.ButtonStart.Name = "ButtonStart";
            this.ButtonStart.Size = new System.Drawing.Size(75, 77);
            this.ButtonStart.TabIndex = 6;
            this.ButtonStart.Text = "START";
            this.ButtonStart.UseVisualStyleBackColor = true;
            this.ButtonStart.Click += new System.EventHandler(this.ButtonStart_Click);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(12, 42);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(30, 13);
            this.label2.TabIndex = 7;
            this.label2.Text = "Line:";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(13, 157);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(67, 13);
            this.label4.TabIndex = 9;
            this.label4.Text = "Current stop:";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(13, 184);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(55, 13);
            this.label5.TabIndex = 10;
            this.label5.Text = "Next stop:";
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(12, 210);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(79, 13);
            this.label6.TabIndex = 11;
            this.label6.Text = "Next stop ETA:";
            // 
            // ButtonNextStop
            // 
            this.ButtonNextStop.Enabled = false;
            this.ButtonNextStop.Location = new System.Drawing.Point(352, 152);
            this.ButtonNextStop.Name = "ButtonNextStop";
            this.ButtonNextStop.Size = new System.Drawing.Size(75, 75);
            this.ButtonNextStop.TabIndex = 12;
            this.ButtonNextStop.Text = "NEXT";
            this.ButtonNextStop.UseVisualStyleBackColor = true;
            this.ButtonNextStop.Click += new System.EventHandler(this.ButtonNextStop_Click);
            // 
            // LabelEstimatedDuration
            // 
            this.LabelEstimatedDuration.AutoSize = true;
            this.LabelEstimatedDuration.Location = new System.Drawing.Point(202, 210);
            this.LabelEstimatedDuration.Name = "LabelEstimatedDuration";
            this.LabelEstimatedDuration.Size = new System.Drawing.Size(32, 13);
            this.LabelEstimatedDuration.TabIndex = 15;
            this.LabelEstimatedDuration.Text = "0 min";
            // 
            // LabelNextStop
            // 
            this.LabelNextStop.AutoSize = true;
            this.LabelNextStop.Location = new System.Drawing.Point(203, 184);
            this.LabelNextStop.Name = "LabelNextStop";
            this.LabelNextStop.Size = new System.Drawing.Size(10, 13);
            this.LabelNextStop.TabIndex = 14;
            this.LabelNextStop.Text = "-";
            // 
            // LabelCurrentStop
            // 
            this.LabelCurrentStop.AutoSize = true;
            this.LabelCurrentStop.Location = new System.Drawing.Point(203, 157);
            this.LabelCurrentStop.Name = "LabelCurrentStop";
            this.LabelCurrentStop.Size = new System.Drawing.Size(10, 13);
            this.LabelCurrentStop.TabIndex = 13;
            this.LabelCurrentStop.Text = "-";
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Location = new System.Drawing.Point(12, 69);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(28, 13);
            this.label7.TabIndex = 17;
            this.label7.Text = "Bus:";
            // 
            // ListBuses
            // 
            this.ListBuses.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.ListBuses.FormattingEnabled = true;
            this.ListBuses.Location = new System.Drawing.Point(118, 66);
            this.ListBuses.Name = "ListBuses";
            this.ListBuses.Size = new System.Drawing.Size(228, 21);
            this.ListBuses.TabIndex = 16;
            // 
            // cbAB
            // 
            this.cbAB.AutoSize = true;
            this.cbAB.Checked = true;
            this.cbAB.CheckState = System.Windows.Forms.CheckState.Checked;
            this.cbAB.Location = new System.Drawing.Point(304, 42);
            this.cbAB.Name = "cbAB";
            this.cbAB.Size = new System.Drawing.Size(40, 17);
            this.cbAB.TabIndex = 18;
            this.cbAB.Text = "AB";
            this.cbAB.UseVisualStyleBackColor = true;
            // 
            // DriverSession
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(435, 235);
            this.Controls.Add(this.cbAB);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.ListBuses);
            this.Controls.Add(this.LabelEstimatedDuration);
            this.Controls.Add(this.LabelNextStop);
            this.Controls.Add(this.LabelCurrentStop);
            this.Controls.Add(this.ButtonNextStop);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.ButtonStart);
            this.Controls.Add(this.ListLines);
            this.Controls.Add(this.ListDrivers);
            this.Controls.Add(this.label1);
            this.Name = "DriverSession";
            this.Text = "Driver session";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ComboBox ListDrivers;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.ComboBox ListLines;
        private System.Windows.Forms.Button ButtonStart;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Button ButtonNextStop;
        private System.Windows.Forms.Label LabelEstimatedDuration;
        private System.Windows.Forms.Label LabelNextStop;
        private System.Windows.Forms.Label LabelCurrentStop;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.ComboBox ListBuses;
        private System.Windows.Forms.CheckBox cbAB;
    }
}