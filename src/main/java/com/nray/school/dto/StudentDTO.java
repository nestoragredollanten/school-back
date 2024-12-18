package com.nray.school.dto;

import java.util.List;

public class StudentDTO {
    private Long id;
    private String name;
    private List<SubjectDTO> subjectDTOS;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SubjectDTO> getSubjectDTOS() {
        return subjectDTOS;
    }

    public void setSubjectDTOS(List<SubjectDTO> subjectDTOS) {
        this.subjectDTOS = subjectDTOS;
    }
}
