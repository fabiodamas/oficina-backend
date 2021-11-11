package io.github.fabiodamas.oficinabackend.domain;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;

@MappedSuperclass
public class Person extends BaseEntity{
    protected String nome;

    @Column(unique=true)
    protected String cpf;

    @Column(unique=true)
    protected String email;
    protected String senha;
    protected LocalDate dataCriacao = LocalDate.now();

    protected Person() {
    }

    protected Person(Long id, String nome, String cpf, String email) {
        this.setId(id);
        this.setNome(nome);
        this.setCpf(cpf);
        this.setEmail(email);
    }    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    
}

