package com.nray.school.dto;

import java.util.List;

public class SubjectDTO {
    private Long id;
    private String name;
    private ProfessorDTO professor;
    private CourseDTO course;
    private List<StudentDTO> studentDTOS;

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

    public ProfessorDTO getProfessor() {
        return professor;
    }

    public void setProfessor(ProfessorDTO professor) {
        this.professor = professor;
    }

    public CourseDTO getCourse() {
        return course;
    }

    public void setCourse(CourseDTO course) {
        this.course = course;
    }

    public List<StudentDTO> getStudentDTOS() {
        return studentDTOS;
    }

    public void setStudentDTOS(List<StudentDTO> studentDTOS) {
        this.studentDTOS = studentDTOS;
    }
}
