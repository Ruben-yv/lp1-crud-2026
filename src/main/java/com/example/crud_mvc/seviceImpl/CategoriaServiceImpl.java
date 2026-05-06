package com.example.crud_mvc.seviceImpl;

import com.example.crud_mvc.model.Categoria;
import com.example.crud_mvc.repository.CategoriaRepository;
import com.example.crud_mvc.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServiceImpl implements CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public Categoria create(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public Categoria update(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public Optional<Categoria> read(Long aLong) {
        return categoriaRepository.findById(aLong);
    }

    @Override
    public void delete(Long aLong) {
        categoriaRepository.deleteById(aLong);
    }

    @Override
    public Iterable<Categoria> readAll() {
        return categoriaRepository.findAll();
    }
}
