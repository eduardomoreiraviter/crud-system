package com.viter.desafiocrudevsuperior.controller;

import com.viter.desafiocrudevsuperior.entite.Client;
import com.viter.desafiocrudevsuperior.repositorie.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/client")
public class ClientController {

    @Autowired
    private ClientRepository repository;

    @GetMapping
    public String test() {
        Optional<Client> result = repository.findById(1L);
        Client client = result.get();
        return client.getName();
    }
}
