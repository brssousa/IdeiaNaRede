package com.gtel.ideianarede.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = {"/online"})
public class TesteOnLine {


    @GetMapping
    public String online(){
        return "Estamos Online";
    }

}
