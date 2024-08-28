package com.hotelmanagement.daw_jlinares.repository;

import com.hotelmanagement.daw_jlinares.model.Atencion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface IAtencionesRepository extends JpaRepository<Atencion, Long> {
    List<Atencion> findByFechaAtencion(Date fechaAtencion);
}
