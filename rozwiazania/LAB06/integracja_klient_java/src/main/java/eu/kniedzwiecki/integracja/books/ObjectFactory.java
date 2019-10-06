
package eu.kniedzwiecki.integracja.books;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.kniedzwiecki.integracja.books package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetBooks_QNAME = new QName("http://books.integracja.kniedzwiecki.eu/", "getBooks");
    private final static QName _AddBookResponse_QNAME = new QName("http://books.integracja.kniedzwiecki.eu/", "addBookResponse");
    private final static QName _SearchByIsbn_QNAME = new QName("http://books.integracja.kniedzwiecki.eu/", "searchByIsbn");
    private final static QName _AddBook_QNAME = new QName("http://books.integracja.kniedzwiecki.eu/", "addBook");
    private final static QName _SearchByIsbnResponse_QNAME = new QName("http://books.integracja.kniedzwiecki.eu/", "searchByIsbnResponse");
    private final static QName _SetBooks_QNAME = new QName("http://books.integracja.kniedzwiecki.eu/", "setBooks");
    private final static QName _SearchByTitleResponse_QNAME = new QName("http://books.integracja.kniedzwiecki.eu/", "searchByTitleResponse");
    private final static QName _Exception_QNAME = new QName("http://books.integracja.kniedzwiecki.eu/", "Exception");
    private final static QName _GetBooksResponse_QNAME = new QName("http://books.integracja.kniedzwiecki.eu/", "getBooksResponse");
    private final static QName _SearchByAuthor_QNAME = new QName("http://books.integracja.kniedzwiecki.eu/", "searchByAuthor");
    private final static QName _SetBooksResponse_QNAME = new QName("http://books.integracja.kniedzwiecki.eu/", "setBooksResponse");
    private final static QName _SearchByAuthorResponse_QNAME = new QName("http://books.integracja.kniedzwiecki.eu/", "searchByAuthorResponse");
    private final static QName _SearchByTitle_QNAME = new QName("http://books.integracja.kniedzwiecki.eu/", "searchByTitle");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.kniedzwiecki.integracja.books
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBooks }
     * 
     */
    public GetBooks createGetBooks() {
        return new GetBooks();
    }

    /**
     * Create an instance of {@link AddBookResponse }
     * 
     */
    public AddBookResponse createAddBookResponse() {
        return new AddBookResponse();
    }

    /**
     * Create an instance of {@link SearchByIsbn }
     * 
     */
    public SearchByIsbn createSearchByIsbn() {
        return new SearchByIsbn();
    }

    /**
     * Create an instance of {@link AddBook }
     * 
     */
    public AddBook createAddBook() {
        return new AddBook();
    }

    /**
     * Create an instance of {@link SearchByIsbnResponse }
     * 
     */
    public SearchByIsbnResponse createSearchByIsbnResponse() {
        return new SearchByIsbnResponse();
    }

    /**
     * Create an instance of {@link SetBooks }
     * 
     */
    public SetBooks createSetBooks() {
        return new SetBooks();
    }

    /**
     * Create an instance of {@link SearchByTitleResponse }
     * 
     */
    public SearchByTitleResponse createSearchByTitleResponse() {
        return new SearchByTitleResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link GetBooksResponse }
     * 
     */
    public GetBooksResponse createGetBooksResponse() {
        return new GetBooksResponse();
    }

    /**
     * Create an instance of {@link SearchByAuthor }
     * 
     */
    public SearchByAuthor createSearchByAuthor() {
        return new SearchByAuthor();
    }

    /**
     * Create an instance of {@link SetBooksResponse }
     * 
     */
    public SetBooksResponse createSetBooksResponse() {
        return new SetBooksResponse();
    }

    /**
     * Create an instance of {@link SearchByAuthorResponse }
     * 
     */
    public SearchByAuthorResponse createSearchByAuthorResponse() {
        return new SearchByAuthorResponse();
    }

    /**
     * Create an instance of {@link SearchByTitle }
     * 
     */
    public SearchByTitle createSearchByTitle() {
        return new SearchByTitle();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://books.integracja.kniedzwiecki.eu/", name = "getBooks")
    public JAXBElement<GetBooks> createGetBooks(GetBooks value) {
        return new JAXBElement<GetBooks>(_GetBooks_QNAME, GetBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://books.integracja.kniedzwiecki.eu/", name = "addBookResponse")
    public JAXBElement<AddBookResponse> createAddBookResponse(AddBookResponse value) {
        return new JAXBElement<AddBookResponse>(_AddBookResponse_QNAME, AddBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByIsbn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://books.integracja.kniedzwiecki.eu/", name = "searchByIsbn")
    public JAXBElement<SearchByIsbn> createSearchByIsbn(SearchByIsbn value) {
        return new JAXBElement<SearchByIsbn>(_SearchByIsbn_QNAME, SearchByIsbn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://books.integracja.kniedzwiecki.eu/", name = "addBook")
    public JAXBElement<AddBook> createAddBook(AddBook value) {
        return new JAXBElement<AddBook>(_AddBook_QNAME, AddBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByIsbnResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://books.integracja.kniedzwiecki.eu/", name = "searchByIsbnResponse")
    public JAXBElement<SearchByIsbnResponse> createSearchByIsbnResponse(SearchByIsbnResponse value) {
        return new JAXBElement<SearchByIsbnResponse>(_SearchByIsbnResponse_QNAME, SearchByIsbnResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetBooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://books.integracja.kniedzwiecki.eu/", name = "setBooks")
    public JAXBElement<SetBooks> createSetBooks(SetBooks value) {
        return new JAXBElement<SetBooks>(_SetBooks_QNAME, SetBooks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByTitleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://books.integracja.kniedzwiecki.eu/", name = "searchByTitleResponse")
    public JAXBElement<SearchByTitleResponse> createSearchByTitleResponse(SearchByTitleResponse value) {
        return new JAXBElement<SearchByTitleResponse>(_SearchByTitleResponse_QNAME, SearchByTitleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://books.integracja.kniedzwiecki.eu/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBooksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://books.integracja.kniedzwiecki.eu/", name = "getBooksResponse")
    public JAXBElement<GetBooksResponse> createGetBooksResponse(GetBooksResponse value) {
        return new JAXBElement<GetBooksResponse>(_GetBooksResponse_QNAME, GetBooksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByAuthor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://books.integracja.kniedzwiecki.eu/", name = "searchByAuthor")
    public JAXBElement<SearchByAuthor> createSearchByAuthor(SearchByAuthor value) {
        return new JAXBElement<SearchByAuthor>(_SearchByAuthor_QNAME, SearchByAuthor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetBooksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://books.integracja.kniedzwiecki.eu/", name = "setBooksResponse")
    public JAXBElement<SetBooksResponse> createSetBooksResponse(SetBooksResponse value) {
        return new JAXBElement<SetBooksResponse>(_SetBooksResponse_QNAME, SetBooksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByAuthorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://books.integracja.kniedzwiecki.eu/", name = "searchByAuthorResponse")
    public JAXBElement<SearchByAuthorResponse> createSearchByAuthorResponse(SearchByAuthorResponse value) {
        return new JAXBElement<SearchByAuthorResponse>(_SearchByAuthorResponse_QNAME, SearchByAuthorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByTitle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://books.integracja.kniedzwiecki.eu/", name = "searchByTitle")
    public JAXBElement<SearchByTitle> createSearchByTitle(SearchByTitle value) {
        return new JAXBElement<SearchByTitle>(_SearchByTitle_QNAME, SearchByTitle.class, null, value);
    }

}
