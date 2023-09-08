package com.aaron.strategypattern.controller;

import com.aaron.strategypattern.model.Duck;
import com.aaron.strategypattern.service.DuckSimulatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DuckSimulatorController {

    private final DuckSimulatorService duckSimulatorService;

    DuckSimulatorController(DuckSimulatorService duckSimulatorService) {
        this.duckSimulatorService = duckSimulatorService;
    }
    @GetMapping("/{type}/{action}")
    public String simulateDuck(@PathVariable String type, @PathVariable String action) {
        return duckSimulatorService.simulate(type, action);
    }
}
