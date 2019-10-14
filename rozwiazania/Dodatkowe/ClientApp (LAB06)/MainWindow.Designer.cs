namespace BusSystem
{
    partial class MainWindow
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
            this.ButtonDriverSession = new System.Windows.Forms.Button();
            this.ButtonTable = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // ButtonDriverSession
            // 
            this.ButtonDriverSession.Location = new System.Drawing.Point(12, 11);
            this.ButtonDriverSession.Name = "ButtonDriverSession";
            this.ButtonDriverSession.Size = new System.Drawing.Size(133, 50);
            this.ButtonDriverSession.TabIndex = 1;
            this.ButtonDriverSession.Text = "Create driver session";
            this.ButtonDriverSession.UseVisualStyleBackColor = true;
            this.ButtonDriverSession.Click += new System.EventHandler(this.ButtonDriverSession_Click);
            // 
            // ButtonTable
            // 
            this.ButtonTable.Location = new System.Drawing.Point(151, 11);
            this.ButtonTable.Name = "ButtonTable";
            this.ButtonTable.Size = new System.Drawing.Size(133, 50);
            this.ButtonTable.TabIndex = 2;
            this.ButtonTable.Text = "Create bus stop table";
            this.ButtonTable.UseVisualStyleBackColor = true;
            this.ButtonTable.Click += new System.EventHandler(this.ButtonTable_Click);
            // 
            // MainWindow
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(303, 73);
            this.Controls.Add(this.ButtonTable);
            this.Controls.Add(this.ButtonDriverSession);
            this.Name = "MainWindow";
            this.Text = "Bus system";
            this.ResumeLayout(false);

        }

        #endregion
        private System.Windows.Forms.Button ButtonDriverSession;
        private System.Windows.Forms.Button ButtonTable;
    }
}

