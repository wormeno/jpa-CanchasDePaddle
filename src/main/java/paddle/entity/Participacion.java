package paddle.entity;

import javax.persistence.*;

@Entity
@Table(name = "Participacion")
public class Participacion {
    @EmbeddedId
    ParticipacionId id;

    @ManyToOne
    private Paleta paleta;

    @ManyToOne
    private Partido partido;

    @ManyToOne
    private Jugador jugador;
}
