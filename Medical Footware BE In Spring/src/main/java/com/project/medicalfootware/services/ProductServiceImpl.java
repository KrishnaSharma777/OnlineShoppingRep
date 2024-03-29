package com.project.medicalfootware.services;

import com.project.medicalfootware.models.Product;
import com.project.medicalfootware.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service @RequiredArgsConstructor @Transactional
public class ProductServiceImpl implements ProductService{
    private final ProductRepository productRepository;

    @Override
    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public Product getProductById(Long productId) {
        return productRepository.getProductByProductIDAndIsActive(productId, true);
    }

    @Override
    public Product getProductByIdForTrashRestore(Long productId) {
        return productRepository.getProductByProductIDAndIsActive(productId, false);
    }

    @Override
    public Product getProductByName(String productName) {
        return productRepository.getProductByProductNameContainingIgnoreCaseAndIsActive(productName, true);
    }

    @Override
    public void deleteProduct(Product product) {
         productRepository.delete(product);
    }

}
