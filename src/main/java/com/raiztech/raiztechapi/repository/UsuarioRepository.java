package com.raiztech.raiztech_api.repository;

import com.raiztech.raiztech_api.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
