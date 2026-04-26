package com.viter.desafiocrudevsuperior.controller;

import com.viter.desafiocrudevsuperior.dto.ClientDTO;
import com.viter.desafiocrudevsuperior.entite.Client;
import com.viter.desafiocrudevsuperior.repositorie.ClientRepository;
import com.viter.desafiocrudevsuperior.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/client")
public class ClientController {

    @Autowired
    private ClientService service;

    @GetMapping(value = "/{id}")
    public ClientDTO findById(@PathVariable Long id) {
        return service.findById(id);
    }
}
