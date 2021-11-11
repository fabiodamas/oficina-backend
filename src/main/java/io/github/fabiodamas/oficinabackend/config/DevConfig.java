package io.github.fabiodamas.oficinabackend.config;

import io.github.fabiodamas.oficinabackend.service.DbService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevConfig {

    @Value("${spring.jpa.hibernate.ddl-auto}")
    private String value;

    DbService dbService;

    public DevConfig(DbService dbService) {
        this.dbService = dbService;
    }

    @Bean
    void preencher(){
        if (value.equals("update")){
            dbService.criaBaseDados();
        }
    }

}
