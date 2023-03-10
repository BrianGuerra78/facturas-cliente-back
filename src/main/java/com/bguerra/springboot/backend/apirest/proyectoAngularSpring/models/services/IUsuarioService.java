package com.bguerra.springboot.backend.apirest.proyectoAngularSpring.models.services;

import com.bguerra.springboot.backend.apirest.proyectoAngularSpring.models.entity.Usuario;

public interface IUsuarioService {

    public Usuario findByUsername(String username);
}
