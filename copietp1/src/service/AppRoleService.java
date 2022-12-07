package service;

import com.isi.tp.entities.AppRole;

import java.util.List;

public interface AppRoleService {
    public AppRole ajoutRole(AppRole ro);

    public List<AppRole> listAppRole();
}
