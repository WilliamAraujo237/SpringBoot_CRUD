package med.voll.api.controller;

import med.voll.api.Medico.DadosCadastroMedico;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Medicos")
public class MedicoControler {
    @RequestMapping
    public void cadastro(@RequestBody DadosCadastroMedico Dados){
        System.out.println(Dados);
    }
}
