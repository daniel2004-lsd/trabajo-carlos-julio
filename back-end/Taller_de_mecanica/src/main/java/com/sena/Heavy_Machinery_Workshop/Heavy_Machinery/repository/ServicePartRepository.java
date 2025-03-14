package com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.repository;

import java.util.Optional;

import org.hibernate.metamodel.mapping.ordering.ast.SequencePart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.model.ServiceSparePart;

@Repository
public interface ServicePartRepository extends JpaRepository<SequencePart, Integer> {

    Optional<SequencePart> findById(Long serviceId, Long sparePartId);
    // You can add custom methods here if needed

    ServiceSparePart save(ServiceSparePart serviceSparePart);

    void deleteById(Long serviceId, Long sparePartId);
}
