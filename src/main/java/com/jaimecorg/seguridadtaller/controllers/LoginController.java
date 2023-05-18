package com.jaimecorg.seguridadtaller.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jaimecorg.seguridadtaller.model.Usuario;
import com.jaimecorg.seguridadtaller.services.UsuarioService;

@RestController
public class LoginController {
    
    @Autowired
    UsuarioService service;

    @PostMapping(path = { "/login" })
    public Usuario login(@RequestBody Usuario usuario){

        return null;

    }
}
