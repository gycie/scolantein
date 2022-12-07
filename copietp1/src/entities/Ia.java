package entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;


@Entity
@Table(name = "Ia")
public class Ia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    @Size(max = 100)
    @Column(name = "name")
    private  String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "AppUser_id")
    private AppUser ap;


    public void setIefList(List<Ief> iefList) {
        this.iefList = iefList;
    }

    @OneToMany(mappedBy = "ia")
    private List<Ief> iefList;

    public AppUser getAp() {
        return ap;
    }

    public void setAp(AppUser ap) {
        this.ap = ap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
