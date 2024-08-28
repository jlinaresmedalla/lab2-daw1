package com.hotelmanagement.daw_jlinares.service;

import com.hotelmanagement.daw_jlinares.model.Mascota;
import com.hotelmanagement.daw_jlinares.repository.IMascotasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService {
    @Autowired
    private IMascotasRepository iMascotaRepository;

    public List<Mascota> listarMascotas() {
        return iMascotaRepository.findAll();
    }
}
