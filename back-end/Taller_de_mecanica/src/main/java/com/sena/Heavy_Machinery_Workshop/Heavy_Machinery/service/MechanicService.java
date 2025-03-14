package com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.service;

import com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.model.Mechanic;
import com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.repository.MechanicRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MechanicService {

    private final MechanicRepository mechanicRepository;

    public MechanicService(MechanicRepository mechanicRepository) {
        this.mechanicRepository = mechanicRepository;
    }

    // Crear un nuevo mecánico
    public Mechanic createMechanic(Mechanic mechanic) {
        return mechanicRepository.save(mechanic);
    }

    // Obtener todos los mecánicos
    public List<Mechanic> getAllMechanics() {
        return mechanicRepository.findAll();
    }

    // Obtener un mecánico por ID
    public Optional<Mechanic> getMechanicById(int id) {
        return mechanicRepository.findById(id);
    }

    // Actualizar un mecánico
    public Mechanic updateMechanic(int id, Mechanic mechanicDetails) {
        Optional<Mechanic> optionalMechanic = mechanicRepository.findById(id);
        
        if(optionalMechanic.isPresent()) {
            Mechanic mechanic = optionalMechanic.get();
            mechanic.setName(mechanicDetails.getName());
            mechanic.setSpecialty(mechanicDetails.getSpecialty());
            mechanic.setPhone(mechanicDetails.getPhone());
            return mechanicRepository.save(mechanic);
        }
        
        return null; // o lanzar una excepción personalizada
    }

    // Eliminar un mecánico
    public boolean deleteMechanic(int id) {
        if(mechanicRepository.existsById(id)) {
            mechanicRepository.deleteById(id);
            return true;
        }
        return false; // o lanzar una excepción personalizada
    }
}
