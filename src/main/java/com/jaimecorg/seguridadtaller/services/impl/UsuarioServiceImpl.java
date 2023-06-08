package com.jaimecorg.seguridadtaller.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.jaimecorg.seguridadtaller.model.Usuario;
import com.jaimecorg.seguridadtaller.repository.UsuarioRepository;
import com.jaimecorg.seguridadtaller.services.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{
    @Autowired
    UsuarioRepository repository;
    
    @Override
    public List<Usuario> findAll() {
        return repository.findAll();
    }

    @Override
    public Usuario findById(int id) {
        Optional<Usuario> findById = repository.findById(id);
        if(findById != null){
            return findById.get();
        }
        
        return null;
    }

    @Override
    public Usuario save(Usuario usuario) {
        return repository.save(usuario);
    }

    @Override
    public void update(int id, Usuario usuario) {
        this.findById(id);
        usuario.setCodigo(id);
        repository.save(usuario);
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }

    @Override
    public Usuario findByNombre(String username) {
        return repository.findByNombre(username);

    } 
}
