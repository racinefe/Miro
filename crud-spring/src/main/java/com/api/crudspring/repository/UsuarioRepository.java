package com.api.crudspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.api.crudspring.model.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
}
