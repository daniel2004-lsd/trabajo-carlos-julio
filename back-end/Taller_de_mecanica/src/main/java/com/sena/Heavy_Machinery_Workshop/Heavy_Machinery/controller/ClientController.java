package com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.controller;

import java.util.List;


import org.springframework.web.bind.annotation.*;

import com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.model.Client;
import com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.repository.ClientRepository;

@RestController
@RequestMapping("api/clients")
@CrossOrigin(origins = "*") // Permite atender llamadas desde otros dominios
public class ClientController {

    private final ClientRepository clientRepository;

    // Constructor correcto
    public ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @GetMapping
    public List<ch.qos.logback.core.net.server.Client> getAllClients() {
        return clientRepository.findAll();
    }

    @GetMapping("/{id}")
    public Client getClientById(@PathVariable int id) {
        return (Client) clientRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Client createClient(@RequestBody Client client) {
        return clientRepository.save(client);
    }

}