package com.authenticationapi.services;

import com.authenticationapi.domains.product.Product;
import com.authenticationapi.dtos.ProductRequestDTO;
import com.authenticationapi.dtos.ProductResponseDTO;
import com.authenticationapi.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public ProductResponseDTO createProduct(ProductRequestDTO body){
        Product newProduct = new Product(body);

        return new ProductResponseDTO(productRepository.save(newProduct));
    }

    public List<ProductResponseDTO> findAll(){
        return productRepository.findAll().stream().map(ProductResponseDTO::new).toList();
    }
}
