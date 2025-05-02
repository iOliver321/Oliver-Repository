package EcoRoute.business.impl;

import EcoRoute.business.GetStreetUseCase;
import EcoRoute.controller.dto.StreetConverter;
import EcoRoute.domain.Street;
import EcoRoute.persistence.StreetRepository;
import EcoRoute.persistence.entity.StreetEntity;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

import javax.swing.plaf.OptionPaneUI;
import java.util.Optional;

@RequiredArgsConstructor
public class GetStreetUseCaseImpl implements GetStreetUseCase {
    private final StreetRepository streetRepository;

    @Transactional
    public Optional<Street> getStreet(Long id) {
        // Retrieve the StreetEntity by name from the repository
        Optional<StreetEntity> streetEntityOptional = streetRepository.findById(id);
        StreetEntity streetEntity = streetEntityOptional.orElse(null);

        // Check if the StreetEntity was found
        if (streetEntity != null) {
            // Convert the StreetEntity to a Street DTO using the StreetConverter
            Street street = StreetConverter.convertStreetEntityToStreet(streetEntity);
            return Optional.of(street);
        } else {
            // If not found, return an empty Optional
            return Optional.empty();
        }
    }
}
