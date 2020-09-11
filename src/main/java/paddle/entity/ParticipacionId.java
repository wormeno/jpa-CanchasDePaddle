package paddle.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ParticipacionId implements Serializable {
    private Long jugador_id;
    private Long partido_id;
}
