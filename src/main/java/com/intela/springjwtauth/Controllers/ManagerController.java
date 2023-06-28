package com.intela.springjwtauth.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/manager")
public class ManagerController {

    @PostMapping("/post")
    public ResponseEntity<String> managerPost(){
        return ResponseEntity.ok("Manager:: POST");
    }

    @PutMapping ("/put")
    public ResponseEntity<String> managerPut(){
        return ResponseEntity.ok("Manager:: PUT");
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> managerDelete(){
        return ResponseEntity.ok("Manager:: DELETE");
    }

    @GetMapping("/get")
    public ResponseEntity<String> managerGet(){
        return ResponseEntity.ok("Manager:: GET");
    }
}
