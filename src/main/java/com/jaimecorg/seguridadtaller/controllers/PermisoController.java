package com.jaimecorg.seguridadtaller.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jaimecorg.seguridadtaller.model.Permiso;
import com.jaimecorg.seguridadtaller.services.PermisoService;

@RestController
public class PermisoController {
    @Autowired
    PermisoService service;

    @GetMapping("/permisos")
    List<Permiso> all(){
        return service.findAll();
    }
    
    @GetMapping("/permisos/{id}")
    Permiso findUsuario(@PathVariable int id){
        return service.findById(id);
    }

    @DeleteMapping("/permisos/{id}")
    void deletePermiso(@PathVariable int id){
        service.deleteById(id);
    }

    @PostMapping("/permisos")
    Permiso crearPermiso(@RequestBody Permiso permiso){
        service.save(permiso);
        return permiso;
    }

    @PutMapping("/permisos/{id}")
    void modificarPermiso(@PathVariable int id, @RequestBody Permiso permiso){
        service.update(id, permiso);
    }
}
