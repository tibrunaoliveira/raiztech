package com.raiztech.raiztech_api.controller;

import com.raiztech.raiztech_api.entity.LeituraSensor;
import com.raiztech.raiztech_api.repository.LeituraSensorRepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leituras")
public class LeituraSensorController {

    private final LeituraSensorRepository repository;

    public LeituraSensorController(LeituraSensorRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<LeituraSensor> listarLeituras() {
        return repository.findAll();
    }

    @PostMapping
    public LeituraSensor salvarLeitura(@RequestBody LeituraSensor leitura) {
        return repository.save(leitura);
    }
}
