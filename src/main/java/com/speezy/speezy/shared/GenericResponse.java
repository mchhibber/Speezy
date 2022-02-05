package com.speezy.speezy.shared;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor // jackson requires no args constructor to work
public class GenericResponse {

    private String message;

    public GenericResponse(String message) {
        this.message = message;
    }
}
