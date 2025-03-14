package com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.service;

import com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.model.SparePart;
import com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.repository.SparePartRepository;

import jakarta.servlet.http.Part;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class SparePartService {

    @Autowired
    private SparePartRepository sparePartRepository;

    // Obtener todos los repuestos
    public List<Part> getAllSpareParts() {
        return sparePartRepository.findAll();
    }

    // Obtener un repuesto por ID
    public Optional<SparePart> getSparePartById(Long id) {
        return sparePartRepository.findById(id);
    }

    // Crear un nuevo repuesto
    public SparePart createSparePart(SparePart sparePart) {
        return sparePartRepository.save(sparePart);
    }

    // Actualizar un repuesto existente
    public SparePart updateSparePart(Long id, SparePart sparePartDetails) {
        return sparePartRepository.findById(id).map(sparePart -> {
            sparePart.setName(sparePartDetails.getName());
            sparePart.setBrand(sparePartDetails.getBrand());
            sparePart.setPrice(sparePartDetails.getPrice());
            return sparePartRepository.save(sparePart);
        }).orElseThrow(() -> new RuntimeException("Repuesto no encontrado con ID: " + id));
    }

    // Eliminar un repuesto
    public void deleteSparePart(Integer id) {
        sparePartRepository.deleteById(id);
    }
}
