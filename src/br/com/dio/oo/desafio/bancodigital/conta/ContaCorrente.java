package br.com.dio.oo.desafio.bancodigital.conta;

import br.com.dio.oo.desafio.bancodigital.agencia.Agencia;
import br.com.dio.oo.desafio.bancodigital.cliente.Cliente;

public class ContaCorrente extends Conta{



    public ContaCorrente(Agencia agencia, int numeroConta, double saldoInicial, Cliente titular) {
        super(agencia, numeroConta, saldoInicial, titular);
    }

    public ContaCorrente(Agencia agencia, int numeroConta, Cliente titular) {
        super(agencia, numeroConta, titular);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println(">>>>>>>>> Extrato Conta Corrente <<<<<<<<<");
        super.imprimirInformacoesExtrato();
    }
}
