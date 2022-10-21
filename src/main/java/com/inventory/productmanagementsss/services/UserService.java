package com.inventory.productmanagementsss.services;

import com.inventory.productmanagementsss.dto.ResponseDto;
import com.inventory.productmanagementsss.dto.users.SignInDto;
import com.inventory.productmanagementsss.dto.users.SignInResponseDto;
import com.inventory.productmanagementsss.dto.users.SignupDto;
import com.inventory.productmanagementsss.exception.CustomException;

import java.security.NoSuchAlgorithmException;

public interface UserService {
   public SignInResponseDto signIn(SignInDto signInDto);

   public ResponseDto signUp(SignupDto signupDto);

   public String hashPassword(String password) throws NoSuchAlgorithmException;
}
