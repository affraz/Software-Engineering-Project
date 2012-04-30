/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Bhatti
 */
@Entity
@Table(name = "pregnancy")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pregnancy.findAll", query = "SELECT p FROM Pregnancy p"),
    @NamedQuery(name = "Pregnancy.findByMobileNumber", query = "SELECT p FROM Pregnancy p WHERE p.mobileNumber = :mobileNumber"),
    @NamedQuery(name = "Pregnancy.findByStage", query = "SELECT p FROM Pregnancy p WHERE p.stage = :stage"),
    @NamedQuery(name = "Pregnancy.findByDuration", query = "SELECT p FROM Pregnancy p WHERE p.duration = :duration")})
public class Pregnancy implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "mobileNumber")
    private Integer mobileNumber;
    @Column(name = "stage")
    private Integer stage;
    @Column(name = "duration")
    @Temporal(TemporalType.DATE)
    private Date duration;
    @JoinColumn(name = "mobileNumber", referencedColumnName = "mobileNumber", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Publicuser publicuser;

    public Pregnancy() {
    }

    public Pregnancy(Integer mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Integer getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Integer mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Integer getStage() {
        return stage;
    }

    public void setStage(Integer stage) {
        this.stage = stage;
    }

    public Date getDuration() {
        return duration;
    }

    public void setDuration(Date duration) {
        this.duration = duration;
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
        if (!(object instanceof Pregnancy)) {
            return false;
        }
        Pregnancy other = (Pregnancy) object;
        if ((this.mobileNumber == null && other.mobileNumber != null) || (this.mobileNumber != null && !this.mobileNumber.equals(other.mobileNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Pregnancy[ mobileNumber=" + mobileNumber + " ]";
    }
    
}
