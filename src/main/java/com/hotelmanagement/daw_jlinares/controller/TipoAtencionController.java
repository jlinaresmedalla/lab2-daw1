package com.hotelmanagement.daw_jlinares.controller;

import com.hotelmanagement.daw_jlinares.model.TipoAtencion;
import com.hotelmanagement.daw_jlinares.service.TipoAtencionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tipoatenciones")
@CrossOrigin(origins = "http://localhost:4200")
public class TipoAtencionController {

    @Autowired
    private TipoAtencionService tipoAtencionService;

    @GetMapping
    public List<TipoAtencion> listarTiposAtencion() {
        return tipoAtencionService.listarTiposAtencion();
    }
}
