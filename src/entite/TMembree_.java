package entite;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "T_MEMBRE", schema = "TP-1-POO-LA2", catalog = "")
public class TMembree_ {
    private int idMembre;
    private String nomMembre;
    private String prenomMembre;
    private String mailMembre;
    private String statut;
    private int soldeHeure;
    private int soldeEcu;
    private String typeMembre;
    private Integer habitant;
    private String raisonSociale;
    private int clientCompteEcu;

    @Id
    @Column(name = "ID_MEMBRE", nullable = false)
    public int getIdMembre() {
        return idMembre;
    }

    public void setIdMembre(int idMembre) {
        this.idMembre = idMembre;
    }

    @Basic
    @Column(name = "NOM_MEMBRE", nullable = false, length = 45)
    public String getNomMembre() {
        return nomMembre;
    }

    public void setNomMembre(String nomMembre) {
        this.nomMembre = nomMembre;
    }

    @Basic
    @Column(name = "PRENOM_MEMBRE", nullable = false, length = 45)
    public String getPrenomMembre() {
        return prenomMembre;
    }

    public void setPrenomMembre(String prenomMembre) {
        this.prenomMembre = prenomMembre;
    }

    @Basic
    @Column(name = "MAIL_MEMBRE", nullable = true, length = 45)
    public String getMailMembre() {
        return mailMembre;
    }

    public void setMailMembre(String mailMembre) {
        this.mailMembre = mailMembre;
    }

    @Basic
    @Column(name = "STATUT", nullable = false, length = 1)
    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    @Basic
    @Column(name = "SOLDE_HEURE", nullable = false)
    public int getSoldeHeure() {
        return soldeHeure;
    }

    public void setSoldeHeure(int soldeHeure) {
        this.soldeHeure = soldeHeure;
    }

    @Basic
    @Column(name = "SOLDE_ECU", nullable = false)
    public int getSoldeEcu() {
        return soldeEcu;
    }

    public void setSoldeEcu(int soldeEcu) {
        this.soldeEcu = soldeEcu;
    }

    @Basic
    @Column(name = "TYPE_MEMBRE", nullable = true, length = 3)
    public String getTypeMembre() {
        return typeMembre;
    }

    public void setTypeMembre(String typeMembre) {
        this.typeMembre = typeMembre;
    }

    @Basic
    @Column(name = "HABITANT", nullable = true)
    public Integer getHabitant() {
        return habitant;
    }

    public void setHabitant(Integer habitant) {
        this.habitant = habitant;
    }

    @Basic
    @Column(name = "RAISON_SOCIALE", nullable = true, length = 45)
    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    @Basic
    @Column(name = "CLIENT_COMPTE_ECU", nullable = false)
    public int getClientCompteEcu() {
        return clientCompteEcu;
    }

    public void setClientCompteEcu(int clientCompteEcu) {
        this.clientCompteEcu = clientCompteEcu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TMembree_ tMembree_ = (TMembree_) o;
        return idMembre == tMembree_.idMembre &&
                soldeHeure == tMembree_.soldeHeure &&
                soldeEcu == tMembree_.soldeEcu &&
                clientCompteEcu == tMembree_.clientCompteEcu &&
                Objects.equals(nomMembre, tMembree_.nomMembre) &&
                Objects.equals(prenomMembre, tMembree_.prenomMembre) &&
                Objects.equals(mailMembre, tMembree_.mailMembre) &&
                Objects.equals(statut, tMembree_.statut) &&
                Objects.equals(typeMembre, tMembree_.typeMembre) &&
                Objects.equals(habitant, tMembree_.habitant) &&
                Objects.equals(raisonSociale, tMembree_.raisonSociale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMembre, nomMembre, prenomMembre, mailMembre, statut, soldeHeure, soldeEcu, typeMembre, habitant, raisonSociale, clientCompteEcu);
    }
}
