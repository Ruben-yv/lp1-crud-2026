package com.example.crud_mvc.seviceImpl;

import com.example.crud_mvc.model.Producto;
import com.example.crud_mvc.repository.ProductoRepository;
import com.example.crud_mvc.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductoServiceImpl implements ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public Producto create(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto update(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Optional<Producto> read(Long aLong) {
        return productoRepository.findById(aLong);
    }

    @Override
    public void delete(Long aLong) {
        productoRepository.deleteById(aLong);
    }

    @Override
    public Iterable<Producto> readAll() {
        return productoRepository.findAll();
    }
}
