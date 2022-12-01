package com.masudbappy.webfluxdemo.dto;



import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class Response {
    private Date data = new Date();
    private int output;

    public Response(int output) {
        this.output = output;
    }
}
