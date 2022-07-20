package br.com.zup.edu.gestaofuncionarioclient.funcionarios;

import br.com.zup.edu.gestaofuncionarioclient.client.FuncionariosClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ListaFuncionariosPorCargoController {

    @Autowired
    private FuncionariosClient client;

    @GetMapping("/api/funcionario-por-cargo")
    public ResponseEntity<?> listaPorCargo(@RequestParam String cargo){

        List<FuncionarioPorCargoResponse> funcionariosPorCargo = client.lista().stream()
                .filter(funcionario -> cargo.equalsIgnoreCase(funcionario.getCargo().name()))
                .map(FuncionarioPorCargoResponse::new)
                .collect(Collectors.toList());



        return ResponseEntity.ok(funcionariosPorCargo);
    }

}
