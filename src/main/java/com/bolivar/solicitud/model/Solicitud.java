package com.bolivar.solicitud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModelProperty.AccessMode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "SOLICITUD")
@ApiModel (value = "Solicitud")
@Entity
public class Solicitud {
	
	@ApiModelProperty(name = "idSolicitud", accessMode = AccessMode.READ_ONLY)
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SOLICITUD_SEQ")
    @SequenceGenerator(sequenceName = "SOLICITUD_SEQ", allocationSize = 1, name = "SOLICITUD_SEQ")
	private Long id;
	
	@ApiModelProperty(name = "valorCanonArrendamiento", required = true, value = "Valor del Canon de Arrendamiento")
	@NotNull(message = "El Valor del Canon de Arrendamiento no puede ser nulo")
	private Long valorCanonArrendamiento;
	
	@ApiModelProperty(name = "idTercero", required = true, value = "Identificador del Tercero Asociado a la Solicitud")
	@NotNull(message = "El Identificador del Tercero no puede ser nulo")
	private Long idTercero;
}
