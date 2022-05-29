package br.com.dio.oo.desafio.bancodigital.banco;

import br.com.dio.oo.desafio.bancodigital.agencia.Agencia;
import br.com.dio.oo.desafio.bancodigital.conta.ContaInterface;

public interface BancoInterface {
    void adicionarConta(ContaInterface conta);
    void removerConta(ContaInterface conta);
    void adicionarAgencia(Agencia agencia);
    void removerAgencia(Agencia agencia);
    void listarContas();
    void listarAgencias();
}
