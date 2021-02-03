package com.bolivar.solicitud.service.impl;

import com.bolivar.error.handling.exception.BolivarBusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolivar.solicitud.model.Solicitud;
import com.bolivar.solicitud.repository.GestionSolicitudRepository;
import com.bolivar.solicitud.service.GestionSolicitudService;

@Service
public class GestionSolicitudServiceImpl implements GestionSolicitudService {

	@Autowired
	private GestionSolicitudRepository gestionSolicitudRepository;

	@Override
	public Solicitud crearSolicitud(Solicitud solicitud) throws Exception{
		throw BolivarBusinessException.builder().codigo("Este codigo").mensaje("este mensaje").build();
		//return gestionSolicitudRepository.save(solicitud);
	}
}
