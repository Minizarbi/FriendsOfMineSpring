package friendsofmine;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Camille on 19/10/2016.
 */
@Entity
public class Activite {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @NotNull @Size(min=1)
    private String titre;

    private String descriptif;

    @NotNull
    @ManyToOne(optional = false, cascade = CascadeType.PERSIST)
    private Utilisateur responsable;

    public Activite() {}

    @Override
    public String toString() {
        return "Activite{" +
                "titre='" + titre + '\'' +
                ", descriptif='" + descriptif + '\'' +
                '}';
    }

    public Utilisateur getResponsable() {
        return responsable;
    }

    public void setResponsable(Utilisateur responsable) {
        this.responsable = responsable;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescriptif() {
        return descriptif;
    }

    public void setDescriptif(String descriptif) {
        this.descriptif = descriptif;
    }
}
