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
@Table(name = "specificinstruction")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Specificinstruction.findAll", query = "SELECT s FROM Specificinstruction s"),
    @NamedQuery(name = "Specificinstruction.findById", query = "SELECT s FROM Specificinstruction s WHERE s.id = :id"),
    @NamedQuery(name = "Specificinstruction.findByInstruction", query = "SELECT s FROM Specificinstruction s WHERE s.instruction = :instruction"),
    @NamedQuery(name = "Specificinstruction.findByCategory", query = "SELECT s FROM Specificinstruction s WHERE s.category = :category")})
public class Specificinstruction implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 1000)
    @Column(name = "instruction")
    private String instruction;
    @Size(max = 50)
    @Column(name = "category")
    private String category;

    public Specificinstruction() {
    }

    public Specificinstruction(Integer id) {
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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
        if (!(object instanceof Specificinstruction)) {
            return false;
        }
        Specificinstruction other = (Specificinstruction) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Specificinstruction[ id=" + id + " ]";
    }
    
}
