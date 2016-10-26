package friendsofmine;

import friendsofmine.repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolationException;

/**
 * Created by Camille on 21/10/2016.
 */
@Service
public class UtilisateurService {

    @Autowired
    UtilisateurRepository utilisateurRepository;

    public void saveUtilisateur(Utilisateur unUtilisateur) {
        utilisateurRepository.save(unUtilisateur);
    }

}
