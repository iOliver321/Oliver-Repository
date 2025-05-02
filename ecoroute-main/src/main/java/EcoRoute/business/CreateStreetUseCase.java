package EcoRoute.business;


import EcoRoute.controller.dto.CreateStreetRequest;
import EcoRoute.domain.CreateStreetResponse;
import EcoRoute.persistence.StreetRepository;
import EcoRoute.persistence.entity.StreetEntity;

public interface CreateStreetUseCase
{
    CreateStreetResponse createStreet(StreetEntity entity);
}
