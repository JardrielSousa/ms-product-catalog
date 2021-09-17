package com.diocursos.productcatalog.repository;

import org.springframework.data.repository.CrudRepository;

import com.diocursos.productcatalog.model.Product;

public interface ProductRepository extends  CrudRepository<Product, Integer>{

}
