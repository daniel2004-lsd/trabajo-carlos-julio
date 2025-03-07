package com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

import com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.model.Service;
import com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.repository.ServiceRepository;

@RestController
@RequestMapping("api/services")
@CrossOrigin(origins = "*")
public class ServiceController {

    @Autowired
    private ServiceRepository serviceRepository;

    @GetMapping
    public List<Service> getAllServices() {
        return serviceRepository.findAll();
    }

    @GetMapping("/{id}")
    public Service getServiceById(@PathVariable int id) {
        Optional<Service> service = serviceRepository.findById(id);
        return service.orElse(null);
    }

    @PostMapping
    public Service createService(@RequestBody Service service) {
        return serviceRepository.save(service);
    }

    @PutMapping("/{id}")
    public Service updateService(@PathVariable int id, @RequestBody Service updatedService) {
        Optional<Service> existingService = serviceRepository.findById(id);
        if (existingService.isPresent()) {
            updatedService.setId(id);
            return serviceRepository.save(updatedService);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteService(@PathVariable int id) {
        serviceRepository.deleteById(id);
    }
}
