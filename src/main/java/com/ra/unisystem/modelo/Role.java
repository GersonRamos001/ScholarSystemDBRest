package com.ra.unisystem.modelo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "roles", schema = "UsuariosSistema")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol", nullable = false)
    private Integer id;

    @Column(name = "nombre_rol", nullable = false, length = 50)
    private String nombreRol;

    @OneToMany(mappedBy = "idRol")
    private Set<Usuario> usuarios = new LinkedHashSet<>();

}