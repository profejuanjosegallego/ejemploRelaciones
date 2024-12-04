package com.example.propuestacultura.mapas;

import com.example.propuestacultura.dto.TipoProponenteDTO;
import com.example.propuestacultura.models.TipoProponente;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TipoProponenteMapa {

    @Mapping(source = "tipo_proponente", target = "tipo_proponente")
    TipoProponenteDTO tipoProponenteToDTO(TipoProponente tipoProponente);

}
