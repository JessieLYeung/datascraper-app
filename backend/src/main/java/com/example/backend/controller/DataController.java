package com.example.backend.controller;

import com.example.backend.model.DataItem;
import com.example.backend.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/data")
@CrossOrigin(origins = "http://localhost:3000")
public class DataController {

    @Autowired
    private DataRepository repository;

    @GetMapping
    public List<DataItem> getAllData() {
        return repository.findAll();
    }

    @PostMapping
    public DataItem createData(@RequestBody DataItem item) {
        return repository.save(item);
    }
}
