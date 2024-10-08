package com.example.inicial1.controllers;

import com.example.inicial1.entities.Localidad;
import com.example.inicial1.services.LocalidadServiceImplem;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/localidades")
public class LocalidadController extends BaseControllerImplem<Localidad, LocalidadServiceImplem> {
}
