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
@Table(name = "outgoingmessage")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Outgoingmessage.findAll", query = "SELECT o FROM Outgoingmessage o"),
    @NamedQuery(name = "Outgoingmessage.findById", query = "SELECT o FROM Outgoingmessage o WHERE o.id = :id"),
    @NamedQuery(name = "Outgoingmessage.findByMessage", query = "SELECT o FROM Outgoingmessage o WHERE o.message = :message")})
public class Outgoingmessage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 1000)
    @Column(name = "message")
    private String message;

    public Outgoingmessage() {
    }

    public Outgoingmessage(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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
        if (!(object instanceof Outgoingmessage)) {
            return false;
        }
        Outgoingmessage other = (Outgoingmessage) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Outgoingmessage[ id=" + id + " ]";
    }
    
}
