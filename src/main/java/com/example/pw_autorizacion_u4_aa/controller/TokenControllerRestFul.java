package com.example.pw_autorizacion_u4_aa.controller;

import com.example.pw_autorizacion_u4_aa.security.JwtUtils;
import com.example.pw_autorizacion_u4_aa.service.to.UsuarioTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.security.Security;

@RestController
@CrossOrigin
@RequestMapping("/tokens")
public class TokenControllerRestFul {
    @Autowired
    private AuthenticationManager authenticationManager;
    
    @Autowired
    private JwtUtils jwtUtils;

    @GetMapping("/obtener")
    public String getToken(@RequestBody UsuarioTO usuario){
        this.autenticated(usuario.getNombre(), usuario.getPassword());
        return this.jwtUtils.generateJwtToken(usuario.getNombre());
    }

    private void autenticated(String usuario,String password){
        Authentication authentication=this.authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(usuario,password));
        SecurityContextHolder.getContext().setAuthentication(authentication);
    }


}
