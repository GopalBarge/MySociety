package com.kb.mysociety.controller;

import org.springframework.web.bind.annotation.*;

@RestController
        @RequestMapping("/society")
public class SocietyController {

    @GetMapping
    public String getAll(){
        return "List of societies";
    }
    @GetMapping("/{id}")
    public String get(){
        return "society by id";
    }

    @PutMapping
    public String add(){
        return "society added";
    }
    @PostMapping
    public String update(){
        return "society updated";
    }
    @DeleteMapping("/{id}")
    public String delete(){
        return "society deleted";
    }
}
