package com.inventory.productmanagementsss.services;

import com.inventory.productmanagementsss.entity.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    public List<Category> listCategories();

    public Object readCategory(String categoryName);

   public void createCategory(Category category);

    public Optional<Category> readCategory(Integer categoryId);

    public void updateCategory(Integer categoryID, Category category);

    public boolean deleteCategory(long categoryID);
}
