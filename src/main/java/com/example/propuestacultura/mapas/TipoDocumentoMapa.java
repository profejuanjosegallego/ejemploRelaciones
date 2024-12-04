package com.example.propuestacultura.mapas;

import com.example.propuestacultura.dto.TipoDocumentoDTO;
import com.example.propuestacultura.models.TipoDocumento;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface TipoDocumentoMapa {
    @Mappings({
            @Mapping(source = "tipo_documento", target = "tipo_documento")
    })
    TipoDocumentoDTO tipoDocumentoToDTO(TipoDocumento tipoDocumento);

}
