package EcoRoute.controller;

import EcoRoute.business.CreateStreetUseCase;
import EcoRoute.business.GetStreetsUseCase;
import EcoRoute.business.UpdateStreetUseCase;
import EcoRoute.business.DeleteStreetUseCase;
import EcoRoute.controller.dto.CreateStreetRequest;
import EcoRoute.controller.dto.UpdateStreetRequest;
import EcoRoute.controller.dto.GetAllStreetsResponse;
import EcoRoute.controller.dto.StreetConverter;
import EcoRoute.domain.Street;
import EcoRoute.persistence.StreetRepository;
import EcoRoute.persistence.entity.StreetEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/streets")
public class StreetController {
    private final CreateStreetUseCase createStreetUseCase;
    private final DeleteStreetUseCase deleteStreetUseCase;
    private final GetStreetsUseCase getStreetsUseCase;
    private final UpdateStreetUseCase updateStreetUseCase;

    @Autowired
    public StreetController(CreateStreetUseCase createStreetUseCase,
                            DeleteStreetUseCase deleteStreetUseCase,
                            GetStreetsUseCase getStreetsUseCase,
                            UpdateStreetUseCase updateStreetUseCase) {
        this.createStreetUseCase = createStreetUseCase;
        this.deleteStreetUseCase = deleteStreetUseCase;
        this.getStreetsUseCase = getStreetsUseCase;
        this.updateStreetUseCase = updateStreetUseCase;
    }

    @GetMapping
    public ResponseEntity<GetAllStreetsResponse> getStreets() {
        List<Street> streets = getStreetsUseCase.getStreets().getStreetList();
        return ResponseEntity.ok(new GetAllStreetsResponse(streets));
    }

    @PostMapping
    public ResponseEntity<Street> createStreet(@RequestBody CreateStreetRequest streetRequest) {
        // You should perform validation of streetRequest here before passing it to the use case.
        StreetEntity streetEntity = StreetConverter.convertCreateStreetRequestToEntity(streetRequest);
        createStreetUseCase.createStreet(streetEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body(StreetConverter.convertStreetEntityToStreet(streetEntity));
    }

    @PutMapping("/{streetName}")
    public ResponseEntity<Street> updateStreet(@PathVariable String streetName, @RequestBody UpdateStreetRequest updateStreetRequest) {
        // You should perform validation of updateStreetRequest here before passing it to the use case.
        updateStreetUseCase.updateStreet(updateStreetRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(StreetConverter.convertUpdateStreetRequestToStreet(updateStreetRequest));
    }



    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStreet(@PathVariable("id") Long id) {
        deleteStreetUseCase.deleteStreet(id);
        return ResponseEntity.noContent().build();
    }
}
