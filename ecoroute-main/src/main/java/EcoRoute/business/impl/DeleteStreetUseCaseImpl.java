package EcoRoute.business.impl;

import EcoRoute.business.DeleteStreetUseCase;
import EcoRoute.persistence.StreetRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@RequiredArgsConstructor
public class DeleteStreetUseCaseImpl implements DeleteStreetUseCase
{
    @Autowired
   private  StreetRepository streetRepository;

    @Transactional
    public void deleteStreet(Long id){
        streetRepository.deleteById(id);
    }
}
