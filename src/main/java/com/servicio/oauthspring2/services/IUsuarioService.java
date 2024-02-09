package com.servicio.oauthspring2.services;

import com.servicio.commons.usuarios.models.entity.Usuario;

public interface IUsuarioService {
    public Usuario findByUsername(String username);

    public Usuario update(Usuario usuario, Long id);
}
