/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Bhatti
 */
@Entity
@Table(name = "users")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u"),
    @NamedQuery(name = "Users.findByMobileNumber", query = "SELECT u FROM Users u WHERE u.mobileNumber = :mobileNumber"),
    @NamedQuery(name = "Users.findByUserType", query = "SELECT u FROM Users u WHERE u.userType = :userType")})
public class Users implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "mobileNumber")
    private Integer mobileNumber;
    @Column(name = "UserType")
    private Integer userType;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "users")
    private Doctor doctor;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "users")
    private Staff staff;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "users")
    private Publicuser publicuser;

    public Users() {
    }

    public Users(Integer mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Integer getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Integer mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
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
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.mobileNumber == null && other.mobileNumber != null) || (this.mobileNumber != null && !this.mobileNumber.equals(other.mobileNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Users[ mobileNumber=" + mobileNumber + " ]";
    }
    
}
