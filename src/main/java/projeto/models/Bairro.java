package projeto.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "bairro")
@EqualsAndHashCode(of = "id")
public class Bairro implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    //@ManyToOne
    //@JoinColumn(name="cidade_id")
    //private Cidade cidade;

    public Bairro(String nome){
        this.nome = nome;
    }
}
