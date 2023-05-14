package submarin.eventAPI.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import submarin.eventAPI.model.AppEvent;
import submarin.eventAPI.service.EventService;

import java.util.List;

@RestController
@RequestMapping("/event/api")
@RequiredArgsConstructor
public class EventController {
    private final EventService eventService;

    @GetMapping("/events")
    public ResponseEntity<List<AppEvent>> getAll() {

        return ResponseEntity.ok().body(eventService.getAll());
    }

    @ExceptionHandler(ServiceException.class)
    public ResponseEntity<String> userError(ServiceException e) {

        return ResponseEntity.badRequest().body(e.getMessage());
    }
}
