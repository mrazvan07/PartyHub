package submarin.eventAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import submarin.eventAPI.model.AppEvent;

@Repository
public interface EventRepository extends JpaRepository<AppEvent, Long> {
}
