package paddle.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Colores")
public class Color {
    @Id
    @GeneratedValue
    private Long codigo;

    private String nombre;

}
