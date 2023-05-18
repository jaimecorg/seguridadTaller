package com.jaimecorg.seguridadtaller.services;

import org.springframework.stereotype.Service;

import java.util.List;

import com.jaimecorg.seguridadtaller.model.Permiso;

@Service
public interface PermisoService {
    
    public List<Permiso> findAll();
    public Permiso findById(int id);
    public Permiso save(Permiso permiso);
    public void update(int id, Permiso permiso);
    public void deleteById(int id);
    public void deleteAll();
}
