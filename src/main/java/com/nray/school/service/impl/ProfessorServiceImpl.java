package com.nray.school.service.impl;

import com.nray.school.dto.ProfessorDTO;
import com.nray.school.dto.ProfessorWithSubjectsAndStudentsDTO;
import com.nray.school.entity.Professor;
import com.nray.school.repository.ProfessorRepository;
import com.nray.school.service.ProfessorService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ProfessorServiceImpl implements ProfessorService {

    private final ProfessorRepository repository;
    private final ModelMapper mapper;

    public ProfessorServiceImpl(ProfessorRepository repository, ModelMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public ProfessorWithSubjectsAndStudentsDTO getProfessorbByIdWithSubjectsAndStudents(Long id) {
        Map<String, Object> result = repository.getProfessorSubjectsAndStudents(id);
        ProfessorWithSubjectsAndStudentsDTO dto = new ProfessorWithSubjectsAndStudentsDTO();

        dto.setId((Long) result.get("id"));
        dto.setName((String) result.get("name"));
        dto.setNameSubjects((String) result.get("nameSubjects"));
        dto.setNameStudents((String) result.get("nameStudents"));

        return dto;
    }

    @Override
    public List<ProfessorDTO> getProfessor() {
        List<Professor> professors = this.repository.findAll();
        return professors.stream()
                .map(professor -> this.mapper.map(professor, ProfessorDTO.class))
                .toList();
    }


}
