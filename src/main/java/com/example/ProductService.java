package com.example;

import java.util.List;

public interface ProductService {

    Product createProduct(ProductRequest request);

    List<Product> getAllProducts();

    Product getProductById(Long id);

    Product updateProduct(Long id, ProductRequest request);

    void deleteProduct(Long id);
}