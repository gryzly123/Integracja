namespace BusSystem
{
    partial class DisplayTable
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
            this.components = new System.ComponentModel.Container();
            this.label1 = new System.Windows.Forms.Label();
            this.ListBusStops = new System.Windows.Forms.ComboBox();
            this.GridDisplayTable = new System.Windows.Forms.DataGridView();
            this.TimerDisplayRefresh = new System.Windows.Forms.Timer(this.components);
            ((System.ComponentModel.ISupportInitialize)(this.GridDisplayTable)).BeginInit();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(12, 15);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(63, 13);
            this.label1.TabIndex = 0;
            this.label1.Text = "Select stop:";
            // 
            // ListBusStops
            // 
            this.ListBusStops.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.ListBusStops.FormattingEnabled = true;
            this.ListBusStops.Location = new System.Drawing.Point(120, 12);
            this.ListBusStops.Name = "ListBusStops";
            this.ListBusStops.Size = new System.Drawing.Size(228, 21);
            this.ListBusStops.TabIndex = 1;
            this.ListBusStops.SelectedIndexChanged += new System.EventHandler(this.ListBusStops_SelectedIndexChanged);
            // 
            // GridDisplayTable
            // 
            this.GridDisplayTable.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.GridDisplayTable.Enabled = false;
            this.GridDisplayTable.Location = new System.Drawing.Point(12, 39);
            this.GridDisplayTable.Name = "GridDisplayTable";
            this.GridDisplayTable.Size = new System.Drawing.Size(336, 194);
            this.GridDisplayTable.TabIndex = 2;
            // 
            // TimerDisplayRefresh
            // 
            this.TimerDisplayRefresh.Interval = 5000;
            this.TimerDisplayRefresh.Tick += new System.EventHandler(this.TimerDisplayRefresh_Tick);
            // 
            // DisplayTable
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(359, 245);
            this.Controls.Add(this.GridDisplayTable);
            this.Controls.Add(this.ListBusStops);
            this.Controls.Add(this.label1);
            this.Name = "DisplayTable";
            this.Text = "Bus Stop display table";
            this.FormClosing += new System.Windows.Forms.FormClosingEventHandler(this.DisplayTable_FormClosing);
            ((System.ComponentModel.ISupportInitialize)(this.GridDisplayTable)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.ComboBox ListBusStops;
        private System.Windows.Forms.DataGridView GridDisplayTable;
        private System.Windows.Forms.Timer TimerDisplayRefresh;
    }
}