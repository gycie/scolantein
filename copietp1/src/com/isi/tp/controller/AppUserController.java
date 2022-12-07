package com.isi.tp.controller;


import com.isi.tp.dao.AppUserServiceImp;
import com.isi.tp.entities.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AppUserController {

    @Autowired
    AppUserServiceImp appUserServiceImpe;

    @GetMapping("/ListAppUsers")
    @ResponseBody
    public List< AppUser> getAllAppUser(){
        return appUserServiceImpe.listAppUser();

    }

    @PostMapping("/AjouterUser")
    @ResponseBody
    public AppUser AjouterUser(@RequestBody AppUser u){
        return appUserServiceImpe.ajoutUser(u);
    }

}
