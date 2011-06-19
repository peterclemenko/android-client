//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.02 at 07:04:45 PM IST 
//

package org.xwiki.android.resources;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 import javax.xml.bind.annotation.XmlAccessType;
 import javax.xml.bind.annotation.XmlAccessorType;
 import javax.xml.bind.annotation.XmlAttribute;
 import javax.xml.bind.annotation.XmlElement;
 import javax.xml.bind.annotation.XmlRootElement;
 import javax.xml.bind.annotation.XmlType;
 */

/**
 * <p>
 * Java class for anonymous complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xwiki.org}LinkCollection">
 *       &lt;sequence>
 *         &lt;element name="searchResult" type="{http://www.xwiki.org}SearchResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="template" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
/*
 * //@XmlAccessorType(XmlAccessType.FIELD) //@XmlType(name = "", propOrder = { "searchResults" }) //@XmlRootElement(name
 * = "searchResults")
 */
public class SearchResults extends LinkCollection
{

    // @XmlElement(name = "searchResult")
    public List<SearchResult> searchResults;

    // @XmlAttribute
    public String template;

    /**
     * Gets the value of the searchResults property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
     * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the searchResults property.
     * <p>
     * For example, to add a new item, do as follows:s
     * 
     * <pre>
     * getSearchResults().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link SearchResult }
     */
    public List<SearchResult> getSearchResults()
    {
        if (searchResults == null) {
            searchResults = new ArrayList<SearchResult>();
        }
        return this.searchResults;
    }

    /**
     * Gets the value of the template property.
     * 
     * @return possible object is {@link String }
     */
    public String getTemplate()
    {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTemplate(String value)
    {
        this.template = value;
    }

    public SearchResults withSearchResults(SearchResult... values)
    {
        if (values != null) {
            for (SearchResult value : values) {
                getSearchResults().add(value);
            }
        }
        return this;
    }

    public SearchResults withSearchResults(Collection<SearchResult> values)
    {
        if (values != null) {
            getSearchResults().addAll(values);
        }
        return this;
    }

    public SearchResults withTemplate(String value)
    {
        setTemplate(value);
        return this;
    }

    @Override
    public SearchResults withLinks(Link... values)
    {
        if (values != null) {
            for (Link value : values) {
                getLinks().add(value);
            }
        }
        return this;
    }

    @Override
    public SearchResults withLinks(Collection<Link> values)
    {
        if (values != null) {
            getLinks().addAll(values);
        }
        return this;
    }

}
