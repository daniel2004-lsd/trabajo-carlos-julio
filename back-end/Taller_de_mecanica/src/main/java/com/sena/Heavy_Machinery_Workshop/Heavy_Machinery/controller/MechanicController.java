package com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

import com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.model.Mechanic;
import com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.repository.MechanicRepository;

@RestController
@RequestMapping("api/mechanics")
@CrossOrigin(origins = "*") // Permite llamadas desde otros dominios
public class MechanicController {
    
    @Autowired
    private MechanicRepository mechanicRepository;

    @GetMapping
    public List<Mechanic> getAllMechanics() {
        return mechanicRepository.findAll();
    }

    @GetMapping("/{id}")
    public Mechanic getMechanicById(@PathVariable int id) {
        return mechanicRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Mechanic createMechanic(@RequestBody Mechanic mechanic) {
        return mechanicRepository.save(mechanic);
    }

    @PutMapping("/{id}")
    public Mechanic updateMechanic(@PathVariable int id, @RequestBody Mechanic mechanic) {
        Optional<Mechanic> existing = mechanicRepository.findById(id);
        if (existing.isPresent()) {
            mechanic.setId(id);
            return mechanicRepository.save(mechanic);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteMechanic(@PathVariable int id) {
        mechanicRepository.deleteById(id);
    }
}
