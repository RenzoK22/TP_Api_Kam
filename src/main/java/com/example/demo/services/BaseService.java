package com.example.demo.services;

import com.example.demo.entities.Base;
import com.example.demo.repositories.BaseRepository;

import java.io.Serializable;
import java.util.List;

public interface BaseService<E extends Base, ID extends Serializable> {

    // Trae una lista de todas las personas (entidades) que se encuentran en la base de datos
    public List<E> findAll() throws Exception;

    // Trae una entidad de acuerdo a un id que le pasemos
    public E findById(ID id) throws Exception;

    // Crea una nueva entidad y para eso le vamos a enviar una nueva entidad al repositorio
    public E save(E entity) throws Exception;

    // Tener un id y una entidad, la entidad actualizada y el id de la entidad que se quiere actualizar
    public E update(ID id, E entity) throws Exception;

    // Se encarga de eliminar el registro de la base de datos
    public boolean delete(ID id) throws Exception;
}
