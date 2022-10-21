package com.inventory.productmanagementsss.services;

import com.inventory.productmanagementsss.entity.Category;
import com.inventory.productmanagementsss.entity.Product;
import com.inventory.productmanagementsss.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceimpl implements CategoryService{

    @Autowired
    private CategoryRepository categoryrepository;
    @Override
    public List<Category> listCategories() {
        return categoryrepository.findAll();
    }

    @Override
    public Object readCategory(String categoryName) {
        return categoryrepository.findByCategoryName(categoryName);
    }

    @Override
    public void createCategory(Category category) {
        categoryrepository.save(category);
    }

    public Optional<Category> readCategory(Integer categoryId) {
        return categoryrepository.findById(Long.valueOf(categoryId));
    }

    @Override
    public void updateCategory(Integer categoryID, Category newCategory) {
        Category category = categoryrepository.findById(Long.valueOf(categoryID)).get();
        category.setCategoryName(newCategory.getCategoryName());
        category.setCategoryDescription(newCategory.getCategoryDescription());
        category.setImageURL(newCategory.getImageURL());
        categoryrepository.save(category);
    }

    @Override
    public boolean deleteCategory(long categoryID) {
        Category category=categoryrepository.findById(categoryID).get();
        categoryrepository.delete(category);
        return true;


    }
}
