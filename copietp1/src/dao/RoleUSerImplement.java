package dao;

import com.isi.tp.Service.IAppRole_AppUser;
import com.isi.tp.entities.AppUser_AppRoles;
import com.isi.tp.repository.AppRole_UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleUSerImplement  implements IAppRole_AppUser {
    @Autowired
    AppRole_UserRepository appRole_userRepository;
    @Override
    public AppUser_AppRoles add(AppUser_AppRoles a) {
        return this.appRole_userRepository.save(a);
    }

    @Override
    public List<AppUser_AppRoles> listAR() {
        return this.appRole_userRepository.findAll();
    }
}
