package br.com.dio.oo.desafio.bancodigital.exemplo;

import br.com.dio.oo.desafio.bancodigital.agencia.Agencia;
import br.com.dio.oo.desafio.bancodigital.banco.Banco;
import br.com.dio.oo.desafio.bancodigital.cliente.Cliente;
import br.com.dio.oo.desafio.bancodigital.cliente.ClienteInterface;
import br.com.dio.oo.desafio.bancodigital.conta.ContaCorrente;
import br.com.dio.oo.desafio.bancodigital.conta.ContaInterface;
import br.com.dio.oo.desafio.bancodigital.conta.ContaPoupanca;

import java.util.ArrayList;



public class ExemploInicial {

    private ContaInterface conta;

    public static void main(String[] args) {
        System.out.println("Criando Banco...");
        Banco banco = new Banco("Banco Genérico",new ArrayList<>(),new ArrayList<>());
        System.out.println(banco);

        System.out.println("Adicionando agências...");
        banco.adicionarAgencia( new Agencia("Agência Genérica 1","AG1"));
        banco.adicionarAgencia( new Agencia("Agência Genérica 2","AG2"));
        banco.adicionarAgencia( new Agencia("Agência Genérica 3","AG3"));

        System.out.println("Listando agências do banco...");
        banco.listarAgencias();

        System.out.println("\nCriando Clientes...");
        Cliente cliente1, cliente2, cliente3;

        cliente1 = new Cliente("João","123456789-0");
        cliente2 = new Cliente("André", "098765432-1");
        cliente3 = new Cliente("Maria", "123789456-2");

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);

        System.out.println("\nCriando nova conta corrente para cliente 1...");
        ContaInterface conta = new ContaCorrente(banco,banco.getListaAgencias().get(0),12135,cliente1);
        cliente1.abrirConta(conta);
        banco.adicionarConta(conta);

        System.out.println("Listando contas do cliente 1:");
        cliente1.listarContas();

        System.out.println("Listando contas do banco:");
        banco.listarContas();

        System.out.println("\nCriando nova conta poupança para cliente 1...");
        ContaInterface conta1 = new ContaPoupanca(banco,banco.getListaAgencias().get(1),12135,cliente1);
        cliente1.abrirConta(conta1);
        banco.adicionarConta(conta1);

        System.out.println("Listando contas do cliente 1:");
        cliente1.listarContas();

        System.out.println("Listando contas do banco:");
        banco.listarContas();
    }
}
