/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Bhatti
 */
@Entity
@Table(name = "publicuser")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Publicuser.findAll", query = "SELECT p FROM Publicuser p"),
    @NamedQuery(name = "Publicuser.findByMobileNumber", query = "SELECT p FROM Publicuser p WHERE p.mobileNumber = :mobileNumber"),
    @NamedQuery(name = "Publicuser.findByName", query = "SELECT p FROM Publicuser p WHERE p.name = :name"),
    @NamedQuery(name = "Publicuser.findByGender", query = "SELECT p FROM Publicuser p WHERE p.gender = :gender"),
    @NamedQuery(name = "Publicuser.findByAddress", query = "SELECT p FROM Publicuser p WHERE p.address = :address"),
    @NamedQuery(name = "Publicuser.findByMaritalStatus", query = "SELECT p FROM Publicuser p WHERE p.maritalStatus = :maritalStatus"),
    @NamedQuery(name = "Publicuser.findByBloodGroup", query = "SELECT p FROM Publicuser p WHERE p.bloodGroup = :bloodGroup"),
    @NamedQuery(name = "Publicuser.findByAge", query = "SELECT p FROM Publicuser p WHERE p.age = :age"),
    @NamedQuery(name = "Publicuser.findByDateOfBirth", query = "SELECT p FROM Publicuser p WHERE p.dateOfBirth = :dateOfBirth"),
    @NamedQuery(name = "Publicuser.findByExpiryDate", query = "SELECT p FROM Publicuser p WHERE p.expiryDate = :expiryDate"),
    @NamedQuery(name = "Publicuser.findByCaetgory", query = "SELECT p FROM Publicuser p WHERE p.caetgory = :caetgory"),
    @NamedQuery(name = "Publicuser.findByAllergic", query = "SELECT p FROM Publicuser p WHERE p.allergic = :allergic"),
    @NamedQuery(name = "Publicuser.findByPatientsFlag", query = "SELECT p FROM Publicuser p WHERE p.patientsFlag = :patientsFlag"),
    @NamedQuery(name = "Publicuser.findByPregnancyFlag", query = "SELECT p FROM Publicuser p WHERE p.pregnancyFlag = :pregnancyFlag"),
    @NamedQuery(name = "Publicuser.findByVaccinationFlag", query = "SELECT p FROM Publicuser p WHERE p.vaccinationFlag = :vaccinationFlag")})
public class Publicuser implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "mobileNumber")
    private Integer mobileNumber;
    @Size(max = 100)
    @Column(name = "name")
    private String name;
    @Size(max = 10)
    @Column(name = "gender")
    private String gender;
    @Size(max = 250)
    @Column(name = "address")
    private String address;
    @Size(max = 20)
    @Column(name = "maritalStatus")
    private String maritalStatus;
    @Size(max = 5)
    @Column(name = "bloodGroup")
    private String bloodGroup;
    @Column(name = "age")
    private Integer age;
    @Column(name = "dateOfBirth")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    @Column(name = "expiryDate")
    @Temporal(TemporalType.DATE)
    private Date expiryDate;
    @Size(max = 15)
    @Column(name = "caetgory")
    private String caetgory;
    @Size(max = 250)
    @Column(name = "allergic")
    private String allergic;
    @Column(name = "patientsFlag")
    private Boolean patientsFlag;
    @Column(name = "pregnancyFlag")
    private Boolean pregnancyFlag;
    @Column(name = "vaccinationFlag")
    private Boolean vaccinationFlag;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "publicuser")
    private Vaccination vaccination;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "publicuser")
    private Patient patient;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "publicuser")
    private Pregnancy pregnancy;
    @JoinColumn(name = "mobileNumber", referencedColumnName = "mobileNumber", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Users users;

    public Publicuser() {
    }

    public Publicuser(Integer mobileNumber) {
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCaetgory() {
        return caetgory;
    }

    public void setCaetgory(String caetgory) {
        this.caetgory = caetgory;
    }

    public String getAllergic() {
        return allergic;
    }

    public void setAllergic(String allergic) {
        this.allergic = allergic;
    }

    public Boolean getPatientsFlag() {
        return patientsFlag;
    }

    public void setPatientsFlag(Boolean patientsFlag) {
        this.patientsFlag = patientsFlag;
    }

    public Boolean getPregnancyFlag() {
        return pregnancyFlag;
    }

    public void setPregnancyFlag(Boolean pregnancyFlag) {
        this.pregnancyFlag = pregnancyFlag;
    }

    public Boolean getVaccinationFlag() {
        return vaccinationFlag;
    }

    public void setVaccinationFlag(Boolean vaccinationFlag) {
        this.vaccinationFlag = vaccinationFlag;
    }

    public Vaccination getVaccination() {
        return vaccination;
    }

    public void setVaccination(Vaccination vaccination) {
        this.vaccination = vaccination;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Pregnancy getPregnancy() {
        return pregnancy;
    }

    public void setPregnancy(Pregnancy pregnancy) {
        this.pregnancy = pregnancy;
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
        if (!(object instanceof Publicuser)) {
            return false;
        }
        Publicuser other = (Publicuser) object;
        if ((this.mobileNumber == null && other.mobileNumber != null) || (this.mobileNumber != null && !this.mobileNumber.equals(other.mobileNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Publicuser[ mobileNumber=" + mobileNumber + " ]";
    }
    
}
