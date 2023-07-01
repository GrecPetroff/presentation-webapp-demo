package org.vivat.internship.presentation.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;


@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class BaseSlideContent extends BaseEntity {

  private Long xCoordinate;

  private Long yCoordinate;
}
