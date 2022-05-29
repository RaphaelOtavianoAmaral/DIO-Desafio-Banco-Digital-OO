package br.com.dio.oo.desafio.bancodigital.cliente;

import br.com.dio.oo.desafio.bancodigital.conta.ContaInterface;

import java.util.ArrayList;
import java.util.List;

public class Cliente implements ClienteInterface {

    private String nome;
    private String cpf;
    private List<ContaInterface> contas;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.contas = new ArrayList<>();
    }

    @Override
    public void abrirConta(ContaInterface conta) {
        this.contas.add(conta);
    }

    @Override
    public void fecharConta(ContaInterface conta) {
        this.contas.remove(conta);
    }

    public void listarContas(){
        this.contas.forEach(contaInterface -> contaInterface.imprimirExtrato());
    }

    @Override
    public String toString() {
        return  "Nome: "+ nome + '\n' +
                "CPF: " + cpf + '\n';
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
