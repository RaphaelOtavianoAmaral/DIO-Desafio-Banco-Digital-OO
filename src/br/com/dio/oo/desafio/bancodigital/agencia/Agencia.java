package br.com.dio.oo.desafio.bancodigital.agencia;

public class Agencia {

    private String nome;
    private String codigo;

    public Agencia(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return  "Agência: " + nome + '\n'+
                "Código: " + codigo + '\n';
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }
}
