package io.github.fabiodamas.oficinabackend.domain;

import javax.persistence.*;

@Table(name = "product")
@Entity
public class Product  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "description")
    private String description;

    @Column(name = "unity", length = 10)
    private String unity;

    @Column(name = "quantity_min")
    private Integer quantityMin;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantitymin() {
        return quantityMin;
    }

    public void setQuantitymin(Integer quantityMin) {
        this.quantityMin = quantityMin;
    }

    public String getUnity() {
        return unity;
    }

    public void setUnity(String unity) {
        this.unity = unity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}