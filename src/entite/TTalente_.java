package entite;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "T_TALENT", schema = "TP-1-POO-LA2", catalog = "")
public class TTalente_ {
    private int idTalent;
    private String detailCompetence;

    @Id
    @Column(name = "ID_TALENT", nullable = false)
    public int getIdTalent() {
        return idTalent;
    }

    public void setIdTalent(int idTalent) {
        this.idTalent = idTalent;
    }

    @Basic
    @Column(name = "DetailCompetence", nullable = true, length = 45)
    public String getDetailCompetence() {
        return detailCompetence;
    }

    public void setDetailCompetence(String detailCompetence) {
        this.detailCompetence = detailCompetence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TTalente_ tTalente_ = (TTalente_) o;
        return idTalent == tTalente_.idTalent &&
                Objects.equals(detailCompetence, tTalente_.detailCompetence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTalent, detailCompetence);
    }
}
