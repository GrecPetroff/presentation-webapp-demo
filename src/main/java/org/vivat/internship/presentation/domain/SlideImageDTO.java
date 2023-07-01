package org.vivat.internship.presentation.domain;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@Schema(description = "Slide Image Widget")
public class SlideImageDTO {

  @Schema(description = "EUID of presentation", example = "123e4567-e89b-12d3-a456-426614174000")
  private String euid;

  @Schema(description = "X coordinate on slide of image", example = "0")
  private Long xCoordinate;

  @Schema(description = "Y coordinate on slide of image", example = "0")
  private Long yCoordinate;

  @Schema(description = "URL of image", example = "https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png")
  private String imageUrl;

}
