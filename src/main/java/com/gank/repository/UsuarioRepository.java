package com.gank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gank.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
