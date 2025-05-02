package EcoRoute.controller.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;




@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateStreetRequest
{
    @NotBlank
    private Long Id;

    private Long week;
    @NotBlank
    private String name;

    @NotBlank
    private String postalcode;

}
