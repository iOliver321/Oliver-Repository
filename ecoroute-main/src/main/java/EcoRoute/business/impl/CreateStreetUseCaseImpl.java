package EcoRoute.business.impl;

import EcoRoute.business.CreateStreetUseCase;
import EcoRoute.controller.dto.CreateStreetRequest;
import EcoRoute.persistence.StreetRepository;
import EcoRoute.persistence.entity.StreetEntity;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import EcoRoute.domain.CreateStreetResponse;

@Service
public class CreateStreetUseCaseImpl implements CreateStreetUseCase
{
    @Autowired
    private StreetRepository streetRepository;

    @Override
    public CreateStreetResponse createStreet(StreetEntity request) {
        // Use streetRepository to interact with the database
        StreetEntity newStreet = StreetEntity.builder()
                .calendarWeekId(request.getCalendarWeekId())
                .name(request.getName())
                .postalCode(request.getPostalCode())
                .build();
        StreetEntity savedStreet = streetRepository.save(newStreet);

        return CreateStreetResponse.builder()
                .week(savedStreet.getCalendarWeekId())
                .name(savedStreet.getName())
                .postalcode(savedStreet.getPostalCode())
                .build();
    }
}
