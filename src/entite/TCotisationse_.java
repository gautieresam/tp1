package entite;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "T_COTISATIONS", schema = "TP-1-POO-LA2", catalog = "")
public class TCotisationse_ {
    private int idCotisation;
    private Date dateCotisation;

    @Id
    @Column(name = "ID_COTISATION", nullable = false)
    public int getIdCotisation() {
        return idCotisation;
    }

    public void setIdCotisation(int idCotisation) {
        this.idCotisation = idCotisation;
    }

    @Basic
    @Column(name = "DATE_COTISATION", nullable = false)
    public Date getDateCotisation() {
        return dateCotisation;
    }

    public void setDateCotisation(Date dateCotisation) {
        this.dateCotisation = dateCotisation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TCotisationse_ that = (TCotisationse_) o;
        return idCotisation == that.idCotisation &&
                Objects.equals(dateCotisation, that.dateCotisation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCotisation, dateCotisation);
    }
}
