package br.com.dio.oo.desafio.bancodigital.conta;

import br.com.dio.oo.desafio.bancodigital.agencia.Agencia;
import br.com.dio.oo.desafio.bancodigital.cliente.Cliente;

public abstract class Conta implements ContaInterface{

    protected Agencia agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente titular;

    public Conta(Agencia agencia, int numeroConta, double saldoInicial, Cliente titular) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
        this.titular = titular;
    }

    public Conta(Agencia agencia, int numeroConta, Cliente titular) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0D;
    }

    @Override
    public void retirarDinheiro(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositarDinheiro(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferirDinheiro(ContaInterface contaDestino, double valor) {
        this.retirarDinheiro(valor);
        contaDestino.depositarDinheiro(valor);
    }

    public void imprimirInformacoes() {
        System.out.println("Titular: "+this.titular.getNome());
        System.out.println("Agência: "+this.agencia.toString());
        System.out.println("Número da Conta: "+this.numeroConta);
        System.out.println("Saldo da Conta: "+this.saldo+"R$");
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }
}
