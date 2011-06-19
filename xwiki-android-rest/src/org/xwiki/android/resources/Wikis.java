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
 *         &lt;element name="wiki" type="{http://www.xwiki.org}Wiki" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
/*
 * //@XmlAccessorType(XmlAccessType.FIELD) //@XmlType(name = "", propOrder = { "wikis" }) //@XmlRootElement(name =
 * "wikis")
 */
public class Wikis extends LinkCollection
{

    // @XmlElement(name = "wiki")
    public List<Wiki> wikis;

    /**
     * Gets the value of the wikis property.
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
     * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the wikis property.
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getWikis().add(newItem);
     * </pre>
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Wiki }
     */
    public List<Wiki> getWikis()
    {
        if (wikis == null) {
            wikis = new ArrayList<Wiki>();
        }
        return this.wikis;
    }

    public Wikis withWikis(Wiki... values)
    {
        if (values != null) {
            for (Wiki value : values) {
                getWikis().add(value);
            }
        }
        return this;
    }

    public Wikis withWikis(Collection<Wiki> values)
    {
        if (values != null) {
            getWikis().addAll(values);
        }
        return this;
    }

    @Override
    public Wikis withLinks(Link... values)
    {
        if (values != null) {
            for (Link value : values) {
                getLinks().add(value);
            }
        }
        return this;
    }

    @Override
    public Wikis withLinks(Collection<Link> values)
    {
        if (values != null) {
            getLinks().addAll(values);
        }
        return this;
    }

}
