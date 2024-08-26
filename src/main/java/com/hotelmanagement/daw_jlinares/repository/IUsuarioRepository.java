package com.hotelmanagement.daw_jlinares.repository;

import com.hotelmanagement.daw_jlinares.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
    Usuario findByCorreoAndClave(String correo, String clave);
}
