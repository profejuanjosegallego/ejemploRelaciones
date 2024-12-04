package com.example.propuestacultura.dto;

public class DocumentosAdjuntosDTO {

    private String nombre_documento;
    private String URL;

    public DocumentosAdjuntosDTO() {
    }

    public DocumentosAdjuntosDTO(String nombre_documento, String URL) {
        this.nombre_documento = nombre_documento;
        this.URL = URL;
    }

    public String getNombre_documento() {
        return nombre_documento;
    }

    public void setNombre_documento(String nombre_documento) {
        this.nombre_documento = nombre_documento;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}
