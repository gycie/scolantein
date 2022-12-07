package repostory;

import com.isi.tp.entities.AppUser_AppRoles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppRole_UserRepository extends JpaRepository<AppUser_AppRoles,Long> {
}
