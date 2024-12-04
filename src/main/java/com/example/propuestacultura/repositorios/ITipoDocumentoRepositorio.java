package com.example.propuestacultura.repositorios;

import com.example.propuestacultura.models.TipoDocumento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoDocumentoRepositorio extends JpaRepository<TipoDocumento,Integer> {
}
