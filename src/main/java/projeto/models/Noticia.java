package projeto.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "noticia")
@EqualsAndHashCode(of = "id")
public class Noticia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private String imagem;

    @ManyToOne
    @JoinColumn(name="usuario_id")
    private Usuario usuario;
}
