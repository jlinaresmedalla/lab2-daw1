package com.hotelmanagement.daw_jlinares.controller;

import com.hotelmanagement.daw_jlinares.model.Producto;
import com.hotelmanagement.daw_jlinares.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/producto")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public ResponseEntity<List<Producto>> listarProductos() {
        return ResponseEntity.ok(productoService.listarProductos());
    }

//    public Page<Producto> listarProductos(
//            @RequestParam(defaultValue = "0") int page,
//            @RequestParam(defaultValue = "10") int size) {
//        Pageable pageable = PageRequest.of(page, size);
//        return productoService.listarProductosPorPagina(pageable);
//    }

    @GetMapping("/{id}")
    public ResponseEntity<Producto> buscarProductoPorId(@PathVariable String id) {
        return ResponseEntity.ok(productoService.buscarProductoPorId(id));
    }

    @PostMapping
    public ResponseEntity<Producto> grabarProducto(@Validated @RequestBody Producto producto) {
        Producto nuevo = productoService.grabarProducto(producto);
        return new ResponseEntity<>(nuevo, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Producto> actualizarProducto(@PathVariable String id, @Validated @RequestBody Producto producto) {
        Producto p = productoService.buscarProductoPorId(id);
        p.setDes_prod(producto.getDes_prod());
        p.setStk_prod(producto.getStk_prod());
        p.setPre_prod(producto.getPre_prod());
        p.setIdcategoria(producto.getIdcategoria());
        p.setEst_prod(producto.getEst_prod());
        p.setIdproveedor(producto.getIdproveedor());
        productoService.actualizarProducto(p);

        return new ResponseEntity<>(p, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public String borrarProductoPorId(@PathVariable String id) {
        return productoService.borrarProductoPorId(id);
    }

}
