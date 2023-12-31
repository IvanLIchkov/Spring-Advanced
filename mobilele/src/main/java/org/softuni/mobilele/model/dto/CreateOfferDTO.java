package org.softuni.mobilele.model.dto;

import jakarta.validation.constraints.*;
import org.softuni.mobilele.model.enums.EngineEnum;
import org.softuni.mobilele.model.enums.TransmissionEnum;

public record CreateOfferDTO(@NotEmpty @Size(min = 5, max = 512) String description,
                             @Positive @NotNull Long modelId, @NotNull EngineEnum engine,
                             @NotNull TransmissionEnum transmission, @NotEmpty String imageUrl,
                             @Positive @NotNull Integer mileage,
                             @Positive @NotNull Integer price,
                             @Past(message = "The year should not be in the future!")
                             @NotNull(message = "Year must be provided!")
                             @Min(1930)
                             Integer year) {

  public static CreateOfferDTO empty() {
    return new CreateOfferDTO(null, null, null, null, null, null, null, null);
  }
}
