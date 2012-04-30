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
@Table(name = "pregancyinstruction")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pregancyinstruction.findAll", query = "SELECT p FROM Pregancyinstruction p"),
    @NamedQuery(name = "Pregancyinstruction.findById", query = "SELECT p FROM Pregancyinstruction p WHERE p.id = :id"),
    @NamedQuery(name = "Pregancyinstruction.findByInstruction", query = "SELECT p FROM Pregancyinstruction p WHERE p.instruction = :instruction"),
    @NamedQuery(name = "Pregancyinstruction.findByStage", query = "SELECT p FROM Pregancyinstruction p WHERE p.stage = :stage"),
    @NamedQuery(name = "Pregancyinstruction.findByCategory", query = "SELECT p FROM Pregancyinstruction p WHERE p.category = :category")})
public class Pregancyinstruction implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 1000)
    @Column(name = "instruction")
    private String instruction;
    @Column(name = "stage")
    private Integer stage;
    @Size(max = 50)
    @Column(name = "category")
    private String category;

    public Pregancyinstruction() {
    }

    public Pregancyinstruction(Integer id) {
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

    public Integer getStage() {
        return stage;
    }

    public void setStage(Integer stage) {
        this.stage = stage;
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
        if (!(object instanceof Pregancyinstruction)) {
            return false;
        }
        Pregancyinstruction other = (Pregancyinstruction) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Pregancyinstruction[ id=" + id + " ]";
    }
    
}
