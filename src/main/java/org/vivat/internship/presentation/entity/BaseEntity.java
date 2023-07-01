package org.vivat.internship.presentation.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import java.time.Instant;


@Data
@SuperBuilder
@EqualsAndHashCode
public abstract class BaseEntity {

  private Long id;

  private String euid;

  private Instant createdAt;

  private Instant updatedAt;
}
