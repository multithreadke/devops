package com.multithreadke.dev.controller;

import com.multithreadke.dev.model.Result;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class APIController {

    @GetMapping(value = "/status")
    public ResponseEntity<?> queryStatus()
    {
        return new ResponseEntity<>(new Result(false, "200", "Success"), HttpStatus.OK);
    }

}
