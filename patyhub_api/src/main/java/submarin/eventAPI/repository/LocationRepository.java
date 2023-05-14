package submarin.eventAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import submarin.eventAPI.model.AppLocation;

@Repository
public interface LocationRepository extends JpaRepository<AppLocation, Long> {
}
