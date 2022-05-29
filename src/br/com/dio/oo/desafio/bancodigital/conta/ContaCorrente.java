package br.com.dio.oo.desafio.bancodigital.conta;

import br.com.dio.oo.desafio.bancodigital.agencia.Agencia;
import br.com.dio.oo.desafio.bancodigital.banco.Banco;
import br.com.dio.oo.desafio.bancodigital.cliente.Cliente;

public class ContaCorrente extends Conta{


    public ContaCorrente(Banco banco, Agencia agencia, int numeroConta, double saldoInicial, Cliente titular) {
        super(banco, agencia, numeroConta, saldoInicial, titular);
    }

    public ContaCorrente(Banco banco, Agencia agencia, int numeroConta, Cliente titular) {
        super(banco, agencia, numeroConta, titular);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println(">>>>>>>>> Extrato Conta Corrente <<<<<<<<<");
        super.imprimirInformacoesExtrato();
    }
}
