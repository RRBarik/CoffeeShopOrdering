package com.sg.coffee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sg.coffee.domain.Product;
import com.sg.coffee.domain.ProductType;

import java.io.Serializable;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Serializable> {

    public List<Product> findByProductNameLikeOrDescriptionLikeAllIgnoreCase(String productName, String description);

    public List<Product> findByProductType(ProductType productType);

    public List<Product> findByPriceBetween(Double minPrice, Double maxPrice);
}
