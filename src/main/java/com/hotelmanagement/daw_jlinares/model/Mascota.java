package com.hotelmanagement.daw_jlinares.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_mascotas")
public class Mascota {
    @Id
    private String codMascota;

    @NotBlank(message = "El nombre de la mascota es obligatorio")
    @Size(min = 3, max = 100, message = "El nombre de la mascota debe tener entre 3 y 100 caracteres")
    private String nombreMascota;

    @NotBlank(message = "El nombre del dueño es obligatorio")
    @Size(min = 3, max = 100, message = "El nombre del dueño debe tener entre 3 y 100 caracteres")
    private String nombreDueno;

    private float pesoMascota;

    @NotBlank(message = "El tipo de mascota es obligatorio")
    private String tipoMascota;
}