package dao;

import com.isi.tp.Service.AppUserService;
import com.isi.tp.entities.AppUser;
import com.isi.tp.repository.AppUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppUserServiceImp implements AppUserService {

    @Autowired
    private AppUserRepo appUserRepo;

    @Override
    public AppUser ajoutUser(AppUser app) {
        return this.appUserRepo.save(app);
    }

    @Override
    public List<AppUser> listAppUser() {
        return this.appUserRepo.findAll();
    }
}
