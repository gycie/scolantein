package com.isi.tp.controller;

import com.isi.tp.dao.IaServiceImplement;
import com.isi.tp.entities.Ia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ia")
public class IaController {

    @Autowired
    IaServiceImplement iaServiceImplement;

    @GetMapping("/ListIA")
    @ResponseBody
    public List<Ia> getAllAppRole(){
        return iaServiceImplement.IA_LIST();

    }

    @PostMapping("/AjouterIA")
    @ResponseBody
    public Ia AjouterRole(@RequestBody Ia ia){
        return iaServiceImplement.saveIA(ia);
    }
}
