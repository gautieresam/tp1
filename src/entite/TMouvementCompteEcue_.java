package entite;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "T_MOUVEMENT_COMPTE_ECU", schema = "TP-1-POO-LA2", catalog = "")
public class TMouvementCompteEcue_ {
    private int idMouvementCompteEcu;
    private int idMembre;
    private BigDecimal montantMouvement;
    private String typeMouvement;
    private Timestamp dateHeureMouvementCompteEcu;
    private String natureMouvement;
    private Integer idReferenceMouvement;

    @Id
    @Column(name = "ID_MOUVEMENT_COMPTE_ECU", nullable = false)
    public int getIdMouvementCompteEcu() {
        return idMouvementCompteEcu;
    }

    public void setIdMouvementCompteEcu(int idMouvementCompteEcu) {
        this.idMouvementCompteEcu = idMouvementCompteEcu;
    }

    @Basic
    @Column(name = "ID_MEMBRE", nullable = false)
    public int getIdMembre() {
        return idMembre;
    }

    public void setIdMembre(int idMembre) {
        this.idMembre = idMembre;
    }

    @Basic
    @Column(name = "MONTANT_MOUVEMENT", nullable = false, precision = 2)
    public BigDecimal getMontantMouvement() {
        return montantMouvement;
    }

    public void setMontantMouvement(BigDecimal montantMouvement) {
        this.montantMouvement = montantMouvement;
    }

    @Basic
    @Column(name = "TYPE_MOUVEMENT", nullable = false, length = 1)
    public String getTypeMouvement() {
        return typeMouvement;
    }

    public void setTypeMouvement(String typeMouvement) {
        this.typeMouvement = typeMouvement;
    }

    @Basic
    @Column(name = "DATE_HEURE_MOUVEMENT_COMPTE_ECU", nullable = true)
    public Timestamp getDateHeureMouvementCompteEcu() {
        return dateHeureMouvementCompteEcu;
    }

    public void setDateHeureMouvementCompteEcu(Timestamp dateHeureMouvementCompteEcu) {
        this.dateHeureMouvementCompteEcu = dateHeureMouvementCompteEcu;
    }

    @Basic
    @Column(name = "NATURE_MOUVEMENT", nullable = false, length = 4)
    public String getNatureMouvement() {
        return natureMouvement;
    }

    public void setNatureMouvement(String natureMouvement) {
        this.natureMouvement = natureMouvement;
    }

    @Basic
    @Column(name = "ID_REFERENCE_MOUVEMENT", nullable = true)
    public Integer getIdReferenceMouvement() {
        return idReferenceMouvement;
    }

    public void setIdReferenceMouvement(Integer idReferenceMouvement) {
        this.idReferenceMouvement = idReferenceMouvement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TMouvementCompteEcue_ that = (TMouvementCompteEcue_) o;
        return idMouvementCompteEcu == that.idMouvementCompteEcu &&
                idMembre == that.idMembre &&
                Objects.equals(montantMouvement, that.montantMouvement) &&
                Objects.equals(typeMouvement, that.typeMouvement) &&
                Objects.equals(dateHeureMouvementCompteEcu, that.dateHeureMouvementCompteEcu) &&
                Objects.equals(natureMouvement, that.natureMouvement) &&
                Objects.equals(idReferenceMouvement, that.idReferenceMouvement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMouvementCompteEcu, idMembre, montantMouvement, typeMouvement, dateHeureMouvementCompteEcu, natureMouvement, idReferenceMouvement);
    }
}
