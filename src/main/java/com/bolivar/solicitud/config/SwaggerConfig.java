package com.bolivar.solicitud.config;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
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
	public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)
        	.select()                                   
        	.apis(RequestHandlerSelectors.basePackage(basePackage))
        	.paths(PathSelectors.any())
        	.build().apiInfo(metaData());
    }
	
	private ApiInfo metaData() {
        @SuppressWarnings("rawtypes")
		ApiInfo apiInfo = new ApiInfo(tituloApi, descApi,
                versionAPI, terminosServicio, new Contact(devUser, devSite, devEmail),
                licenceVersion, licenceName,new ArrayList<VendorExtension>());
        return apiInfo;
    }
}
