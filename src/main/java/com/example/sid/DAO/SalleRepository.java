package com.example.sid.DAO;

import com.example.sid.entits.Salle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



@RepositoryRestResource
public interface SalleRepository extends JpaRepository<Salle,Long> {

}