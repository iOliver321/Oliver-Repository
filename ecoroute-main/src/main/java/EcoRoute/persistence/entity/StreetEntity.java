package EcoRoute.persistence.entity;

import EcoRoute.domain.CalendarWeek;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Entity
@Table(name = "Street")
@Data
@Builder
@AllArgsConstructor
public class StreetEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @NotBlank
    @Column(name = "name")//
    String name;
    // CalendarWeek week ;

    @Column(name = "calendarWeekId")
    Long calendarWeekId;

    @Column(name = "postalCode")  // Match the case with your DTO
    String postalCode;  // Match the case with your DTO

    protected StreetEntity() {
    }
}
