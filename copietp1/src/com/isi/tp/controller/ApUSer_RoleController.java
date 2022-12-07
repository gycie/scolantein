package com.isi.tp.controller;

import com.isi.tp.dao.RoleUSerImplement;
import com.isi.tp.entities.AppUser_AppRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app")
public class ApUSer_RoleController {

    @Autowired
    RoleUSerImplement roleUSerImplement;

    @GetMapping("/list")
    @ResponseBody
    public List<AppUser_AppRoles> getAllAppRole(){
        return roleUSerImplement.listAR();
    }

    @PostMapping("/add")
    @ResponseBody
    public AppUser_AppRoles Ajouter(@RequestBody AppUser_AppRoles a){
        return roleUSerImplement.add(a);
    }
}
