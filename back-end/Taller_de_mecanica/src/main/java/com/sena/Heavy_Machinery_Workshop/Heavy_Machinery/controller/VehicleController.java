package com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

import com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.model.Vehicle;
import com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.repository.VehicleRepository;

@RestController
@RequestMapping("api/vehicles")
@CrossOrigin(origins = "*") // Permite llamadas desde otros dominios
public class VehicleController {

    @Autowired
    private VehicleRepository vehicleRepository;

    // Obtener todos los vehículos
    @GetMapping
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    // Obtener un vehículo por ID
    @GetMapping("/{id}")
    public ResponseEntity<Vehicle> getVehicleById(@PathVariable int id) {
        Optional<Vehicle> vehicle = vehicleRepository.findById(id);
        return vehicle.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Crear un nuevo vehículo
    @PostMapping
    public ResponseEntity<Vehicle> createVehicle(@RequestBody Vehicle vehicle) {
        Vehicle newVehicle = vehicleRepository.save(vehicle);
        return ResponseEntity.ok(newVehicle);
    }

    // Actualizar un vehículo existente
    @PutMapping("/{id}")
    public ResponseEntity<Vehicle> updateVehicle(@PathVariable int id, @RequestBody Vehicle vehicleDetails) {
        Optional<Vehicle> existingVehicle = vehicleRepository.findById(id);
        if (existingVehicle.isPresent()) {
            Vehicle vehicle = existingVehicle.get();
            vehicle.setBrand(vehicleDetails.getBrand());
            vehicle.setModel(vehicleDetails.getModel());
            vehicle.setLicensePlate(vehicleDetails.getLicensePlate());
            vehicle.setYear(vehicleDetails.getYear());

            Vehicle updatedVehicle = vehicleRepository.save(vehicle);
            return ResponseEntity.ok(updatedVehicle);
        }
        return ResponseEntity.notFound().build();
    }

    // Eliminar un vehículo
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVehicle(@PathVariable int id) {
        if (vehicleRepository.existsById(id)) {
            vehicleRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
