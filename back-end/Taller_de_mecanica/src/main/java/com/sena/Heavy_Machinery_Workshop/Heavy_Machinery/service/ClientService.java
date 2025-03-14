package com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.service;

import com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.model.Client;
import com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<ch.qos.logback.core.net.server.Client> getAllClients() {
        return clientRepository.findAll();
    }

    public ch.qos.logback.core.net.server.Client getClientById(int id) {
        return clientRepository.findById(id).orElse(null);
    }

    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    public void deleteClient(int id) {
        clientRepository.deleteById(id);
    }
}
