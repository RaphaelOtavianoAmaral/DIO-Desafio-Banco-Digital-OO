package br.com.dio.oo.desafio.bancodigital.agencia;

public class Agencia {

    private String nome;
    private String codigo;

    public Agencia(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }
}
