package org.vivat.internship.presentation.domain;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@Schema(description = "Slide Text Widget")
public class SlideTextDTO {

  @Schema(description = "EUID of presentation", example = "123e4567-e89b-12d3-a456-426614174000")
  private String euid;

  @Schema(description = "X coordinate of text", example = "0")
  private Long xCoordinate;

  @Schema(description = "Y coordinate of text", example = "0")
  private Long yCoordinate;

  @Schema(description = "Text", example = "Hello World on Slide")
  private String text;

  @Schema(description = "Font size of text", example = "12")
  private Integer fontSize;

}
