package com.hotelmanagement.daw_jlinares.service;

import com.hotelmanagement.daw_jlinares.model.TipoAtencion;
import com.hotelmanagement.daw_jlinares.repository.ITipoAtencionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoAtencionService {
    @Autowired
    private ITipoAtencionesRepository iTipoAtencionRepository;

    public List<TipoAtencion> listarTiposAtencion() {
        return iTipoAtencionRepository.findAll();
    }
}
