package com.nray.school.dto;

import java.util.List;

public class CourseDTO {
    private Long id;
    private int grade;
    private String room;
    private List<SubjectDTO> subjectDTOS;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public List<SubjectDTO> getSubjectDTOS() {
        return subjectDTOS;
    }

    public void setSubjectDTOS(List<SubjectDTO> subjectDTOS) {
        this.subjectDTOS = subjectDTOS;
    }
}
