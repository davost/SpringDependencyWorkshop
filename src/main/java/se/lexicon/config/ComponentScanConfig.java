package se.lexicon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import se.lexicon.data_access.StudentDAO;

import java.util.Scanner;

@Configuration
@ComponentScan(basePackages = "se.lexicon")

public class ComponentScanConfig {

  private final StudentDAO studentDAO;

  /*@Bean
    public void Scanner() {
  */
  public ComponentScanConfig(StudentDAO studentDAO) {
    this.studentDAO = studentDAO;
  }

  @Bean
  public Scanner scanner() {return new Scanner(System.in);}


}
