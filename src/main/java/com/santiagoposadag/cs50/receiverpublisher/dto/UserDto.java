package com.santiagoposadag.cs50.receiverpublisher.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto implements Serializable {

    private String name;
    private String lastname;
    private String dni;
    private String routingKey;
}


