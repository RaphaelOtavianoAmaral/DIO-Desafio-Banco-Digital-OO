package br.com.dio.oo.desafio.bancodigital.cliente;

import br.com.dio.oo.desafio.bancodigital.conta.ContaInterface;

public interface ClienteInterface {

    void abrirConta(ContaInterface conta);
    void fecharConta(ContaInterface conta);

}
