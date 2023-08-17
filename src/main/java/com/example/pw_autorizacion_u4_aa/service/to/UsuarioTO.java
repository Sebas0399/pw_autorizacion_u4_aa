package com.example.pw_autorizacion_u4_aa.service.to;

import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;

public class UsuarioTO extends RepresentationModel<UsuarioTO> implements Serializable {

    

    Integer id;

    String nombre;

    String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
