package com.backtuCafe.demo.controller;

import com.backtuCafe.demo.model.Contacto;
import com.backtuCafe.demo.repository.ContactoRepositoy;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("contactos")
@AllArgsConstructor
public class ContactoController {

    private final ContactoRepositoy contactoRepositoy;

    @GetMapping
    public List<Contacto> listContacto(){return contactoRepositoy.findAll();}
}
