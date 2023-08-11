package com.example.pw_autorizacion_u4_aa.service;

import com.example.pw_autorizacion_u4_aa.repo.IUsuarioRepo;
import com.example.pw_autorizacion_u4_aa.repo.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import static java.util.Collections.emptyList;

@Service
public class UsuarioServiceImpl implements UserDetailsService {
    @Autowired
    private IUsuarioRepo usuarioRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario=this.usuarioRepo.readByUserName(username);
        return new User(usuario.getNombre(),usuario.getPassword(),emptyList());
    }
}
