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
@Table(name = "staff")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Staff.findAll", query = "SELECT s FROM Staff s"),
    @NamedQuery(name = "Staff.findByMobileNumber", query = "SELECT s FROM Staff s WHERE s.mobileNumber = :mobileNumber"),
    @NamedQuery(name = "Staff.findByName", query = "SELECT s FROM Staff s WHERE s.name = :name"),
    @NamedQuery(name = "Staff.findByAddress", query = "SELECT s FROM Staff s WHERE s.address = :address"),
    @NamedQuery(name = "Staff.findByGender", query = "SELECT s FROM Staff s WHERE s.gender = :gender"),
    @NamedQuery(name = "Staff.findByDesignation", query = "SELECT s FROM Staff s WHERE s.designation = :designation"),
    @NamedQuery(name = "Staff.findByDepartment", query = "SELECT s FROM Staff s WHERE s.department = :department")})
public class Staff implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "mobileNumber")
    private Integer mobileNumber;
    @Size(max = 100)
    @Column(name = "name")
    private String name;
    @Size(max = 250)
    @Column(name = "address")
    private String address;
    @Size(max = 50)
    @Column(name = "gender")
    private String gender;
    @Size(max = 250)
    @Column(name = "designation")
    private String designation;
    @Size(max = 50)
    @Column(name = "department")
    private String department;
    @JoinColumn(name = "mobileNumber", referencedColumnName = "mobileNumber", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Users users;

    public Staff() {
    }

    public Staff(Integer mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Integer getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Integer mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
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
        if (!(object instanceof Staff)) {
            return false;
        }
        Staff other = (Staff) object;
        if ((this.mobileNumber == null && other.mobileNumber != null) || (this.mobileNumber != null && !this.mobileNumber.equals(other.mobileNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Staff[ mobileNumber=" + mobileNumber + " ]";
    }
    
}
