package com.inventory.productmanagementsss.dto.users;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SignupDto {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
