package com.inventory.productmanagementsss.services;

import com.inventory.productmanagementsss.dto.ProductDto;
import com.inventory.productmanagementsss.entity.Category;
import com.inventory.productmanagementsss.entity.Product;
import com.inventory.productmanagementsss.repository.ProductRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    public ProductRepository productRepository;


    @Override
    public void createProduct(ProductDto productDto, Category category) {
        Product product = new Product();
        product.setProductDescription(productDto.getProductDescription());
        product.setImageURL(productDto.getImageURL());
        product.setProductName(productDto.getProductName());
        product.setCategory(category);
        product.setProductPrice(productDto.getProductPrice());
        product.setProductStatus(productDto.getProductStatus());
//        console.log(product.getProductStatus())
        productRepository.save(product);
    }


    public ProductDto getProductDto(Product product) {
        ProductDto productDto = new ProductDto();
        productDto.setProductDescription(product.getProductDescription());
        productDto.setImageURL(product.getImageURL());
        productDto.setProductName(product.getProductName());
        productDto.setCategoryId(product.getCategory().getCategoryId());
        productDto.setProductPrice(product.getProductPrice());
        productDto.setProductId(product.getProductId());
        return productDto;
    }

    @Override
    public List<ProductDto> getAllProducts() {
        List<Product> allProducts = productRepository.findAll();

        List<ProductDto> productDtos = new ArrayList<>();
        for(Product product: allProducts) {
            productDtos.add(getProductDto(product));
        }
        return productDtos;
    }

    @Override
    public void updateProduct(ProductDto productDto, Integer productId) throws Exception{
        Optional<Product> optionalProduct = productRepository.findById(Long.valueOf(productId));
        if (!optionalProduct.isPresent()) {
            throw new Exception("product not present");
        }
        Product product = optionalProduct.get();
        product.setProductDescription(productDto.getProductDescription());
        product.setImageURL(productDto.getImageURL());
        product.setProductName(productDto.getProductName());
        product.setProductPrice(productDto.getProductPrice());
        productRepository.save(product);
    }

    @Override
    public boolean deleteProduct(long productID) {
        Product product=productRepository.findById(productID).get();
        productRepository.delete(product);
        return true;
    }
}
