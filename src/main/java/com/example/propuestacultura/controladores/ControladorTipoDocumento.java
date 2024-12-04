package com.example.propuestacultura.controladores;


import com.example.propuestacultura.dto.TipoDocumentoDTO;
import com.example.propuestacultura.dto.errorDTO.TipoDocumentoErrorDTO;
import com.example.propuestacultura.models.TipoDocumento;
import com.example.propuestacultura.servicios.TipoDocumentoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/documento")
public class ControladorTipoDocumento {

    @Autowired
    TipoDocumentoServicio tipoDocumentoServicio;


    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody TipoDocumento tipoDocumento){

        try{

            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(tipoDocumentoServicio.agregarTipoDocumento(tipoDocumento));

        }catch(Exception error){
            TipoDocumentoErrorDTO tipoDocumentoErrorDTO = new TipoDocumentoErrorDTO();
            tipoDocumentoErrorDTO.setMensaje(error.getMessage());

            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error);

        }

    }

}
