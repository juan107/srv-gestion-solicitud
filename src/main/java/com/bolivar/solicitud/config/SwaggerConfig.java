package com.bolivar.solicitud.config;

import java.util.ArrayList;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
	
	@Value("${custom.basePackage}")
	private String basePackage;
	
	@Value("${custom.descApi}")
	private String descApi;
	
	@Value("${custom.tituloApi}")
	private String tituloApi;
	
	@Value("${custom.versionApi}")
	private String versionAPI;
	
	@Value("${custom.terminosServicio}")
	private String terminosServicio;
	
	@Value("${custom.devEmail}")
	private String devEmail;
	
	@Value("${custom.devSite}")
	private String devSite;
	
	@Value("${custom.devUser}")
	private String devUser;
	
	@Value("${custom.licenciaName}")
	private String licenceName;
	
	@Value("${custom.licenciaVersion}")
	private String licenceVersion;

	@Bean
	public OpenAPI openApi() {
        return new OpenAPI()
        	.info(new Info()
			.title(tituloApi)
			.version(versionAPI)
			.description(descApi));
    }
}
