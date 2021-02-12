package com.bolivar.solicitud.model;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BolivarHeader {

    @Parameter(in = ParameterIn.HEADER, name = "UUID", required = true)
    private String uuid;
    @Parameter(in = ParameterIn.HEADER, name = "login", required = true)
    private String login;
    @Parameter(in = ParameterIn.HEADER, name = "authorization", required = true)
    private String authorization;
    @Parameter(in = ParameterIn.HEADER, name = "requestIp", required = true)
    private String requestIp;
}