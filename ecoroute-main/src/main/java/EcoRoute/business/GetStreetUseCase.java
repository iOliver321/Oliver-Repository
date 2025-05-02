package EcoRoute.business;

import EcoRoute.domain.Street;

import java.util.Optional;

public interface GetStreetUseCase
{
    Optional<Street> getStreet(Long id);
}
