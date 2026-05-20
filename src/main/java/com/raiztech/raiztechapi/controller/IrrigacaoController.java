package com.raiztech.raiztech_api.controller;

import com.raiztech.raiztech_api.entity.Irrigacao;
import com.raiztech.raiztech_api.repository.IrrigacaoRepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/irrigacoes")
public class IrrigacaoController {

    private final IrrigacaoRepository repository;

    public IrrigacaoController(IrrigacaoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Irrigacao> listarIrrigacoes() {
        return repository.findAll();
    }

    @PostMapping
    public Irrigacao salvarIrrigacao(@RequestBody Irrigacao irrigacao) {
        return repository.save(irrigacao);
    }
}
