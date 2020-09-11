package paddle.entity;

import javax.persistence.*;

@Entity
@Table(name = "Paletas")
public class Paleta {
    @Id
    @GeneratedValue
    private Long codigo;

    private String nombre;
    private String grosor;

    @ManyToOne
    private Color paleta;

    @ManyToOne
    private Constructor constructor;

}
