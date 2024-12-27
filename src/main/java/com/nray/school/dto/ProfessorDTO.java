package com.nray.school.dto;

import java.util.List;

public record ProfessorDTO(Long id, String name, List<SubjectDTO> subjectDTOS) {
}
