package br.com.zup.edu.gestaofuncionarioclient.funcionarios;

import br.com.zup.edu.gestaofuncionarioclient.client.FuncionarioResponse;

public class FuncionarioPorCargoResponse {

    private final Long id;
    private final String nome;
    private final String cpf;
    private final Cargo cargo;

    public FuncionarioPorCargoResponse(FuncionarioResponse funcionarioResponse) {
        this.id = funcionarioResponse.getId();
        this.nome = funcionarioResponse.getNome();
        this.cpf = funcionarioResponse.getCpf();
        this.cargo = funcionarioResponse.getCargo();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Cargo getCargo() {
        return cargo;
    }
}
