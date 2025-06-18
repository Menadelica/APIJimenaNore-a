package com.example.SpringBootJuanfe13.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //configurar el nombre que quiero que tenga la columna en la base de datos. lengt solo aplica a los strings
    @Column(name = "nombres", length = 50)
    private String nombres;
    @Column(name = "contraseña", length = 60)
    private String contraseña;
    @Column(name = "correo", length = 50)
    private String correo;
    @Column(name = "edad")
    private Integer edad;
    @Column(name = "FechaNacimiento")
    private LocalDate fechaNacimiento;

    public Usuario() {
    }

    public Usuario(Integer id, String nombres, String contraseña, String correo, Integer edad, LocalDate fechaNacimiento) {
        this.id = id;
        this.nombres = nombres;
        this.contraseña = contraseña;
        this.correo = correo;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }
}
