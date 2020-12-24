package com.contactless.orders.sevices;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;

import com.contactless.orders.domain.Category;
import com.contactless.orders.entities.Product;

public interface Products {

	public Product removeProduct(long id) throws EntityNotFoundException;

	public Product updateProduct(long id, String name, Category category, int quantity, String brand, double price)
			throws EntityNotFoundException;

	public Optional<Product> retrieveProduct(long id);

	public List<Product> retrieveAllProducts();

	public Product addProduct(String name, Category category, int quantity, String brand, double price)
			throws EntityExistsException;

	public void test();
}
