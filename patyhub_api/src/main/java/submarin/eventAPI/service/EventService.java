package submarin.eventAPI.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import submarin.eventAPI.model.AppEvent;
import submarin.eventAPI.repository.EventRepository;

import javax.transaction.Transactional;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class EventService {
    private final EventRepository eventRepository;

    public List<AppEvent> getAll() {
        return eventRepository.findAll();
    }
}
