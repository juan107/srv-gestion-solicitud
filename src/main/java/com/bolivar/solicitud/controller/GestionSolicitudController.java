package com.bolivar.solicitud.controller;

import javax.validation.Valid;

import com.bolivar.error.handling.model.ExceptionModel;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bolivar.solicitud.model.Solicitud;
import com.bolivar.solicitud.service.GestionSolicitudService;

import java.util.Date;

@RestController
@Tag(name = "Administracion de Solicitud", description = "Agrupacion de las operaciones de administracion de la solicitud")
public class GestionSolicitudController {
	
	@Autowired
	private GestionSolicitudService gestionSolicitudService;
	
	@PostMapping(value = "/solicitud", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@Operation(summary = "Creacion de Solicitud")
	@ApiResponses({
		@ApiResponse(responseCode = "200", description = "La solicitud se creo satisfactoriamente.",content = @Content(schema = @Schema(implementation = Solicitud.class))),
		@ApiResponse(responseCode = "400", description = "Datos de entrada incorrectos.", content = @Content(schema = @Schema(implementation = ExceptionModel.class))),
		@ApiResponse(responseCode = "500", description = "Error inesperado.", content = @Content(schema = @Schema(implementation = ExceptionModel.class)))
	})
	public Solicitud crearTercero	(
			@Valid @RequestBody Solicitud solicitud) throws Exception{
		return gestionSolicitudService.crearSolicitud(solicitud);
	}
}
