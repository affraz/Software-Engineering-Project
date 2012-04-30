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
@Table(name = "newmessage")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Newmessage.findAll", query = "SELECT n FROM Newmessage n"),
    @NamedQuery(name = "Newmessage.findById", query = "SELECT n FROM Newmessage n WHERE n.id = :id"),
    @NamedQuery(name = "Newmessage.findByMessage", query = "SELECT n FROM Newmessage n WHERE n.message = :message")})
public class Newmessage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 1000)
    @Column(name = "message")
    private String message;

    public Newmessage() {
    }

    public Newmessage(Integer id) {
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
        if (!(object instanceof Newmessage)) {
            return false;
        }
        Newmessage other = (Newmessage) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Newmessage[ id=" + id + " ]";
    }
    
}
