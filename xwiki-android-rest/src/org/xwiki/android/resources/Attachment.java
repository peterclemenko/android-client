//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.02 at 07:04:45 PM IST 
//

package org.xwiki.android.resources;

import java.util.Calendar;
import java.util.Collection;

/*
 import javax.xml.bind.annotation.XmlAccessType;
 import javax.xml.bind.annotation.XmlAccessorType;
 import javax.xml.bind.annotation.XmlElement;
 import javax.xml.bind.annotation.XmlRootElement;
 import javax.xml.bind.annotation.XmlSchemaType;
 import javax.xml.bind.annotation.XmlType;
 import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
 */

/**
 * <p>
 * Java class for Attachment complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Attachment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xwiki.org}LinkCollection">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pageId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pageVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mimeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="xwikiRelativeUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="xwikiAbsoluteUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
/*
 * //@XmlAccessorType(XmlAccessType.FIELD) //@XmlType(name = "Attachment", propOrder = { "id", "name", "size",
 * "version", "pageId", "pageVersion", "mimeType", "author", "date", "xwikiRelativeUrl", "xwikiAbsoluteUrl" })
 * //@XmlRootElement(name = "attachment")
 */
public class Attachment extends LinkCollection
{

    // @XmlElement(required = true)
    public String id;

    // //@XmlElement(required = true)
    public String name;

    public int size;

    // @XmlElement(required = true)
    public String version;

    // @XmlElement(required = true)
    public String pageId;

    // @XmlElement(required = true)
    public String pageVersion;

    // @XmlElement(required = true)
    public String mimeType;

    // @XmlElement(required = true)
    public String author;

    // @XmlElement(required = true, type = String.class)
    // @XmlJavaTypeAdapter(Adapter1 .class)
    // @XmlSchemaType(name = "dateTime")
    public Calendar date;

    // @XmlElement(required = true)
    public String xwikiRelativeUrl;

    // @XmlElement(required = true)
    public String xwikiAbsoluteUrl;

    /**
     * Gets the value of the id property.
     * 
     * @return possible object is {@link String }
     */
    public String getId()
    {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setId(String value)
    {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return possible object is {@link String }
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setName(String value)
    {
        this.name = value;
    }

    /**
     * Gets the value of the size property.
     */
    public int getSize()
    {
        return size;
    }

    /**
     * Sets the value of the size property.
     */
    public void setSize(int value)
    {
        this.size = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return possible object is {@link String }
     */
    public String getVersion()
    {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setVersion(String value)
    {
        this.version = value;
    }

    /**
     * Gets the value of the pageId property.
     * 
     * @return possible object is {@link String }
     */
    public String getPageId()
    {
        return pageId;
    }

    /**
     * Sets the value of the pageId property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setPageId(String value)
    {
        this.pageId = value;
    }

    /**
     * Gets the value of the pageVersion property.
     * 
     * @return possible object is {@link String }
     */
    public String getPageVersion()
    {
        return pageVersion;
    }

    /**
     * Sets the value of the pageVersion property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setPageVersion(String value)
    {
        this.pageVersion = value;
    }

    /**
     * Gets the value of the mimeType property.
     * 
     * @return possible object is {@link String }
     */
    public String getMimeType()
    {
        return mimeType;
    }

    /**
     * Sets the value of the mimeType property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setMimeType(String value)
    {
        this.mimeType = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return possible object is {@link String }
     */
    public String getAuthor()
    {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setAuthor(String value)
    {
        this.author = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return possible object is {@link String }
     */
    public Calendar getDate()
    {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setDate(Calendar value)
    {
        this.date = value;
    }

    /**
     * Gets the value of the xwikiRelativeUrl property.
     * 
     * @return possible object is {@link String }
     */
    public String getXwikiRelativeUrl()
    {
        return xwikiRelativeUrl;
    }

    /**
     * Sets the value of the xwikiRelativeUrl property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setXwikiRelativeUrl(String value)
    {
        this.xwikiRelativeUrl = value;
    }

    /**
     * Gets the value of the xwikiAbsoluteUrl property.
     * 
     * @return possible object is {@link String }
     */
    public String getXwikiAbsoluteUrl()
    {
        return xwikiAbsoluteUrl;
    }

    /**
     * Sets the value of the xwikiAbsoluteUrl property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setXwikiAbsoluteUrl(String value)
    {
        this.xwikiAbsoluteUrl = value;
    }

    public Attachment withId(String value)
    {
        setId(value);
        return this;
    }

    public Attachment withName(String value)
    {
        setName(value);
        return this;
    }

    public Attachment withSize(int value)
    {
        setSize(value);
        return this;
    }

    public Attachment withVersion(String value)
    {
        setVersion(value);
        return this;
    }

    public Attachment withPageId(String value)
    {
        setPageId(value);
        return this;
    }

    public Attachment withPageVersion(String value)
    {
        setPageVersion(value);
        return this;
    }

    public Attachment withMimeType(String value)
    {
        setMimeType(value);
        return this;
    }

    public Attachment withAuthor(String value)
    {
        setAuthor(value);
        return this;
    }

    public Attachment withDate(Calendar value)
    {
        setDate(value);
        return this;
    }

    public Attachment withXwikiRelativeUrl(String value)
    {
        setXwikiRelativeUrl(value);
        return this;
    }

    public Attachment withXwikiAbsoluteUrl(String value)
    {
        setXwikiAbsoluteUrl(value);
        return this;
    }

    @Override
    public Attachment withLinks(Link... values)
    {
        if (values != null) {
            for (Link value : values) {
                getLinks().add(value);
            }
        }
        return this;
    }

    @Override
    public Attachment withLinks(Collection<Link> values)
    {
        if (values != null) {
            getLinks().addAll(values);
        }
        return this;
    }

}
