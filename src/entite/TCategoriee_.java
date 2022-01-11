package entite;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "T_CATEGORIE", schema = "TP-1-POO-LA2", catalog = "")
public class TCategoriee_ {
    private int idCategorie;
    private String categorie;

    @Id
    @Column(name = "ID_CATEGORIE", nullable = false)
    public int getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(int idCategorie) {
        this.idCategorie = idCategorie;
    }

    @Basic
    @Column(name = "CATEGORIE", nullable = false, length = 45)
    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TCategoriee_ that = (TCategoriee_) o;
        return idCategorie == that.idCategorie &&
                Objects.equals(categorie, that.categorie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCategorie, categorie);
    }
}
