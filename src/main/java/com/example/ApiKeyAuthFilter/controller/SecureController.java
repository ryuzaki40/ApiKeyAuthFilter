package com.example.ApiKeyAuthFilter.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/secure")
public class SecureController {

    @GetMapping("/data")
    public String getSecureData()
    {
        return "Sensitive info only for API key holders!";
    }
    
}
