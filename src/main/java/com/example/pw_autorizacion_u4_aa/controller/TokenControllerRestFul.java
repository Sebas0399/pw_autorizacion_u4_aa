package com.example.pw_autorizacion_u4_aa.controller;

import com.example.pw_autorizacion_u4_aa.service.to.UsuarioTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/tokens")
public class TokenControllerRestFul {

    @GetMapping
    public String getToken(@RequestBody UsuarioTO usuario){
        return "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
    }


}
