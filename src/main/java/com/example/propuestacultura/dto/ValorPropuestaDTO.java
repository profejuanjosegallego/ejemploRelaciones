package com.example.propuestacultura.dto;

import java.util.UUID;

public class ValorPropuestaDTO {

    private UUID id_propuesta;
    private Double monto_total_propuesta;
    private Double aporte_comfama;

    public ValorPropuestaDTO() {
    }

    public ValorPropuestaDTO(UUID id_propuesta, Double monto_total_propuesta,
                             Double aporte_comfama) {
        this.id_propuesta = id_propuesta;
        this.monto_total_propuesta = monto_total_propuesta;
        this.aporte_comfama = aporte_comfama;
    }

    public UUID getId_propuesta() {
        return id_propuesta;
    }

    public void setId_propuesta(UUID id_propuesta) {
        this.id_propuesta = id_propuesta;
    }

    public Double getMonto_total_propuesta() {
        return monto_total_propuesta;
    }

    public void setMonto_total_propuesta(Double monto_total_propuesta) {
        this.monto_total_propuesta = monto_total_propuesta;
    }

    public Double getAporte_comfama() {
        return aporte_comfama;
    }

    public void setAporte_comfama(Double aporte_comfama) {
        this.aporte_comfama = aporte_comfama;
    }
}
