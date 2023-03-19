package com.kiubit.webapi.controllers;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
@SecurityRequirement(name = "Bearer Authentication")
@Tag(name = "Example Controller", description = "Example controller.")
public class ExampleController {

    @GetMapping
    public String ejemplo(){
        return "hola";
    }
}
