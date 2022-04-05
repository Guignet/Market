package com.project.marketsimulator.dao;

import java.util.List;

public interface IGenericDAO<T, ID extends Number> {

    void add(T data);

    void update(T data);

    void delete(ID id);


    List<T> getAll();

    T getById(ID id);
}
