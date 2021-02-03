package com.bolivar.solicitud.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BolivarHeader {

    private String uuid;
    private String login;
    private String authorization;
    private String requestIp;

}
