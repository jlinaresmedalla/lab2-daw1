package com.hotelmanagement.daw_jlinares.service;

import com.hotelmanagement.daw_jlinares.model.Producto;
import com.hotelmanagement.daw_jlinares.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private IProductoRepository iProductoRepository;

    public List<Producto> listarProductos() {
        return iProductoRepository.findAll();
    }

    public Page<Producto> listarProductosPorPagina(Pageable pageable) {
        return iProductoRepository.findAll(pageable);
    }

    public Producto grabarProducto(Producto producto) {
        return iProductoRepository.save(producto);
    }

    public Producto buscarProductoPorId(String id) {
        return iProductoRepository.findById(id).get();
    }

    public String borrarProductoPorId(String id) {
        iProductoRepository.deleteById(id);
        return "Producto eliminado";
    }

    public Producto actualizarProducto(Producto producto) {
        return iProductoRepository.save(producto);
    }
}
