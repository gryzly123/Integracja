using System;
using System.Windows.Forms;
using integracja_klient.JavaBooksService;

namespace integracja_klient
{
    public partial class Ksiegarnia : Form
    {
        BookManagerClient bookManager;

        public Ksiegarnia()
        {
            InitializeComponent();
            cb_SearchCriteria.SelectedIndex = 0;
            bookManager = new BookManagerClient();
        }

        private void btn_SearchButton_Click(object sender, EventArgs e)
        {
            book[] books = null;
            switch (cb_SearchCriteria.SelectedIndex)
            {
                case 0:
                    books = bookManager.searchByTitle(tb_SearchQuery.Text);
                    break;

                case 1:
                    books = bookManager.searchByAuthor(tb_SearchQuery.Text);
                    break;

                case 2:
                    book b = bookManager.searchByIsbn(tb_SearchQuery.Text);
                    if(b != null)
                    {
                        books = new book[1];
                        books[0] = b;
                    }
                    break;
            }
            if(books != null)
            {
                dgv_Results.DataSource = books;
            }
            else
            {
                dgv_Results.DataSource = null;
                MessageBox.Show("Search did not yield any results.");
            }
        }
    }
}
