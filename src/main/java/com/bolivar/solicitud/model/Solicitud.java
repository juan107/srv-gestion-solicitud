package com.bolivar.solicitud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "SOLICITUD")
@Schema(name = "Solicitud")
@Entity
public class Solicitud {
	
	@Schema(name = "idSolicitud", accessMode = Schema.AccessMode.READ_ONLY)
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SOLICITUD_SEQ")
    @SequenceGenerator(sequenceName = "SOLICITUD_SEQ", allocationSize = 1, name = "SOLICITUD_SEQ")
	private Long id;
	
	@Schema(name = "canonArrendamiento", required = true, description = "Valor del Canon de Arrendamiento")
	@NotNull(message = "El Valor del Canon de Arrendamiento no puede ser nulo")
	private Long valorCanonArrendamiento;
	
	@Schema(name = "idTercero", required = true, description = "Identificador del Tercero Asociado a la Solicitud")
	@NotNull(message = "El Identificador del Tercero no puede ser nulo")
	private Long idTercero;
}
