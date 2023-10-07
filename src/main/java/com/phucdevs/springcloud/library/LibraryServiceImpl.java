package com.phucdevs.springcloud.library;

import com.phucdevs.springcloud.common.DataCommon;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class LibraryServiceImpl implements LibraryService {
    
    private final DataCommon dataCommon;
    
    @Override
    public List<LibraryDTO> getAll() {
        return dataCommon.getAllLibraries();
    }
}
