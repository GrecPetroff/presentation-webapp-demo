package org.vivat.internship.presentation.web;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.vivat.internship.presentation.domain.PresentationDTO;
import org.vivat.internship.presentation.service.PresentationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;
import java.util.stream.Collectors;


@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/presentation")
@Tag(name = "Presentations management APIs", description = "Responsible for CRUD operations on Presentations.")
public class PresentationController {

  private final PresentationService presentationService;

  private final ModelMapper modelMapper;


  @Operation(
      description = "Retrieve all presentations from database",
      summary = "Retrieve all presentations"
  )
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Success"),
      @ApiResponse(responseCode = "401", description = "Malformed or Invalid Token"),
      @ApiResponse(responseCode = "404", description = "Resource doesn't exist"),
      @ApiResponse(responseCode = "500", description = "Unexpected Internal Error")
  })
  @GetMapping
  public List<PresentationDTO> getPresentations () {

    return presentationService.getPresentations()
        .stream()
        .map(presentation -> modelMapper.map(presentation, PresentationDTO.class))
        .collect(Collectors.toList());
  }
}
