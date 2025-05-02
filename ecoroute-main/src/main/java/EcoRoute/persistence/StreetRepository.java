package EcoRoute.persistence;

import EcoRoute.persistence.entity.StreetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.*;



public interface StreetRepository extends JpaRepository<StreetEntity, Long>
{
    boolean existsByPostalCode(String postalCode);


//    StreetEntity findByName(String Name);

//    @Query("")
//    void updateStreet(Long id,String name);

//    List<StreetEntity> returnStreets();
//    StreetEntity save(StreetEntity streetEntity);
//    void deleteStreet(String name);
//    void updateStreet(StreetEntity streetEntity);
//    Optional<StreetEntity> findByName(String Name);
}
