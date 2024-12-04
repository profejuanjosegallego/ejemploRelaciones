package com.example.propuestacultura.dto.errorDTO;

public class TipoDocumentoErrorDTO {

    private String mensaje;

    public TipoDocumentoErrorDTO() {
    }

    public TipoDocumentoErrorDTO(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
