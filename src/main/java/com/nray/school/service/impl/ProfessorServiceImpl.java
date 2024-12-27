package com.nray.school.service.impl;

import com.nray.school.dto.mapper.ProfessorMapper;
import com.nray.school.dto.ProfessorDTO;
import com.nray.school.dto.ProfessorWithSubjectsAndStudentsDTO;
import com.nray.school.entity.Professor;
import com.nray.school.repository.ProfessorRepository;
import com.nray.school.service.ProfessorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProfessorServiceImpl implements ProfessorService {

    private final ProfessorRepository repository;

    public ProfessorServiceImpl(ProfessorRepository repository) {
        this.repository = repository;
    }

    @Override
    public ProfessorWithSubjectsAndStudentsDTO getProfessorByIdWithSubjectsAndStudents(Long id) {
        Map<String, Object> result = repository.getProfessorSubjectsAndStudents(id);

        return new ProfessorWithSubjectsAndStudentsDTO(
                (Long) result.get("id"),
                (String) result.get("name"),
                (String) result.get("nameSubjects"),
                (String) result.get("nameStudents")
        );
    }

    @Override
    public List<ProfessorDTO> getProfessor() {
        List<Professor> professors = this.repository.findAll();
        return professors.stream()
                .map(ProfessorMapper.INSTANCE::professorToProfessorDto)
                .toList();
    }


}
