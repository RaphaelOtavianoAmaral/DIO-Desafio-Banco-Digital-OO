package br.com.dio.oo.desafio.bancodigital.banco;

import br.com.dio.oo.desafio.bancodigital.agencia.Agencia;

import java.util.List;

public class Banco {

    private String nome;
    private List<Agencia> listaDeAgencias;

    public Banco(String nome) {
        this.nome = nome;
    }

    public Banco(String nome, List<Agencia> listaDeAgencias) {
        this.nome = nome;
        this.listaDeAgencias = listaDeAgencias;
    }

    public String getNome() {
        return nome;
    }

    public List<Agencia> getListaDeAgencias() {
        return listaDeAgencias;
    }
}
