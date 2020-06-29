package com.kamil.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kamil.entity.SchoolClass;

@Repository
public interface SchoolClassRepository extends CrudRepository<SchoolClass, Long> {
    
    List<SchoolClass> findByName(String name);
    
}
