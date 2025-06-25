package com.example.SpringBootJuanfe13.servicios;

import com.example.SpringBootJuanfe13.modelos.Usuario;
import com.example.SpringBootJuanfe13.repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

public class UsuarioServicio {

    @Autowired
    UsuarioRepositorio consulta;

    //operacion 1 GUARDARR EN BD UN USUARIO
    public boolean guardarUsuarioEnBD(Usuario datosEnviados) throws Exception{

        try{ //camino correcto TODO SALE BIEN
            consulta.save(datosEnviados);
            return true;
        }catch(Exception error) { //camino del error CUENTO PORQUE FALLO
            throw new Exception(error.getMessage());
        }


    }
}
