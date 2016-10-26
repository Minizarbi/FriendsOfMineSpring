package friendsofmine.repositories;

import friendsofmine.Activite;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Camille on 21/10/2016.
 */
@Repository
public interface ActiviteRepository extends PagingAndSortingRepository<Activite, Long>, CrudRepository<Activite, Long>  {

}
