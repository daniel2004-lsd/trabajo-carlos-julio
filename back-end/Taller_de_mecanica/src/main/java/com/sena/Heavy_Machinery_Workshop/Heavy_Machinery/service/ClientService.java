package com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.service;

import com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.model.Client;
import com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<ch.qos.logback.core.net.server.Client> getAllClients() {
        return clientRepository.findAll();
    }

    public ch.qos.logback.core.net.server.Client getClientById(int id) {
        return clientRepository.findById(id).orElse(null);
    }

    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    public Client updateClient(int id, Client client) {
        Optional<ch.qos.logback.core.net.server.Client> existing = clientRepository.findById(id);
        if (existing.isPresent()) {
            client.setId(id);
            return clientRepository.save(client);
        }
        return null;
    }

    public void deleteClient(int id) {
        clientRepository.deleteById(id);
    }
}
