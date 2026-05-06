package com.example.crud_mvc.generic;


import java.util.List;
import java.util.Optional;

public interface CrudService<T, ID> {
    T create(T t);
    T update(T t);
    Optional<T> read(ID id);
    void delete(ID id);
    Iterable<T> readAll();


}