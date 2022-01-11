package entite;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "T_TARIF", schema = "TP-1-POO-LA2", catalog = "")
public class TTarife_ {
    private int idTarif;
    private int annee;
    private int montant;

    @Id
    @Column(name = "ID_TARIF", nullable = false)
    public int getIdTarif() {
        return idTarif;
    }

    public void setIdTarif(int idTarif) {
        this.idTarif = idTarif;
    }

    @Basic
    @Column(name = "ANNEE", nullable = false)
    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    @Basic
    @Column(name = "MONTANT", nullable = false)
    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TTarife_ tTarife_ = (TTarife_) o;
        return idTarif == tTarife_.idTarif &&
                annee == tTarife_.annee &&
                montant == tTarife_.montant;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTarif, annee, montant);
    }
}
