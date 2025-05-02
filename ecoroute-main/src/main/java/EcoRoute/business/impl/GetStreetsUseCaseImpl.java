package EcoRoute.business.impl;

import EcoRoute.business.GetStreetUseCase;
import EcoRoute.business.GetStreetsUseCase;
import EcoRoute.controller.dto.StreetConverter;
import EcoRoute.controller.dto.GetAllStreetsResponse;
import EcoRoute.domain.Street;
import EcoRoute.persistence.StreetRepository;
import EcoRoute.persistence.entity.StreetEntity;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
//@AllArgsConstructor
public class GetStreetsUseCaseImpl implements GetStreetsUseCase
{
    @Autowired
    private final StreetRepository streetRepository;

    public GetAllStreetsResponse getStreets (){
        List<StreetEntity> results;
        results = (List<StreetEntity>) streetRepository.findAll();
        final GetAllStreetsResponse response = new GetAllStreetsResponse();
        List<Street> streets = new ArrayList<Street>();
        for (StreetEntity streetentity:results)
        {
            streets.add(StreetConverter.convertStreetEntityToStreet(streetentity));
        }
        response.setStreetList(streets);
        return response;
    }

}
