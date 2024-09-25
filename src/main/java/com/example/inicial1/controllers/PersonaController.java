package com.example.inicial1.controllers;

import  com.example.inicial1.entities.Persona;
import com.example.inicial1.services.BaseServiceImplem;
import com.example.inicial1.services.PersonaServiceImplem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*")          //Para acceder a la API desde distintos orígenes o clientes
@RequestMapping("/personas")         //Posee la URI del recurso.
public class PersonaController extends BaseControllerImplem<Persona,PersonaServiceImplem> {

}