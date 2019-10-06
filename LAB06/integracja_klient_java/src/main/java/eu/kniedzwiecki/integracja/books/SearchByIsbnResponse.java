
package eu.kniedzwiecki.integracja.books;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchByIsbnResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchByIsbnResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="matched_book" type="{http://books.integracja.kniedzwiecki.eu/}book" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchByIsbnResponse", propOrder = {
    "matchedBook"
})
public class SearchByIsbnResponse {

    @XmlElement(name = "matched_book")
    protected Book matchedBook;

    /**
     * Gets the value of the matchedBook property.
     * 
     * @return
     *     possible object is
     *     {@link Book }
     *     
     */
    public Book getMatchedBook() {
        return matchedBook;
    }

    /**
     * Sets the value of the matchedBook property.
     * 
     * @param value
     *     allowed object is
     *     {@link Book }
     *     
     */
    public void setMatchedBook(Book value) {
        this.matchedBook = value;
    }

}
