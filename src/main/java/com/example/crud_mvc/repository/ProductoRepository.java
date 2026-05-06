package com.example.crud_mvc.repository;

import com.example.crud_mvc.model.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoRepository extends CrudRepository<Producto,Long> {
}
