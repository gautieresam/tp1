package entite;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "T_PROPOSITION", schema = "TP-1-POO-LA2", catalog = "")
public class TPropositione_ {
    private int idProposition;
    private String description;
    private Date dateDebut;
    private Date dateFin;

    @Id
    @Column(name = "ID_PROPOSITION", nullable = false)
    public int getIdProposition() {
        return idProposition;
    }

    public void setIdProposition(int idProposition) {
        this.idProposition = idProposition;
    }

    @Basic
    @Column(name = "DESCRIPTION", nullable = true, length = 45)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "DATE_DEBUT", nullable = true)
    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    @Basic
    @Column(name = "DATE_FIN", nullable = true)
    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TPropositione_ that = (TPropositione_) o;
        return idProposition == that.idProposition &&
                Objects.equals(description, that.description) &&
                Objects.equals(dateDebut, that.dateDebut) &&
                Objects.equals(dateFin, that.dateFin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProposition, description, dateDebut, dateFin);
    }
}
