package com.jaimecorg.seguridadtaller.services;

import org.springframework.stereotype.Service;

import java.util.List;

import com.jaimecorg.seguridadtaller.model.Usuario;

@Service
public interface UsuarioService {
    
    public List<Usuario> findAll();
    public Usuario findById(int id);
    public Usuario save(Usuario usuario);
    public Usuario update(int id, Usuario usuario);
    public void deleteById(int id);
    public void deleteAll();
    public Usuario findByNombre(String username);
}
