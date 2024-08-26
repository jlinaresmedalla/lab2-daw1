package com.hotelmanagement.daw_jlinares.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_productos")
public class Producto {
    @Id
    private String id_prod;
    @NotBlank(message = "El id del producto es obligatorio")
    @Size(min = 3, max = 45, message = "El id del producto debe tener entre 3 y 45 caracteres")
    private String des_prod;
    private int stk_prod;
    private float pre_prod;
    private int idcategoria;
    private int est_prod;
    private int idproveedor;

    @ManyToOne
    @JoinColumn(name = "idcategoria", referencedColumnName = "idcategoria",insertable = false, updatable = false)
    private Categoria objCategoria;

}
