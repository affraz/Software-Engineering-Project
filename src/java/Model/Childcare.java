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
@Table(name = "childcare")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Childcare.findAll", query = "SELECT c FROM Childcare c"),
    @NamedQuery(name = "Childcare.findById", query = "SELECT c FROM Childcare c WHERE c.id = :id"),
    @NamedQuery(name = "Childcare.findByInstruction", query = "SELECT c FROM Childcare c WHERE c.instruction = :instruction"),
    @NamedQuery(name = "Childcare.findByAge", query = "SELECT c FROM Childcare c WHERE c.age = :age")})
public class Childcare implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 1000)
    @Column(name = "instruction")
    private String instruction;
    @Column(name = "age")
    private Integer age;

    public Childcare() {
    }

    public Childcare(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Childcare)) {
            return false;
        }
        Childcare other = (Childcare) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Childcare[ id=" + id + " ]";
    }
    
}
