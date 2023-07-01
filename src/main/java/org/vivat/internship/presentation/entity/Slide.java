package org.vivat.internship.presentation.entity;


import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;


@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class Slide extends BaseEntity {

  private String title;

  private Long position;

  @Builder.Default
  private Set<SlideImage> images = new HashSet<>();

  @Builder.Default
  private Set<SlideText> texts = new HashSet<>();
}
