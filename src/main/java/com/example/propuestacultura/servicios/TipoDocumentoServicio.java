package com.example.propuestacultura.servicios;

import com.example.propuestacultura.dto.TipoDocumentoDTO;
import com.example.propuestacultura.mapas.TipoDocumentoMapa;
import com.example.propuestacultura.models.TipoDocumento;
import com.example.propuestacultura.repositorios.ITipoDocumentoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoDocumentoServicio {

    @Autowired
    ITipoDocumentoRepositorio iTipoDocumentoRepositorio;

    @Autowired
    TipoDocumentoMapa tipoDocumentoMapa;

    public TipoDocumentoDTO agregarTipoDocumento(TipoDocumento datos) throws Exception{
        try{
            return this.tipoDocumentoMapa.tipoDocumentoToDTO(iTipoDocumentoRepositorio.save(datos));
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

}
