package com.server.server.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @PostMapping(path= "/", consumes = "application/json", produces = "application/json")
    public String addEmployee(@RequestBody String sentido)
    {
        return sentido;
    }

    @GetMapping(path = "/")
    public String retorno(){
        return "VI SE FUDI";
    }


}