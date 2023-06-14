package med.voll.api.Medico;

import med.voll.api.Endereco.Endereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, Endereco endereco) {
}
