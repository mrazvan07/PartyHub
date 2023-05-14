package submarin.eventAPI.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "locations")
public class AppLocation {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "location_name")
    private String name;

    @Column(name = "location_address")
    private String address;

    @Column(name = "location_description")
    private String description;

    @Column(name = "location_latitude")
    private Double lat;

    @Column(name = "location_longitude")
    private Double lon;
}
