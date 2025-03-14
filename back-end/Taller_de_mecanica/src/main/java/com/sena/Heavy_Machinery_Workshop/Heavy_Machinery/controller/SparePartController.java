package com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.controller;

import com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.model.SparePart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/spareParts")
public class SparePartController {

    @Autowired
    private SparePart sparePartService;

    // Obtener todos los repuestos
    @GetMapping
    public ResponseEntity<List<SparePart>> getAllSpareParts() {
        List<SparePart> spareParts = sparePartService.getAllSpareParts();
        return new ResponseEntity<>(spareParts, HttpStatus.OK);
    }

    // Obtener un repuesto por su ID
    @GetMapping("/{id}")
    public ResponseEntity<SparePart> getSparePartById(@PathVariable("id") Long id) {
        Optional<SparePart> sparePart = sparePartService.getSparePartById(id);
        return sparePart.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Crear un nuevo repuesto
    @PostMapping
    public ResponseEntity<SparePart> createSparePart(@RequestBody SparePart sparePart) {
        SparePart createdSparePart = sparePartService.createSparePart(sparePart);
        return new ResponseEntity<>(createdSparePart, HttpStatus.CREATED);
    }

    // Actualizar un repuesto existente
    @PutMapping("/{id}")
    public ResponseEntity<SparePart> updateSparePart(@PathVariable("id") Long id, @RequestBody SparePart sparePartDetails) {
        Optional<SparePart> sparePart = sparePartService.getSparePartById(id);
        if (sparePart.isPresent()) {
            SparePart updatedSparePart = sparePartService.updateSparePart(id, sparePartDetails);
            return new ResponseEntity<>(updatedSparePart, HttpStatus.OK);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Eliminar un repuesto
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSparePart(@PathVariable("id") Long id) {
        Optional<SparePart> sparePart = sparePartService.getSparePartById(id);
        if (sparePart.isPresent()) {
            sparePartService.createSparePart(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
