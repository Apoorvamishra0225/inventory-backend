package com.inventory.productmanagementsss.model;

import lombok.Data;

@Data
public class Products {

    private long productId;
    private String productName;
    private float productPrice;
    private String productCategory;
    private String productStatus;
    private String productDescription;
}
