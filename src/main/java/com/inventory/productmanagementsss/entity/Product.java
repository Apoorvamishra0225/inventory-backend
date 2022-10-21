package com.inventory.productmanagementsss.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="product")
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long productId;
    private @NotNull String productName;
    private @NotNull float productPrice;
    private @NotNull String productStatus;
    private @NotNull String productDescription;
    private @NotNull String imageURL;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "category_id",nullable = false)
    Category category;






}
