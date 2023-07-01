package org.vivat.internship.presentation.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;


@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class SlideImage extends BaseSlideContent {

  private String imageUrl;

}
