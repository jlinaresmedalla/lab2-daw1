package com.hotelmanagement.daw_jlinares.service;

import com.hotelmanagement.daw_jlinares.model.Atencion;
import com.hotelmanagement.daw_jlinares.repository.IAtencionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class AtencionService {
    @Autowired
    private IAtencionesRepository iAtencionRepository;

    public List<Atencion> listarAtenciones() {
        return iAtencionRepository.findAll();
    }

    public Atencion grabarAtencion(Atencion atencion) {
        return iAtencionRepository.save(atencion);
    }

    public Optional<Atencion> buscarAtencionPorId(Long id) {
        return iAtencionRepository.findById(id);
    }

    public String borrarAtencionPorId(Long id) {
        iAtencionRepository.deleteById(id);
        return "Atención eliminada";
    }

    public Atencion actualizarAtencion(Atencion atencion) {
        return iAtencionRepository.save(atencion);
    }

    public List<Atencion> listarAtencionesPorFecha(Date fechaAtencion) {
        return iAtencionRepository.findByFechaAtencion(fechaAtencion);
    }
}
