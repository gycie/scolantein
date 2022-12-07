package com.isi.tp.controller;


import com.isi.tp.dao.IefImplement;
import com.isi.tp.entities.Ief;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ief")
public class IefController {

    @Autowired
    IefImplement iefServiceImplement;

    @GetMapping("/Listief")
    @ResponseBody
    public List<Ief> getAllAppRole(){
        return iefServiceImplement.IEF_LIST();

    }

    @PostMapping("/AjouterIef")
    @ResponseBody
    public Ief Ajouter(@RequestBody Ief ief){
        return iefServiceImplement.addIef(ief);
    }
}
