package com.example.propuestacultura.dto;

import com.example.propuestacultura.models.TipoDocumento;

import java.util.UUID;

public class ProponenteDTO {

    private String nombre_proponente;
    private String trayectoria;
    private UUID id_representante;
    private String tipo_proponente;

    public ProponenteDTO() {
    }

    public String getNombre_proponente() {
        return nombre_proponente;
    }

    public void setNombre_proponente(String nombre_proponente) {
        this.nombre_proponente = nombre_proponente;
    }

    public String getTrayectoria() {
        return trayectoria;
    }

    public void setTrayectoria(String trayectoria) {
        this.trayectoria = trayectoria;
    }

    public UUID getId_representante() {
        return id_representante;
    }

    public void setId_representante(UUID id_representante) {
        this.id_representante = id_representante;
    }

    public String getTipo_proponente() {
        return tipo_proponente;
    }

    public void setTipo_proponente(String tipo_proponente) {
        this.tipo_proponente = tipo_proponente;
    }
}
