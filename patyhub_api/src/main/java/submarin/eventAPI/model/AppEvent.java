package submarin.eventAPI.model;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "events")
public class AppEvent {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "event_name")
    private String name;

    @Column(name = "event_location")
    private String location;

    @Column(name = "event_date")
    private LocalDateTime date;

    @Column(name = "event_short_description")
    private String shortDescription;

    @Column(name = "event_description")
    private String description;

    @Column(name = "event_image")
    private String image;

    @Column(name = "event_ticket_price")
    private int ticketPrice;
}
