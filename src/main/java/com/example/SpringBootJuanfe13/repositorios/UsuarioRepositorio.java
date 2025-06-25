package com.example.SpringBootJuanfe13.repositorios;

import com.example.SpringBootJuanfe13.modelos.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends jpaRepository<Usuario, Integer> {
    
}
