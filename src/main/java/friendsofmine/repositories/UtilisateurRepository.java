package friendsofmine.repositories;

import friendsofmine.Utilisateur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Camille on 21/10/2016.
 */
@Repository
public interface UtilisateurRepository extends CrudRepository<Utilisateur, Long>, PagingAndSortingRepository<Utilisateur, Long> {

}
