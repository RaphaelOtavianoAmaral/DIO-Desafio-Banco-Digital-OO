package br.com.dio.oo.desafio.bancodigital.conta;

import br.com.dio.oo.desafio.bancodigital.cliente.Cliente;

public interface ContaInterface {

    void retirarDinheiro(double valor);
    void depositarDinheiro(double valor);
    void transferirDinheiro(ContaInterface contaDestino, double valor);
    void imprimirExtrato();
}
