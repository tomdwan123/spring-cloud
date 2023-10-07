package com.phucdevs.springcloud.library;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/v1/libraries")
public class LibraryController {
    
    private final LibraryService libraryService;
    
    @GetMapping()
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(libraryService.getAll(), HttpStatus.OK);
    }
}
