package com.nray.school.dto;

import java.util.List;

public record CourseDTO(Long id, int grade, String room, List<SubjectDTO> subjectDTOS) {
}
