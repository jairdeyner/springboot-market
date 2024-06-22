package com.platzi.platzi_market.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platzi.platzi_market.domain.Product;
import com.platzi.platzi_market.domain.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll() {
        return productRepository.getAll();
    }

    public Optional<Product> getProduct(int productId) {
        return productRepository.getproduct(productId);
    }

    public Optional<List<Product>> getByCategory(int categoryId) {
        return productRepository.getByCategory(categoryId);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public boolean delete(int productId) {
        return this.getProduct(productId).map(product -> {
            productRepository.delete(productId);

            return true;
        }).orElse(false);

        // if(this.getProduct(productId).isPresent()) {
        //     this.productRepository.delete(productId);
        //     return true;
        // }

        // return false;
    }
}
