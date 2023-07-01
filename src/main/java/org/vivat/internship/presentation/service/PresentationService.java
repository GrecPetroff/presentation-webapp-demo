package org.vivat.internship.presentation.service;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.vivat.internship.presentation.entity.Presentation;
import org.vivat.internship.presentation.repository.PresentationRepository;

import java.util.List;


@Slf4j
@Service
@RequiredArgsConstructor
public class PresentationService {

  private final PresentationRepository presentationRepository;


  public List<Presentation> getPresentations () {

    log.info("Fetching the presentations from repo");
    return presentationRepository.getPresentations();
  }

}
