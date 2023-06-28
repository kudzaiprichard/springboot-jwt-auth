package com.intela.springjwtauth.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {

    @PostMapping("/home")
    public ResponseEntity<String> adminPost(){
        return ResponseEntity.ok("Admin:: POST");
    }

    @PutMapping("/put")
    public ResponseEntity<String> adminPut(){
        return ResponseEntity.ok("Admin:: PUT");
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> adminDelete(){
        return ResponseEntity.ok("Admin:: DELETE");
    }

    @GetMapping("/get")
    public ResponseEntity<String> adminGet(){
        return ResponseEntity.ok("Admin:: GET");
    }
}
