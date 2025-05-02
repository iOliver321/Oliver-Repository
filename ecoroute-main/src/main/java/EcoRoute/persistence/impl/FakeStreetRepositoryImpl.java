package EcoRoute.persistence.impl;

import EcoRoute.domain.Enums.WeekDays;
import EcoRoute.domain.Enums.Status;
import EcoRoute.persistence.StreetRepository;
import EcoRoute.persistence.entity.StreetEntity;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class FakeStreetRepositoryImpl
{
//    private final List<StreetEntity> streets;
//
//    public FakeStreetRepositoryImpl()
//    {
//        this.streets = new ArrayList<>();
//        // Create and add the first street
//        StreetEntity street1 = StreetEntity.builder()
//                .name("MainStreet")
//                .PostalCode("12345")
//                .build();
//        // Set the status for all days of the week for street1
//        streets.add(street1);
//
//        // Create and add the second street
//        StreetEntity street2 = StreetEntity.builder()
//                .name("ElmStreet")
//                .PostalCode("67890")
//                .build();
//        // Set the status for all days of the week for street2
//        streets.add(street2);
//
//        // Create and add the third street
//        StreetEntity street3 = StreetEntity.builder()
//                .name("MapleStreet")
//                .PostalCode("45678")
//                .build();
//        // Set the status for all days of the week for street3
//        streets.add(street3);
//    }
//    @Override
//    public List<StreetEntity> returnStreets(){
//        return streets;
//    }
//
//    @Override
//    public StreetEntity save(StreetEntity streetEntity)
//    {
//        streets.add(streetEntity);
//        return streetEntity;
//    }
//
//    @Override
//    public void deleteStreet(String name)
//    {
//        for (StreetEntity street:streets)
//        {
//            if(street.getName().equals(name))
//            {
//                streets.remove(street);
//            }
//        }
//    }
//    @Override
//    public void updateStreet(StreetEntity streetEntity) {
//        for (StreetEntity street : streets) {
//            if (street.getName().equals(streetEntity.getName())) {
//                street.setName(streetEntity.getName());
//                street.setPostalCode(streetEntity.getPostalCode());
//            }
//        }
//    }
//
//
//
//    @Override
//    public Optional<StreetEntity> findByName(String Name){
//        return this.returnStreets().stream().filter
//                        (streetEntity -> streetEntity.getName().equals(Name))
//                .findFirst();
//    }
}

