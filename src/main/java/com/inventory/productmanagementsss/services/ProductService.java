package com.inventory.productmanagementsss.services;

import com.inventory.productmanagementsss.dto.ProductDto;
import com.inventory.productmanagementsss.entity.Category;
import com.inventory.productmanagementsss.entity.Product;

import java.util.List;

public interface ProductService {

   public void createProduct(ProductDto productDto, Category category);

   public List<ProductDto> getAllProducts();

    public void updateProduct(ProductDto productDto, Integer productId) throws Exception;

    public boolean deleteProduct(long productID);
}
