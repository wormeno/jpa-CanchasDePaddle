package paddle.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Constructores")
public class Constructor {
    @Id
    @GeneratedValue
    private Long codigo;

    private String nombre;
    private String domicilio;
}
