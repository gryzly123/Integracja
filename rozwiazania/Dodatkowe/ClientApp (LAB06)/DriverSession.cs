using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Windows.Forms;
using BusSystem.JavaBusService;

namespace BusSystem
{
    public partial class DriverSession : Form
    {
        DataBase1Client client;

        driver[] drivers;
        bus[] buses;
        line[] lines;
        stop[] stops;
        int runId = -1;
        int currentStop = -2;

        public DriverSession(DataBase1Client _client)
        {
            client = _client;

            InitializeComponent();

            Task<getDriversResponse> __drivers = client.getDriversAsync();
            Task<getBusesResponse  > __buses = client.getBusesAsync();
            Task<getLinesResponse  > __lines = client.getLinesAsync();
            Task<getStopsResponse  > __stops = client.getStopsAsync();
            drivers = __drivers.Result.driver;
            buses = __buses.Result.bus;
            lines = __lines.Result.line;
            stops = __stops.Result.stop;

            if (drivers.Length == 0) { MessageBox.Show("No drivers found. Can't proceed"); Close(); }
            if (buses.Length == 0)   { MessageBox.Show("No buses found. Can't proceed");   Close(); }
            if (lines.Length == 0)   { MessageBox.Show("No lines found. Can't proceed");   Close(); }

            foreach (driver d in drivers)
                ListDrivers.Items.Add(string.Format("{0} {1}", d.firstName, d.lastName));

            foreach (line l in lines)
                ListLines.Items.Add(string.Format("{0}: {1} - {2}", l.name, getStopName(l.stops.First().a), getStopName(l.stops.Last().b)));

            foreach (bus b in buses)
                ListBuses.Items.Add(string.Format("#{0}: {1} {2}", b.id, b.brand, b.model));

            ListDrivers.SelectedIndex = 0;
            ListLines.SelectedIndex = 0;
            ListBuses.SelectedIndex = 0;
        }

        private string getStopName(int stopId)
        {
            foreach (stop s in stops)
            {
                if (s.id == stopId) return s.name;
            }
            return "";
        }

        private void ButtonStart_Click(object sender, EventArgs e)
        {
            runId = client.createRun(
                drivers[ListDrivers.SelectedIndex].id,
                buses[ListBuses.SelectedIndex].id,
                lines[ListLines.SelectedIndex].id,
                cbAB.Checked);

            if (runId < 0) return;

            ButtonNextStop.Enabled = true;
            ButtonStart.Enabled = false;
            ListDrivers.Enabled = false;
            ListLines.Enabled = false;
            ListBuses.Enabled = false;

            currentStop = cbAB.Checked ? 0 : lines[ListLines.SelectedIndex].stops.Length - 1;

            UpdateStops();
        }

        private void UpdateStops()
        {
            bool DirAB = cbAB.Checked;

            connection currentStopRef = null;

            if (DirAB && currentStop == lines[ListLines.SelectedIndex].stops.Length)
            {
                currentStopRef = lines[ListLines.SelectedIndex].stops[currentStop - 1];
                LabelCurrentStop.Text = getStopName(currentStopRef.b);
                LabelNextStop.Text = "-";
                LabelEstimatedDuration.Text = "0 min";
                return;
            }

            if (!DirAB && currentStop < 0)
            {
                currentStopRef = lines[ListLines.SelectedIndex].stops[0];
                LabelCurrentStop.Text = getStopName(currentStopRef.a);
                LabelNextStop.Text = "-";
                LabelEstimatedDuration.Text = "0 min";
                return;
            }

            currentStopRef = lines[ListLines.SelectedIndex].stops[currentStop];
            LabelCurrentStop.Text = DirAB ? getStopName(currentStopRef.a) : getStopName(currentStopRef.b);
            LabelNextStop.Text = DirAB ? getStopName(currentStopRef.b) : getStopName(currentStopRef.a);
            LabelEstimatedDuration.Text = string.Format("{0} min",
                (DirAB ? currentStopRef.timeAB : currentStopRef.timeBA));
        }

        private void ButtonNextStop_Click(object sender, EventArgs e)
        {
            if(!client.incrementRunStop(runId))
            {
                MessageBox.Show("Kurs ukończony!");
                Close();
            }
            else
            {
                currentStop += cbAB.Checked ? 1 : -1;
                UpdateStops();
            }
        }
    }
}
