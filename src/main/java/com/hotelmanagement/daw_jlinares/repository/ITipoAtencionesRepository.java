package com.hotelmanagement.daw_jlinares.repository;

import com.hotelmanagement.daw_jlinares.model.TipoAtencion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoAtencionesRepository extends JpaRepository<TipoAtencion, String> {
}
