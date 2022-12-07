package com.isi.tp.controller;


import com.isi.tp.dao.RoleServiceImp;
import com.isi.tp.entities.AppRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    RoleServiceImp appRoleServiceImpe;

    @GetMapping("/ListRole")
    @ResponseBody
    public List<AppRole> getAllAppRole(){
        return appRoleServiceImpe.listAppRole();

    }

    @PostMapping("/AjouterRole")
    @ResponseBody
    public AppRole AjouterRole(@RequestBody AppRole r){
        return appRoleServiceImpe.ajoutRole(r);
    }
}
