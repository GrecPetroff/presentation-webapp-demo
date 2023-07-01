package org.vivat.internship.presentation.repository;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.vivat.internship.presentation.entity.Presentation;
import org.vivat.internship.presentation.entity.Slide;
import org.vivat.internship.presentation.entity.SlideImage;
import org.vivat.internship.presentation.entity.SlideText;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.UUID;


/**
 * Dummy Presentation repository - returns a single presentation with a single slide.
 *
 * TODO: Replace this with a real repository that fetches data from a database.
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class PresentationRepository {

  public List<Presentation> getPresentations () {

    Presentation dummyPresentation = Presentation.builder()
        .id(1L)
        .title("Dummy presentation")
        .euid(UUID.randomUUID().toString())
        .slides(Collections.singletonList(
            Slide.builder()
                .id(1L)
                .euid(UUID.randomUUID().toString())
                .title("Slide 1")
                .position(0L)
                .images(
                    Set.of(SlideImage.builder()
                               .id(1L)
                               .euid(UUID.randomUUID().toString())
                               .xCoordinate(10L)
                               .yCoordinate(10L)
                               .imageUrl("https://google.photos/200/300")
                               .build())
                )
                .texts(Set.of(SlideText.builder()
                                  .id(1L)
                                  .euid(UUID.randomUUID().toString())
                                  .xCoordinate(10L)
                                  .yCoordinate(10L)
                                  .text("Hello intern!")
                                  .fontSize(13)
                                  .build()))
                .build()
        ))
        .build();

    return Collections.singletonList(dummyPresentation);
  }
}
