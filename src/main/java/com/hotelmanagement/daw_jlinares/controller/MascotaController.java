package com.hotelmanagement.daw_jlinares.controller;

import com.hotelmanagement.daw_jlinares.model.Mascota;
import com.hotelmanagement.daw_jlinares.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/mascotas")
@CrossOrigin(origins = "http://localhost:4200")
public class MascotaController {
    @Autowired
    private MascotaService mascotaService;

    @GetMapping
    public List<Mascota> listarMascotas() {
        return mascotaService.listarMascotas();
    }
}
