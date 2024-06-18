package projeto.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "pessoa")
@EqualsAndHashCode(of = "id")
public class Pessoa implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false, length = 100, unique = false)
    private String nome;

    public Pessoa(String nome){
        this.nome = nome;
    }

    // @Column(nullable = false, length = 14)
    // private String cpf ;

    // @Column(nullable = false)
    // private String email;

    // @Column(nullable = false)
    // private int numero;

    // @Column(nullable = false)
    // private String nome_responsavel;

    // @Column(nullable = false)
    // private String aprovado;

    // @Column(nullable = false)
    // private Date data_nascimento;

    // @ManyToMany
    // private List<Deficiencia> deficiencia;

    // @ManyToOne
    // @JoinColumn(name="endereco_id")
    // private Endereco endereco;
}
