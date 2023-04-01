package br.com.modelosistemabancario.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

public class Banco {

    private UUID id;

    private String numero;

    private String cnpj;

    private String nome;

    // RELACIONAMENTOS
    private Collection<Agencia> agencias;

    public Banco(String numero, String cnpj, String nome) {
        this.setId(UUID.randomUUID());
        this.numero = numero;
        this.cnpj = cnpj;
        this.nome = nome;
        this.agencias = new ArrayList<>();
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Collection<Agencia> getAgencias() {
        return agencias;
    }

    public void setAgencias(Collection<Agencia> agencias) {
        this.agencias = agencias;
    }
}
