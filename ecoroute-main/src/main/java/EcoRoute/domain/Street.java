package EcoRoute.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Street {
    private Long id;
    private Long  week;
    String name;
    String postalCode;  // Match the case with your DTO
}
