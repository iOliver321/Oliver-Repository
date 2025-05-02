package EcoRoute.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateStreetResponse
{
    private Long id;
    private Long week;
    private String name;
    private String postalcode;
}
