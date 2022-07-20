package br.com.zup.edu.gestaofuncionarioclient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(
        name = "funcionarioClient",
        url = "http://localhost:8080/oauth2-resourceserver-gestao-funcionarios/"
)
public interface FuncionariosClient {

    @GetMapping("/api/funcionarios")
    public List<FuncionarioResponse> lista();

}
