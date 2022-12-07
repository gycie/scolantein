package entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Ief")
public class Ief {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ia_id")
    private Ia ia;

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

    public Ia getIa() {
        return ia;
    }

    public void setIa(Ia ia) {
        this.ia = ia;
    }

    @NotBlank
    @Size(max = 100)
    @Column(name = "name")
    private  String name;
}

