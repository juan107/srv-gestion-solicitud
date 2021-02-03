package com.bolivar.solicitud.controller;

import javax.validation.Valid;

import com.bolivar.solicitud.model.BolivarHeader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.bolivar.solicitud.model.Solicitud;
import com.bolivar.solicitud.service.GestionSolicitudService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import java.net.http.HttpHeaders;

@RestController
public class GestionSolicitudController {
	
	@Autowired
	private GestionSolicitudService gestionSolicitudService;
	
	@PostMapping(value = "/solicitud")
	@ApiOperation(value = "Creacion de Solicitud", response = Solicitud.class, httpMethod = "POST")
	@ApiResponses({
		@ApiResponse(code = 200, message = "La solicitud se creo satisfactoriamente."),
		@ApiResponse(code = 400, message = "Datos de entrada incorrectos."),
		@ApiResponse(code = 500, message = "Error inesperado.")
	})
	public Solicitud crearTercero(@RequestHeader BolivarHeader header,
			@Valid @RequestBody Solicitud solicitud) throws Exception{
		return gestionSolicitudService.crearSolicitud(solicitud);
	}
}
