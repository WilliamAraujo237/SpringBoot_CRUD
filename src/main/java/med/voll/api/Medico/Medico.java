package med.voll.api.Medico;

import jakarta.persistence.*;
import med.voll.api.Endereco.Endereco;
@Table(name = "Medico")
@Entity(name = "Medico")
public class Medico {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String crm;
    @Enumerated
    private Especialidade especialidade;
    @Embedded
    private Endereco endereco;
}
