package com.example.demospringbootdatarest.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.demospringbootdatarest.model.Persona;

@RepositoryRestResource(collectionResourceRel = "personas", path = "personas")
public interface PersonaRepository extends PagingAndSortingRepository<Persona, Integer> {
 
	@RestResource(path = "byName", rel = "byName")
	Page<Persona> findByNombreContains(@Param("nombre") String nombre, Pageable pageable);
}
