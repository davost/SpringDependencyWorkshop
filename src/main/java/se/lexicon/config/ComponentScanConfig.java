package se.lexicon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import se.lexicon.data_access.StudentDAO;
import se.lexicon.data_access.StudentDAOListImpl;

@Configuration
@ComponentScan(basePackages = "se.lexicon")

public class ComponentScanConfig {

    @Bean
    public StudentDAO studentDao(){
        return new StudentDAOListImpl();
    }

}
