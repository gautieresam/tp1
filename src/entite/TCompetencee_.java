package entite;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "T_COMPETENCE", schema = "TP-1-POO-LA2", catalog = "")
public class TCompetencee_ {
    private int idCompetence;
    private String competence;

    @Id
    @Column(name = "ID_COMPETENCE", nullable = false)
    public int getIdCompetence() {
        return idCompetence;
    }

    public void setIdCompetence(int idCompetence) {
        this.idCompetence = idCompetence;
    }

    @Basic
    @Column(name = "COMPETENCE", nullable = false, length = 45)
    public String getCompetence() {
        return competence;
    }

    public void setCompetence(String competence) {
        this.competence = competence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TCompetencee_ that = (TCompetencee_) o;
        return idCompetence == that.idCompetence &&
                Objects.equals(competence, that.competence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCompetence, competence);
    }
}
