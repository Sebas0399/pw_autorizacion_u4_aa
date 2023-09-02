package com.example.pw_autorizacion_u4_aa.service.to;

import java.io.Serializable;

public class TokenTO implements Serializable {
    private String semilla;
    private Long vigencia;

    public String getSemilla() {
        return semilla;
    }

    public void setSemilla(String semilla) {
        this.semilla = semilla;
    }

    public Long getVigencia() {
        return vigencia;
    }

    public void setVigencia(Long vigencia) {
        this.vigencia = vigencia;
    }
}
