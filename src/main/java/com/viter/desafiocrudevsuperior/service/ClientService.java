package com.viter.desafiocrudevsuperior.service;

import com.viter.desafiocrudevsuperior.dto.ClientDTO;
import com.viter.desafiocrudevsuperior.entite.Client;
import com.viter.desafiocrudevsuperior.repositorie.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id){
        Optional<Client> result = repository.findById(id);
        Client client = result.get();
        ClientDTO dto = new ClientDTO(client);
        return dto;
    }
}
