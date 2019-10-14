using System;
using System.Windows.Forms;
using System.Threading.Tasks;
using BusSystem.JavaBusService;

namespace BusSystem
{
    public partial class DisplayTable : Form
    {
        DataBase1Client client;
        stop[] stops;
        int stopId = -1;

        public DisplayTable(DataBase1Client _client)
        {
            client = _client;
            InitializeComponent();

            Task<getStopsResponse> __stops = client.getStopsAsync();
            stops = __stops.Result.stop;

            foreach (stop s in stops)
                ListBusStops.Items.Add(s.name);
        }

        private void ListBusStops_SelectedIndexChanged(object sender, EventArgs e)
        {
            stopId = stops[ListBusStops.SelectedIndex].id;

            RefreshTableScreen();
            TimerDisplayRefresh.Start();
            ListBusStops.Enabled = false;
        }

        private void RefreshTableScreen()
        {
            busStopSearchResult[] results =  client.getStopResults(stopId);
            GridDisplayTable.DataSource = results;
        }

        private void TimerDisplayRefresh_Tick(object sender, EventArgs e)
        {
            Invoke(new Action(() => { RefreshTableScreen(); }));
        }

        private void DisplayTable_FormClosing(object sender, FormClosingEventArgs e)
        {
            TimerDisplayRefresh.Stop();
        }
    }
}
