package com.phucdevs.springcloud.common;

import com.phucdevs.springcloud.library.LibraryDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Component
@RequiredArgsConstructor
public class DataCommon {
    
    private final List<LibraryDTO> libraries;
    
    @PostConstruct
    private void initData() {
        libraries.addAll(Arrays.asList(
           new LibraryDTO(1, "Book1"),     
           new LibraryDTO(2, "Book2")     
        ));
    }
    
    public List<LibraryDTO> getAllLibraries() {
        return libraries;
    }
}
