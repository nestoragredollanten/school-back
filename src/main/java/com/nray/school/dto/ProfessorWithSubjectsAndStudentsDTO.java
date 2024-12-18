package com.nray.school.dto;

public class ProfessorWithSubjectsAndStudentsDTO {

    private Long id;
    private String name;
    private String nameSubjects;
    private String nameStudents;

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

    public String getNameSubjects() {
        return nameSubjects;
    }

    public void setNameSubjects(String nameSubjects) {
        this.nameSubjects = nameSubjects;
    }

    public String getNameStudents() {
        return nameStudents;
    }

    public void setNameStudents(String nameStudents) {
        this.nameStudents = nameStudents;
    }
}
