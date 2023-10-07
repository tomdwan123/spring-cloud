package com.phucdevs.springcloud.library;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@JsonPropertyOrder(value = "name")
@AllArgsConstructor
@Getter
@Setter
public class LibraryDTO {
    
    int id;
    String name;
}
