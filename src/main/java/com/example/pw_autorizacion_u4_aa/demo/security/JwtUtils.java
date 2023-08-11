package com.example.pw_autorizacion_u4_aa.demo.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.Authentication;

import java.util.Date;

public class JwtUtils {
    public String generateJwtToken(Authentication authentication, String name) {

        return Jwts.builder().setSubject(name).
                setIssuedAt(new Date()).
                setExpiration(new Date(System.currentTimeMillis() + 100000)).
                signWith(SignatureAlgorithm.HS512, "semilla1").compact();
    }
}
