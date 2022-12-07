package repostory;

import com.isi.tp.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppRoleReposi extends JpaRepository<AppRole, Long> {
}
