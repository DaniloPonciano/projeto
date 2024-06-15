package projeto.models;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "acesso")
@EqualsAndHashCode(of = "id")
public class Acesso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String ip;

    @Column(nullable = false)
    private Date data_hora;

    @ManyToOne
    @JoinColumn(name="usuario_id")
    private Usuario usuario;
}
