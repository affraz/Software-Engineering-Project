/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Bhatti
 */
@Entity
@Table(name = "vaccination")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vaccination.findAll", query = "SELECT v FROM Vaccination v"),
    @NamedQuery(name = "Vaccination.findByMobileNumber", query = "SELECT v FROM Vaccination v WHERE v.mobileNumber = :mobileNumber"),
    @NamedQuery(name = "Vaccination.findByPolio", query = "SELECT v FROM Vaccination v WHERE v.polio = :polio"),
    @NamedQuery(name = "Vaccination.findByMeasles", query = "SELECT v FROM Vaccination v WHERE v.measles = :measles"),
    @NamedQuery(name = "Vaccination.findByTb", query = "SELECT v FROM Vaccination v WHERE v.tb = :tb")})
public class Vaccination implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "mobileNumber")
    private Integer mobileNumber;
    @Size(max = 20)
    @Column(name = "polio")
    private String polio;
    @Size(max = 20)
    @Column(name = "measles")
    private String measles;
    @Size(max = 20)
    @Column(name = "tb")
    private String tb;
    @JoinColumn(name = "mobileNumber", referencedColumnName = "mobileNumber", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Publicuser publicuser;

    public Vaccination() {
    }

    public Vaccination(Integer mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Integer getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Integer mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPolio() {
        return polio;
    }

    public void setPolio(String polio) {
        this.polio = polio;
    }

    public String getMeasles() {
        return measles;
    }

    public void setMeasles(String measles) {
        this.measles = measles;
    }

    public String getTb() {
        return tb;
    }

    public void setTb(String tb) {
        this.tb = tb;
    }

    public Publicuser getPublicuser() {
        return publicuser;
    }

    public void setPublicuser(Publicuser publicuser) {
        this.publicuser = publicuser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mobileNumber != null ? mobileNumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vaccination)) {
            return false;
        }
        Vaccination other = (Vaccination) object;
        if ((this.mobileNumber == null && other.mobileNumber != null) || (this.mobileNumber != null && !this.mobileNumber.equals(other.mobileNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Vaccination[ mobileNumber=" + mobileNumber + " ]";
    }
    
}
