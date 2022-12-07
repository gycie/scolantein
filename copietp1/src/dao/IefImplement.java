package dao;

import com.isi.tp.Service.IefService;
import com.isi.tp.entities.Ief;
import com.isi.tp.repository.IefReposi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IefImplement implements IefService {
    @Autowired
    private IefReposi iefReposi;

    @Override
    public Ief addIef(Ief ief) {
        return iefReposi.save(ief);
    }

    @Override
    public List<Ief> IEF_LIST() {
        return iefReposi.findAll();
    }
}
