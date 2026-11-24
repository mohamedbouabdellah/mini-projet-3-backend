package com.mohamed.phones.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.mohamed.phones.entities.Marque;


@RepositoryRestResource(path = "mar")
@CrossOrigin("*")
public interface MarqueRepository extends JpaRepository<Marque , Long> {

}
