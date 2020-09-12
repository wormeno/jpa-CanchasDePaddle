package paddle.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Jugadores")
public class Jugador {
    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private String apellido;
    private String domicilio;
    private LocalDate nacimiento;
    private String telefono;


    @ManyToOne
    private Paleta paleta;

    @OneToMany//(mappedBy="jugador", cascade = {CascadeType.ALL}, fetch = FetchType.LAZY )
    @JoinColumn(name="jugador_id")
    private List<Participacion> participaciones;
}
