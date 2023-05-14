package submarin.eventAPI.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import submarin.eventAPI.model.AppLocation;
import submarin.eventAPI.service.LocationService;

import java.util.List;

@RestController
@RequestMapping("/location/api")
@RequiredArgsConstructor
public class LocationController {
    private final LocationService locationService;

    @GetMapping("/locations")
    public ResponseEntity<List<AppLocation>> getAll() {

        return ResponseEntity.ok().body(locationService.getAll());
    }

    @ExceptionHandler(ServiceException.class)
    public ResponseEntity<String> userError(ServiceException e) {

        return ResponseEntity.badRequest().body(e.getMessage());
    }
}
