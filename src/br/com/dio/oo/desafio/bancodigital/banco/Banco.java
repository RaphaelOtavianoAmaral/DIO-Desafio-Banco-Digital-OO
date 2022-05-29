package br.com.dio.oo.desafio.bancodigital.banco;

import br.com.dio.oo.desafio.bancodigital.agencia.Agencia;
import br.com.dio.oo.desafio.bancodigital.conta.ContaInterface;

import java.util.List;

public class Banco implements BancoInterface{

    private String nome;
    private List<Agencia> listaAgencias;
    private List<ContaInterface> listaContas;


    public Banco(String nome, List<Agencia> listaAgencias, List<ContaInterface> listaContas) {
        this.nome = nome;
        this.listaAgencias = listaAgencias;
        this.listaContas = listaContas;
    }

    @Override
    public void adicionarConta(ContaInterface conta) {
        this.listaContas.add(conta);
    }

    @Override
    public void removerConta(ContaInterface conta) {
        this.listaContas.remove(conta);
    }

    @Override
    public void adicionarAgencia(Agencia agencia) {
        this.listaAgencias.add(agencia);
    }

    @Override
    public void removerAgencia(Agencia agencia) {
        this.listaAgencias.remove(agencia);
    }

    @Override
    public void listarContas() {
        System.out.println("Contas do Banco "+this.nome);
        this.listaContas.forEach(System.out::println);
    }

    @Override
    public void listarAgencias() {
        this.listaAgencias.forEach(agencia -> System.out.println(agencia.toString()));
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public List<Agencia> getListaAgencias() {
        return listaAgencias;
    }
}
