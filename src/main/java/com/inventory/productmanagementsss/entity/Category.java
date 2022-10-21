package com.inventory.productmanagementsss.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private @NotBlank long categoryId;
    @Column(name = "category_name")
    private @NotBlank String categoryName;
    @Column(name = "category_description")
    private @NotBlank String categoryDescription;
    @Column(name = "category_imageURL")
    private String imageURL;
}
