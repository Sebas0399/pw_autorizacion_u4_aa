package com.example.pw_autorizacion_u4_aa.repo;

import com.example.pw_autorizacion_u4_aa.repo.model.Usuario;

public interface IUsuarioRepo {
    public Usuario readByUserName(String userName);
}
