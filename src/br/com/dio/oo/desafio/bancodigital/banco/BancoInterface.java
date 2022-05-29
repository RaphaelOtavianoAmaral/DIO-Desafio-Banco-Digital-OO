package br.com.dio.oo.desafio.bancodigital.banco;

import br.com.dio.oo.desafio.bancodigital.conta.ContaInterface;

public interface BancoInterface {
    void adicionarConta(ContaInterface conta);
    void removerConta(ContaInterface conta);
    void listarContas();
    void listarAgencias();
}
