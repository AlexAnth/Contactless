package com.contactless.orders.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.contactless.orders.entities.Product;

@Repository
public interface ProductDAO extends JpaRepository<Product, Long> {

}
