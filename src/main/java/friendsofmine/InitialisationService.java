package friendsofmine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class InitialisationService {

    private Utilisateur mary;
    private Utilisateur thom;

    private Activite lindyHop;
    private Activite randonnee;
    private Activite taekwondo;

    @Autowired
    private ActiviteService activiteService;

    public void initActivites() {
        mary = new Utilisateur();
        mary.setNom("Bloody");
        mary.setPrenom("Mary");
        mary.setSexe("F");
        mary.setEmail("bmary@bmary.com");

        thom = new Utilisateur();
        thom.setNom("Brider");
        thom.setPrenom("Thom");
        thom.setSexe("M");
        thom.setEmail("thomb@rider.com");

        lindyHop = new Activite();
        lindyHop.setTitre("Lindy Hop");
        lindyHop.setResponsable(mary);

        randonnee = new Activite();
        randonnee.setTitre("Randonnee");
        randonnee.setResponsable(mary);

        taekwondo = new Activite();
        taekwondo.setTitre("Taekwondo");
        taekwondo.setDescriptif("Taekwondodo");
        taekwondo.setResponsable(thom);

        activiteService.saveActivite(lindyHop);
        activiteService.saveActivite(randonnee);
        activiteService.saveActivite(taekwondo);
    }

    public Utilisateur getMary() {
        return mary;
    }

    public Utilisateur getThom() {
        return thom;
    }

    public Activite getLindyHop() {
        return lindyHop;
    }

    public Activite getRandonnee() {
        return randonnee;
    }

    public Activite getTaekwondo() {
        return taekwondo;
    }
}
