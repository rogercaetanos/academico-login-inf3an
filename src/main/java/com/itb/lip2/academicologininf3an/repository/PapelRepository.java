package com.itb.lip2.academicologininf3an.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itb.lip2.academicologininf3an.model.Papel;

@Repository
public interface PapelRepository extends JpaRepository<Papel, Long> {

}
