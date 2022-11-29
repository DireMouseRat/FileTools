package com.filetools.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class FileToolsController {

    @GetMapping("/Test")
    public String ExampleGet() {
        return "Success";
    }

}
