package com.nray.school.service;

import com.nray.school.dto.ProfessorDTO;
import com.nray.school.dto.ProfessorWithSubjectsAndStudentsDTO;

import java.util.List;

public interface ProfessorService {

    ProfessorWithSubjectsAndStudentsDTO getProfessorByIdWithSubjectsAndStudents(Long id);

    List<ProfessorDTO> getProfessor();
}
