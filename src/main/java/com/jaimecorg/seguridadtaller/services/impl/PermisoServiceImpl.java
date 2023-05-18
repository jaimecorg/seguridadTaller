package com.jaimecorg.seguridadtaller.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jaimecorg.seguridadtaller.model.Permiso;
import com.jaimecorg.seguridadtaller.repository.PermisoRepository;
import com.jaimecorg.seguridadtaller.services.PermisoService;

@Service
public class PermisoServiceImpl implements PermisoService{
    
    @Autowired
    PermisoRepository repository;
    
    @Override
    public List<Permiso> findAll() {
        return repository.findAll();
    }

    @Override
    public Permiso findById(int id) {
        Optional<Permiso> findById = repository.findById(id);
        if(findById != null){
            return findById.get();
        }
        return null;
    }

    @Override
    public Permiso save(Permiso permiso) {
        return repository.save(permiso);

    }

    @Override
    public void update(int id, Permiso permiso) {
        this.findById(id);
        permiso.setCodigo(id);
        repository.save(permiso);
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }
    
}
