package com.inventory.productmanagementsss.services;

import com.inventory.productmanagementsss.entity.AuthenticationToken;
import com.inventory.productmanagementsss.entity.User;

public interface AuthenticationService {
    void saveConfirmationToken(AuthenticationToken authenticationToken);

   AuthenticationToken getToken(User user);
}
