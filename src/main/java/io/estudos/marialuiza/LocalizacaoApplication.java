package io.estudos.marialuiza;

import io.estudos.marialuiza.domain.repository.CidadeRepository;
import io.estudos.marialuiza.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LocalizacaoApplication implements CommandLineRunner {

    @Autowired
    private CidadeService service;

    @Override
    public void run(String... args) throws Exception {
        service.listarCidadesPorNomeSQL();
    }

    public static void main(String[] args) {
        SpringApplication.run(LocalizacaoApplication.class,args);
    }
}