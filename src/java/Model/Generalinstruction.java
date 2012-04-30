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
@Table(name = "generalinstruction")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Generalinstruction.findAll", query = "SELECT g FROM Generalinstruction g"),
    @NamedQuery(name = "Generalinstruction.findById", query = "SELECT g FROM Generalinstruction g WHERE g.id = :id"),
    @NamedQuery(name = "Generalinstruction.findByInstruction", query = "SELECT g FROM Generalinstruction g WHERE g.instruction = :instruction"),
    @NamedQuery(name = "Generalinstruction.findByCategory", query = "SELECT g FROM Generalinstruction g WHERE g.category = :category")})
public class Generalinstruction implements Serializable {
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

    public Generalinstruction() {
    }

    public Generalinstruction(Integer id) {
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
        if (!(object instanceof Generalinstruction)) {
            return false;
        }
        Generalinstruction other = (Generalinstruction) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Generalinstruction[ id=" + id + " ]";
    }
    
}
