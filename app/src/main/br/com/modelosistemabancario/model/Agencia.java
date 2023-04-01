package br.com.modelosistemabancario.model;

import java.util.UUID;

public class Agencia {

    private UUID    id;

    private String  numero;

    private String  nome;

    //Relacionamentos
    private Banco   banco;

    public Agencia(String numero, String nome) {
        this.setId(UUID.randomUUID());
        this.numero = numero;
        this.nome = nome;
    }

    public UUID getId() {
        return id;
    }

    private void setId(UUID id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
}
