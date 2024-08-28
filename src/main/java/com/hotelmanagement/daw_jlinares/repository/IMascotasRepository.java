package com.hotelmanagement.daw_jlinares.repository;

import com.hotelmanagement.daw_jlinares.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMascotasRepository extends JpaRepository<Mascota, String> {
}
