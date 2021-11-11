package io.github.fabiodamas.oficinabackend.service;

import com.github.javafaker.Faker;
import io.github.fabiodamas.oficinabackend.domain.Brand;
import io.github.fabiodamas.oficinabackend.domain.Customer;
import io.github.fabiodamas.oficinabackend.domain.Product;
import io.github.fabiodamas.oficinabackend.domain.Professional;
import io.github.fabiodamas.oficinabackend.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

@Service
public class DbService {

    @Autowired
    private BrandRepository brandRepository;

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private FinancialRepository financialRepository;

    @Autowired
    private ModelRepository modelRepository;

    @Autowired
    private StockRepository stockRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProfessionalRepository professionalRepository;


    public void criaBaseDados() {
        Faker fake = new Faker(new Locale("pt-BR"));

        List<String> brands;
        brands= Arrays.asList("brand","CHERY", "AUDI", "CHEVROLET", "CITROËN", "DODGE", "FIAT", "FORD", "HONDA", "HYUNDAI", "JAC", "JAGUAR", "JEEP", "KIA", "LEXUS", "LIFAN", "MERCEDES-BENZ", "MITSUBISHI", "NISSAN", "PEUGEOT", "RENAULT", "SSANGYONG", "SUZUKI", "TOYOTA", "VOLKSWAGEN", "VOLVO");

        brands.forEach(b -> brandRepository.save(new Brand(b)));

        for(int i=0; i < 10; i++){
            Customer cli1 = new Customer();
            cli1.setId(null);
            cli1.setEmail(fake.bothify("????????##@gmail.com"));
            cli1.setCpf(fake.code().gtin8());
            cli1.setNome(fake.name().firstName() + " " + fake.name().lastName()) ;
            cli1.setCidade(fake.address().city());
            customerRepository.save(cli1);

            Professional prof = new Professional();
            prof.setEmail(fake.bothify("????????##@gmail.com"));
            prof.setCpf(fake.code().gtin8());
            prof.setNome(fake.name().firstName() + " " + fake.name().lastName()) ;
            professionalRepository.save(prof);

            Product prod = new Product();
            prod.setDescription(fake.commerce().productName());
            prod.setUnity("un");
            prod.setQuantitymin(fake.random().nextInt(1,50));
            productRepository.save(prod);
        }


    }

}
