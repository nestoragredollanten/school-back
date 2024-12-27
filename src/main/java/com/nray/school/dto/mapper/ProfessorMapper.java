package com.nray.school.dto.mapper;

import com.nray.school.dto.ProfessorDTO;
import com.nray.school.entity.Professor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProfessorMapper {

    ProfessorMapper INSTANCE = Mappers.getMapper(ProfessorMapper.class);

    ProfessorDTO professorToProfessorDto(Professor professor);
}
