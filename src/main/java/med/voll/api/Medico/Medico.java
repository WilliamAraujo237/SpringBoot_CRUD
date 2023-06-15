package med.voll.api.Medico;

import jakarta.persistence.*;
import med.voll.api.Endereco.Endereco;

import java.util.Objects;

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

    //Construtor completo e Vazio
    public Medico (String nome, String email,String crm,Especialidade especialidade,Endereco endereco){
        super();
        this.nome = nome;
        this.email = email;
        this.crm = crm;
        this.especialidade = especialidade;
        this.endereco = endereco;
    }
    public Medico(){

    }
 //Geters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    //criando HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Medico medico)) return false;
        return Objects.equals(getId(), medico.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    //criando to String
    @Override
    public String toString() {
        return "Medico{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", crm='" + crm + '\'' +
                ", especialidade=" + especialidade +
                ", endereco=" + endereco +
                '}';
    }
}