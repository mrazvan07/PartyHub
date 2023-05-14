package submarin.eventAPI.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import submarin.eventAPI.model.AppLocation;
import submarin.eventAPI.repository.LocationRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class LocationService {
    private final LocationRepository locationRepository;

    public List<AppLocation> getAll() {
        return locationRepository.findAll();
    }
}
