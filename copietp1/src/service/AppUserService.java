package service;

import com.isi.tp.entities.AppUser;

import java.util.List;

public interface AppUserService {
    public AppUser ajoutUser(AppUser app);

    public List<AppUser> listAppUser();
}
