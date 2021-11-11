package io.github.fabiodamas.oficinabackend.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Customer extends Person {
    @Column(unique=true)
    protected String cidade;

    public Customer() {
        super();
    }

    public Customer(Long id, String nome, String cpf, String email, String cidade) {
        super(id, nome, cpf, email);
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

}
