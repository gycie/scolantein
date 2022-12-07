package repostory;

import com.isi.tp.entities.Ia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IaReposi extends JpaRepository<Ia, Long> {
}
