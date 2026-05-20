package com.raiztech.raiztech_api.controller;

import com.raiztech.raiztech_api.entity.Planta;
import com.raiztech.raiztech_api.repository.PlantaRepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/plantas")
public class PlantaController {

    private final PlantaRepository repository;

    public PlantaController(PlantaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Planta> listarPlantas() {
        return repository.findAll();
    }

    @PostMapping
    public Planta salvarPlanta(@RequestBody Planta planta) {
        return repository.save(planta);
    }
}
