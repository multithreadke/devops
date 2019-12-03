package com.multithreadke.dev.controller;

import com.multithreadke.dev.model.Result;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/v1")
public class APIController {

    @GetMapping(value = "/status")
    public ResponseEntity<?> queryStatus()
    {
        Map<String, String> map = new HashMap<>();
        map.put("error", "False");
        map.put("statusCode", "200");
        map.put("statusMessage", "Success");
        return new ResponseEntity<>(new Result(true, "200", "Success"), HttpStatus.OK);
    }

}
