package com.biocore.fingerprint.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class HobbyDto {
    
    @NotEmpty
    @Size(min = 3, message = "should be of at least 3 characters.")
    String hobby;
}
