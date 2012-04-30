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
@Table(name = "patient")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Patient.findAll", query = "SELECT p FROM Patient p"),
    @NamedQuery(name = "Patient.findByMobileNumber", query = "SELECT p FROM Patient p WHERE p.mobileNumber = :mobileNumber"),
    @NamedQuery(name = "Patient.findByDiseaseName", query = "SELECT p FROM Patient p WHERE p.diseaseName = :diseaseName"),
    @NamedQuery(name = "Patient.findByDescription", query = "SELECT p FROM Patient p WHERE p.description = :description")})
public class Patient implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "mobileNumber")
    private Integer mobileNumber;
    @Size(max = 50)
    @Column(name = "diseaseName")
    private String diseaseName;
    @Size(max = 250)
    @Column(name = "description")
    private String description;
    @JoinColumn(name = "mobileNumber", referencedColumnName = "mobileNumber", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Publicuser publicuser;

    public Patient() {
    }

    public Patient(Integer mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Integer getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Integer mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        if (!(object instanceof Patient)) {
            return false;
        }
        Patient other = (Patient) object;
        if ((this.mobileNumber == null && other.mobileNumber != null) || (this.mobileNumber != null && !this.mobileNumber.equals(other.mobileNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Patient[ mobileNumber=" + mobileNumber + " ]";
    }
    
}
