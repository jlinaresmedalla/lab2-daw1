package com.hotelmanagement.daw_jlinares.repository;

import com.hotelmanagement.daw_jlinares.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, String> {
}
