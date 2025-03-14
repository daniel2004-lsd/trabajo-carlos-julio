package com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.service;

import com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.model.ServiceSparePart;
import com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.repository.ServicePartRepository;

import org.hibernate.metamodel.mapping.ordering.ast.SequencePart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceSparePartService {

    @Autowired
    private ServicePartRepository serviceSparePartRepository;

    public List<SequencePart> getAllServiceSpareParts() {
        return serviceSparePartRepository.findAll();
    }

    public SequencePart getServiceSparePartById(Long serviceId, Long sparePartId) {
        return serviceSparePartRepository.findById(serviceId, sparePartId).orElse(null);
    }

    public ServiceSparePart saveServiceSparePart(ServiceSparePart serviceSparePart) {
        return serviceSparePartRepository.save(serviceSparePart);
    }

    public void deleteServiceSparePart(Long serviceId, Long sparePartId) {
        serviceSparePartRepository.deleteById(serviceId, sparePartId);
    }
}
