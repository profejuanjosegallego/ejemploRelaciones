package com.example.propuestacultura.dto;

import java.util.UUID;

public class DocumentoAdjuntoPropuestaDTO {

    private UUID id_propuesta;
    private Integer id_documentoAdjunto;
    private String nombre_documento;

    public DocumentoAdjuntoPropuestaDTO() {
    }

    public UUID getId_propuesta() {
        return id_propuesta;
    }

    public void setId_propuesta(UUID id_propuesta) {
        this.id_propuesta = id_propuesta;
    }

    public Integer getId_documentoAdjunto() {
        return id_documentoAdjunto;
    }

    public void setId_documentoAdjunto(Integer id_documentoAdjunto) {
        this.id_documentoAdjunto = id_documentoAdjunto;
    }

    public String getNombre_documento() {
        return nombre_documento;
    }

    public void setNombre_documento(String nombre_documento) {
        this.nombre_documento = nombre_documento;
    }
}
