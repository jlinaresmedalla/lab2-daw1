package com.hotelmanagement.daw_jlinares.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "tb_atenciones")
public class Atencion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @NotBlank(message = "El código de la mascota es obligatorio")
    private String codMascota;

    @NotBlank(message = "El tipo de atención es obligatorio")
    private String tipoAtencion;

    @Temporal(TemporalType.DATE)
    private Date fechaAtencion;

    @Temporal(TemporalType.TIME)
    private Date hora;

    @NotBlank(message = "El estado es obligatorio")
    private String estado;

    @ManyToOne
    @JoinColumn(name = "codMascota", referencedColumnName = "codMascota", insertable = false, updatable = false)
    private Mascota mascota;

    @ManyToOne
    @JoinColumn(name = "tipoAtencion", referencedColumnName = "tipoAtencion", insertable = false, updatable = false)
    private TipoAtencion tipoAtencionObj;
}