package friendsofmine;

import friendsofmine.repositories.ActiviteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

/**
 * Created by Camille on 21/10/2016.
 */

@Service
public class ActiviteService {

    @Autowired
    ActiviteRepository activiteRepository;

    public void saveActivite(Activite uneActivite) {
        if (uneActivite.getResponsable() != null) {
            uneActivite.getResponsable().getActivites().add(uneActivite);
        }
        activiteRepository.save(uneActivite);
    }

    public Iterable<Activite> findAllActivites() {
        return activiteRepository.findAll((new Sort("titre")));
    }
}
