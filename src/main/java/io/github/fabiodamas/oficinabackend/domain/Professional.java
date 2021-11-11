package io.github.fabiodamas.oficinabackend.domain;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Professional extends Person {
    protected String typeBond;
    protected LocalDate bondStartDate;
    protected String registration;

}
