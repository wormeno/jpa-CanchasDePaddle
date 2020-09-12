package paddle.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Canchas")
public class Cancha {
    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private Boolean esta_iluminada;

    @ManyToOne
    private Color color;

    @OneToMany
    @JoinColumn(name="cancha_id")
    private List<Partido> partido;
}
