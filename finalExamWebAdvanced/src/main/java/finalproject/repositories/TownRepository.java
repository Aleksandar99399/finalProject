package finalproject.repositories;

import finalproject.models.entities.Office;
import finalproject.models.entities.Town;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TownRepository extends JpaRepository<Town,String> {

    Optional<Town>findById(String id);

    Optional<Town>findByName(String name);


}
