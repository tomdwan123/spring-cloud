package com.phucdevs.springcloud.common;

import com.phucdevs.springcloud.library.LibraryDTO;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DataCommon {
    
    private final List<LibraryDTO> libraries;
    
    @PostConstruct
    private void initData() {
        
        libraries.addAll(List.of(
           new LibraryDTO(1, "Book1"),     
           new LibraryDTO(2, "Book2")     
        ));
    }
    
    public List<LibraryDTO> getAllLibraries() {
        return libraries;
    }
}
