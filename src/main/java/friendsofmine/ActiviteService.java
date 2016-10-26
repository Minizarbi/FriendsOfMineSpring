package friendsofmine;

import friendsofmine.repositories.ActiviteRepository;
import friendsofmine.repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.ConstraintViolationException;

/**
 * Created by Camille on 21/10/2016.
 */

@Service
public class ActiviteService {

    @Autowired
    ActiviteRepository activiteRepository;

    public void saveActivite(Activite uneActivite) {
        activiteRepository.save(uneActivite);
    }
}
