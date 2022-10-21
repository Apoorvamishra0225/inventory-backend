package com.inventory.productmanagementsss.controller;

import com.inventory.productmanagementsss.dto.ResponseDto;
import com.inventory.productmanagementsss.dto.users.SignInDto;
import com.inventory.productmanagementsss.dto.users.SignInResponseDto;
import com.inventory.productmanagementsss.dto.users.SignupDto;
import com.inventory.productmanagementsss.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("user")
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/signup")
    public ResponseDto signup(@RequestBody SignupDto signupDto) {
        return userService.signUp(signupDto);
    }



    @PostMapping("/signin")
    public SignInResponseDto signIn(@RequestBody SignInDto signInDto) {
        return userService.signIn(signInDto);
    }

}
