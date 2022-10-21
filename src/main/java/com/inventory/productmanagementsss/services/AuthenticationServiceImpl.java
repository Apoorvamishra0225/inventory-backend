package com.inventory.productmanagementsss.services;

import com.inventory.productmanagementsss.entity.AuthenticationToken;
import com.inventory.productmanagementsss.entity.User;
//import com.inventory.productmanagementsss.repository.TokenRepository;
import com.inventory.productmanagementsss.repository.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    @Autowired
    TokenRepository tokenRepository;

    public void saveConfirmationToken(AuthenticationToken authenticationToken) {
        tokenRepository.save(authenticationToken);
    }

   public AuthenticationToken getToken(User user) {
        return tokenRepository.findByUser(user);
    }


}
