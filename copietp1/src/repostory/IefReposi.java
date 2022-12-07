package repostory;

import com.isi.tp.entities.Ief;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IefReposi extends JpaRepository<Ief, Long> {
}
