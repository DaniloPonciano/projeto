package projeto.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "ponto_interesse")
@EqualsAndHashCode(of = "id")
public class PontoInteresse implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String tipo;

    @Column(nullable = true)
    private String contato;

    @ManyToOne
    @JoinColumn(name="endereco_id")
    private Endereco endereco;
}
