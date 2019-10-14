using BusSystem.JavaBusService;
using System;
using System.Windows.Forms;

namespace BusSystem
{
    public partial class MainWindow : Form
    {
        DataBase1Client client;

        public MainWindow()
        {
            InitializeComponent();
            client = new DataBase1Client();
        }

        private void ButtonDriverSession_Click(object sender, EventArgs e)
        {
            new DriverSession(client).Show();
        }

        private void ButtonTable_Click(object sender, EventArgs e)
        {
            new DisplayTable(client).Show();
        }
    }
}
