package io.github.fabiodamas.oficinabackend.domain;

import javax.persistence.*;

@Table(name = "car")
@Entity
public class Car extends BaseEntity {
    @Column(name = "placa", nullable = false, unique = true, length = 20)
    private String placa;

    @Column(name = "ano")
    private Integer ano;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }


}