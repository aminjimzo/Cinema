package com.example.sid.DAO;

import com.example.sid.entits.Seance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



@RepositoryRestResource
public interface SeanceReposiory extends JpaRepository<Seance,Long> {

}