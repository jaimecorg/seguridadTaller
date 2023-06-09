package com.jaimecorg.seguridadtaller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jaimecorg.seguridadtaller.model.Permiso;

@Repository
public interface PermisoRepository extends JpaRepository<Permiso, Integer>{
    
}
