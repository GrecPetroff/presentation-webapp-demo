package org.vivat.internship.presentation.domain;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@Schema(description = "Slide Content")
public class SlideDTO {

  @Schema(description = "EUID of presentation", example = "123e4567-e89b-12d3-a456-426614174000")
  private String euid;

  @Schema(description = "Title of slide", example = "Slide 1")
  private String title;

  @Schema(description = "Order(Index) of slide", example = "0")
  private Long position;

  @Schema(description = "List of images")
  private Set<SlideImageDTO> images = new HashSet<>();

  @Schema(description = "List of texts")
  private Set<SlideTextDTO> texts = new HashSet<>();


}
