package EcoRoute.business.impl;

import EcoRoute.business.UpdateStreetUseCase;
import EcoRoute.controller.dto.UpdateStreetRequest;
import EcoRoute.persistence.StreetRepository;
import EcoRoute.persistence.entity.StreetEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UpdateStreetUseCaseImpl implements UpdateStreetUseCase {
    private final StreetRepository streetRepository;

    @Override
    public void updateStreet(UpdateStreetRequest request) {
        // Retrieve the StreetEntity by name from the repository
        Optional<StreetEntity> streetEntityOptional = streetRepository.findById(request.getId());
        StreetEntity streetEntity = streetEntityOptional.orElseThrow(null);

        if (streetEntity != null) {
            // Update the fields of the StreetEntity based on the UpdateStreetRequest
            streetEntity.setPostalCode(request.getPostalCode());
            // You can update other fields as needed

            // Save the updated StreetEntity back to the repository
            streetRepository.save(streetEntity);
        }
        // Handle the case where the street is not found if needed
    }
}
