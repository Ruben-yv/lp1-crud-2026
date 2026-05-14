package com.example.crud_mvc.seviceImpl;

import com.example.crud_mvc.model.Cliente;
import com.example.crud_mvc.repository.ClienteRepository;
import com.example.crud_mvc.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente create(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente update(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Optional<Cliente> read(Long aLong) {
        return clienteRepository.findById(aLong);
    }

    @Override
    public void delete(Long aLong) {
        clienteRepository.deleteById(aLong);
    }

    @Override
    public Iterable<Cliente> readAll() {
        return clienteRepository.findAll();
    }
}


