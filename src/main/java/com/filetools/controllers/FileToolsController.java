package com.filetools.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class FileToolsController {

    @GetMapping("/test")
    public String ExampleGet() {
        return "Success";
    }

}
