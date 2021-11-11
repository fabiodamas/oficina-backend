package io.github.fabiodamas.oficinabackend.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "brand")
@Entity
public class Brand extends BaseEntity {
    private String name;

    public Brand() {
    }

    public Brand(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}