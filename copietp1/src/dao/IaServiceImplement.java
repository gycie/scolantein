package dao;

import com.isi.tp.Service.IaService;
import com.isi.tp.entities.Ia;
import com.isi.tp.repository.IaReposi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IaServiceImplement implements IaService {
    @Autowired
    private IaReposi iaReposi;

    @Override
    public Ia saveIA(Ia ia) {
        return this.iaReposi.save(ia);
    }

    @Override
    public List<Ia> IA_LIST() {
        return this.iaReposi.findAll();
    }
}
