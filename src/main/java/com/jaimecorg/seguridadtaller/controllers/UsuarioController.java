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

import com.jaimecorg.seguridadtaller.model.Usuario;
import com.jaimecorg.seguridadtaller.repository.UsuarioRepository;
import com.jaimecorg.seguridadtaller.services.PermisoService;
import com.jaimecorg.seguridadtaller.services.UsuarioService;

@RestController
public class UsuarioController {
    @Autowired
    UsuarioService service;

    @Autowired
    PermisoService permisoService;

    @Autowired
    UsuarioRepository repository;

    @GetMapping("/usuarios")
    List<Usuario> all(){
        return service.findAll();
    }
    
    @GetMapping("/usuarios/{id}")
    Usuario findUsuario(@PathVariable int id){
        return service.findById(id);
    }

    @DeleteMapping("/usuarios/{id}")
    void deleteUsuario(@PathVariable int id){
        service.deleteById(id);
    }

    @PostMapping("/usuarios")
    Usuario crearUsuario(@RequestBody Usuario usuario){
        //Permiso permiso = permisoService.findById(usuario.getPermisos());
        service.save(usuario);
        return usuario;
    }

    @PutMapping("/usuarios/{id}")
    void modificarUsuario(@PathVariable int id, @RequestBody Usuario usuario){
        service.update(id, usuario);
    }

    @GetMapping("/usuarios/buscar/{nombre}")
    Usuario buscarPorNombre(@PathVariable String nombre){
        return service.findByNombre(nombre);
    }
}
