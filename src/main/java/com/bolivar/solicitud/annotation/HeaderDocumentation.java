package com.bolivar.solicitud.annotation;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.enums.ParameterIn;

import java.lang.annotation.*;

@Inherited
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Parameters({@Parameter(name = "UUID", in = ParameterIn.HEADER, description = "Identificador unico de la transaccion" )})
public @interface HeaderDocumentation {
}
