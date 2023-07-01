package org.vivat.internship.presentation.domain;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@Schema(description = "Presentation Information")
public class PresentationDTO {

  @Schema(description = "EUID of presentation", example = "123e4567-e89b-12d3-a456-426614174000")
  private String euid;

  @Schema(description = "Title of presentation", example = "My Presentation")
  private String title;

  @Schema(description = "List of slides")
  private List<SlideDTO> slides = new ArrayList<>();

}
