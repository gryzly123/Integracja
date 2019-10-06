
package eu.kniedzwiecki.integracja.books;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchByAuthor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchByAuthor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="book_author" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchByAuthor", propOrder = {
    "bookAuthor"
})
public class SearchByAuthor {

    @XmlElement(name = "book_author")
    protected String bookAuthor;

    /**
     * Gets the value of the bookAuthor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookAuthor() {
        return bookAuthor;
    }

    /**
     * Sets the value of the bookAuthor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookAuthor(String value) {
        this.bookAuthor = value;
    }

}
