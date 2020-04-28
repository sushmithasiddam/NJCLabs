/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sushmitha
 */
@Entity
@Table(name = "PROPERTY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Property.findAll", query = "SELECT p FROM Property p")
    , @NamedQuery(name = "Property.findByPropertyid", query = "SELECT p FROM Property p WHERE p.propertyid = :propertyid")
    , @NamedQuery(name = "Property.findByAddress", query = "SELECT p FROM Property p WHERE p.address = :address")
    , @NamedQuery(name = "Property.findByNumberofbedrooms", query = "SELECT p FROM Property p WHERE p.numberofbedrooms = :numberofbedrooms")
    , @NamedQuery(name = "Property.findByPrice", query = "SELECT p FROM Property p WHERE p.price = :price")})
public class Property implements Serializable {

    private static final long serialVersionUID = 1L;
    public static final String FIND_ALL = "Property.findAll";
    
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PROPERTYID")
    private Integer propertyid;
    @Size(max = 255)
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "NUMBEROFBEDROOMS")
    private Integer numberofbedrooms;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRICE")
    private Double price;

    public Property() {
    }

    public Property(Integer propertyid) {
        this.propertyid = propertyid;
    }

    public Integer getPropertyid() {
        return propertyid;
    }

    public void setPropertyid(Integer propertyid) {
        this.propertyid = propertyid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getNumberofbedrooms() {
        return numberofbedrooms;
    }

    public void setNumberofbedrooms(Integer numberofbedrooms) {
        this.numberofbedrooms = numberofbedrooms;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (propertyid != null ? propertyid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Property)) {
            return false;
        }
        Property other = (Property) object;
        if ((this.propertyid == null && other.propertyid != null) || (this.propertyid != null && !this.propertyid.equals(other.propertyid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Property Id: " + propertyid + "\nProperty Address: " +address+ "\nNumber of Bedrooms: "+numberofbedrooms+"\nPrice: "+price+"\n\n";
    }
    
}
