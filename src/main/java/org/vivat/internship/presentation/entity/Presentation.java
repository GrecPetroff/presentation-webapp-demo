package org.vivat.internship.presentation.entity;


import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;


@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class Presentation extends BaseEntity {

  private String title;

  private String description;

  @Builder.Default
  private List<Slide> slides = new ArrayList<>();
}
