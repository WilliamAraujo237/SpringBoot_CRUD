package med.voll.api.Endereco;

import jakarta.persistence.Embeddable;

@Embeddable
public record Endereco(String logradouro,String bairro,String cep,String cidade,String uf,String numero, String complemento) {
}
