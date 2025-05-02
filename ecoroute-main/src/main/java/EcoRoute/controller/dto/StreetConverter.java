package EcoRoute.controller.dto;

import EcoRoute.domain.Street;
import EcoRoute.persistence.entity.StreetEntity;

public class StreetConverter {
    private StreetConverter() {
    }

    public static Street convertStreetEntityToStreet(StreetEntity streetEntity) {
        return Street.builder()
                .id(streetEntity.getId())
                .name(streetEntity.getName())
                .week(streetEntity.getCalendarWeekId())
                .postalCode(streetEntity.getPostalCode())
                // Add other properties as needed
                .build();
    }

    public static StreetEntity convertStreetToEntity(Street street) {
        return StreetEntity.builder()
                .id(street.getId())
                .name(street.getName())
                .postalCode(street.getPostalCode())
                // Add other properties as needed
                .build();
    }

    public static StreetEntity convertCreateStreetRequestToEntity(CreateStreetRequest createStreetRequest) {
        return StreetEntity.builder()
                .id(createStreetRequest.getId())
                .name(createStreetRequest.getName())
                .postalCode(createStreetRequest.getPostalcode())
                .calendarWeekId(createStreetRequest.getWeek())
                // Add other properties as needed
                .build();
    }
    public static Street convertUpdateStreetRequestToStreet(UpdateStreetRequest updateStreetRequest) {
        return Street.builder()
                .id(updateStreetRequest.getId())
                .postalCode(updateStreetRequest.getPostalCode())
                .name(updateStreetRequest.getName())
                .postalCode(updateStreetRequest.getPostalCode())
                // Add other properties as needed
                .build();
    }
}
