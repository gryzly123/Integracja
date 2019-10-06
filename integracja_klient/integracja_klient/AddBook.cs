using System;
using System.Windows.Forms;
using integracja_klient.JavaBooksService;

namespace integracja_klient
{
    public partial class AddBook : Form
    {
        public AddBook(BookManagerClient client)
        {
            InitializeComponent();
            bmc = client;
        }

        BookManagerClient bmc;

        private void btn_Add_Click(object sender, EventArgs e)
        {
            try
            {
                Int32 pagecount = Int32.Parse(tb_Pagecount.Text);
                Int32 year = Int32.Parse(tb_Year.Text);

                book b = new book();
                b.title = tb_Title.Text;
                b.author = tb_Author.Text;
                b.isbn = tb_ISBN.Text;
                b.publisher = tb_Publisher.Text;
                b.pages = pagecount;
                b.year = year;
                b.id = b.author.Substring(0, 2) + b.title.Substring(0, 3);
                bmc.addBook(b);
                Close();
            }
            catch(System.Exception ex)
            {
                MessageBox.Show("Could not add book: \n" + ex.ToString());
            }
        }
    }
}
