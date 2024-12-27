package com.nray.school.dto;

import java.util.List;

public record SchoolDTO(Long id, String name, List<CourseDTO> courses) {
}