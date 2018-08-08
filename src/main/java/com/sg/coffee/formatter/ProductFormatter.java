package com.sg.coffee.formatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import com.sg.coffee.domain.Product;
import com.sg.coffee.repository.ProductRepository;

import java.text.ParseException;
import java.util.Locale;

@Component
public class ProductFormatter implements Formatter<Product> {
    private final ProductRepository productRepository;

    @Autowired
    public ProductFormatter(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public Product parse(String text, Locale locale) throws ParseException {
        Long id = Long.valueOf(text);
        return productRepository.findOne(id);
    }

    @Override
    public String print(Product object, Locale locale) {
        return object != null ? object.getId().toString() : "";
    }
}
