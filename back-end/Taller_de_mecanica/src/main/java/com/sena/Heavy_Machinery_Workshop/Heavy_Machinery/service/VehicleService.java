package com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.service;

import com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.model.Vehicle;
import com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    public Vehicle getVehicleById(int id) {
        return vehicleRepository.findById(id).orElse(null);
    }

    public Vehicle saveVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    public void deleteVehicle(int id) {
        vehicleRepository.deleteById(id);
    }
}
