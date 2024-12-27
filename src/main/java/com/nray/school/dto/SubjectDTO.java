package com.nray.school.dto;

import java.util.List;

public record SubjectDTO(Long id, String name, ProfessorDTO professor, CourseDTO course, List<StudentDTO> studentDTOS) {
}
