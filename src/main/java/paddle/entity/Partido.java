package paddle.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Partidos")
public class Partido {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "inicioPartido", columnDefinition = "DATE")
    private LocalDate inicioPartido;

    @Column(name = "finPartido", columnDefinition = "DATE")
    private LocalDate finPartido;

   /* @ManyToOne
    private Cancha cancha;
*/
    @ManyToOne
    private Color color;

    @ManyToOne
    private Jugador jugador_reserva;

    @OneToMany //(mappedBy="partido", cascade = {CascadeType.ALL}, fetch = FetchType.LAZY )
    @JoinColumn(name="partido_id")
    private List<Participacion> participaciones;



}
