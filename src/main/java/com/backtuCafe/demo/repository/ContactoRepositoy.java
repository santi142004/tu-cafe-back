package com.backtuCafe.demo.repository;


import com.backtuCafe.demo.model.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactoRepositoy extends JpaRepository<Contacto, Integer> {

}
