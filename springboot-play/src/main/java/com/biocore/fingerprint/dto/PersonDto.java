package com.biocore.fingerprint.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.biocore.fingerprint.model.Address;
import com.biocore.fingerprint.model.Hobby;

@Data
public class PersonDto {
  
    @NotEmpty
    @Size(min = 3, message = "Name should be of at least 3 characters.")
    String name;
    @Min(1)
    int age;

    @Valid
    @NotNull()
    List<Hobby> hobbies = new ArrayList<Hobby>();

    @Valid
    @NotNull()
    Address address = new Address();


}
