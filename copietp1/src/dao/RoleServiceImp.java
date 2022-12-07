package dao;

import com.isi.tp.Service.AppRoleService;
import com.isi.tp.entities.AppRole;
import com.isi.tp.repository.AppRoleReposi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImp implements AppRoleService {

    @Autowired
    private AppRoleReposi appRoleReposi;
    @Override
    public AppRole ajoutRole(AppRole ro) {
        return this.appRoleReposi.save(ro);
    }

    @Override
    public List<AppRole> listAppRole() {
        return this.appRoleReposi.findAll();
    }
}
