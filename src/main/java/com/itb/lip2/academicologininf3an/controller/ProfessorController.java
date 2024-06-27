package com.itb.lip2.academicologininf3an.controller;

import com.itb.lip2.academicologininf3an.model.Professor;
import com.itb.lip2.academicologininf3an.service.ProfessorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/academico/api/v1/professores")
public class ProfessorController {

    private final ProfessorService professorService;

    ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateAluno(@RequestBody Professor professor, @PathVariable(value="id") Long id) {
        try {
            return ResponseEntity.ok().body(professorService.update(id, professor));
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
}
