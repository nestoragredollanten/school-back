package com.nray.school.dto;

import java.util.List;

public record StudentDTO(Long id, String name, List<SubjectDTO> subjectDTOS) {

}
