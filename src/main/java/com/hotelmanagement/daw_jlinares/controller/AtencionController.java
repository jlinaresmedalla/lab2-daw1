package com.hotelmanagement.daw_jlinares.controller;

import com.hotelmanagement.daw_jlinares.model.Atencion;
import com.hotelmanagement.daw_jlinares.service.AtencionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/atenciones")
@CrossOrigin(origins = "http://localhost:4200")
public class AtencionController {
    @Autowired
    private AtencionService atencionService;

    @GetMapping
    public List<Atencion> listarAtenciones() {
        return atencionService.listarAtenciones();
    }

    @PostMapping
    public Atencion crearAtencion(@RequestBody Atencion atencion) {
        return atencionService.grabarAtencion(atencion);
    }

    @GetMapping("/{id}")
    public Optional<Atencion> obtenerAtencionPorId(@PathVariable Long id) {
        return atencionService.buscarAtencionPorId(id);
    }

    @DeleteMapping("/{id}")
    public String borrarAtencion(@PathVariable Long id) {
        return atencionService.borrarAtencionPorId(id);
    }

    @PutMapping("/{id}")
    public Atencion actualizarAtencion(@PathVariable Long id, @RequestBody Atencion atencion) {
        atencion.setCodigo(id);
        return atencionService.actualizarAtencion(atencion);
    }

    @GetMapping("/por-fecha")
    public List<Atencion> obtenerAtencionesPorFecha(@RequestParam("fecha") Date fechaAtencion) {
        return atencionService.listarAtencionesPorFecha(fechaAtencion);
    }
}
