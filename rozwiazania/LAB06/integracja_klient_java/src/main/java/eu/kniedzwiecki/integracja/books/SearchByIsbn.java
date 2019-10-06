
package eu.kniedzwiecki.integracja.books;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchByIsbn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchByIsbn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="book_isbn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchByIsbn", propOrder = {
    "bookIsbn"
})
public class SearchByIsbn {

    @XmlElement(name = "book_isbn")
    protected String bookIsbn;

    /**
     * Gets the value of the bookIsbn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookIsbn() {
        return bookIsbn;
    }

    /**
     * Sets the value of the bookIsbn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookIsbn(String value) {
        this.bookIsbn = value;
    }

}
