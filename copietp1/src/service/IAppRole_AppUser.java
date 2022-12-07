package service;

import com.isi.tp.entities.AppUser_AppRoles;

import java.util.List;

public interface IAppRole_AppUser{
    public AppUser_AppRoles add(AppUser_AppRoles a);
    public List<AppUser_AppRoles> listAR();
}
