package com.inventory.productmanagementsss.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDto {
    private long productId;
    private @NotNull String productName;
    private @NotNull float productPrice;
    private @NotNull String productStatus;
    private @NotNull String productDescription;
    private @NotNull String imageURL;
    private @NotNull long categoryId;
}
