package com.nray.school.controller;

import com.nray.school.dto.ProfessorDTO;
import com.nray.school.dto.ProfessorWithSubjectsAndStudentsDTO;
import com.nray.school.service.ProfessorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/professor")
public class ProfessorController {

    private final ProfessorService service;

    public ProfessorController(ProfessorService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProfessorWithSubjectsAndStudentsDTO> getProfessorbByIdWithSubjectsAndStudents(@PathVariable Long id){
        return ResponseEntity.ok(service.getProfessorbByIdWithSubjectsAndStudents(id));
    }

    @GetMapping
    public ResponseEntity<List<ProfessorDTO>> getAll(){
        return ResponseEntity.ok(service.getProfessor());
    }
}
