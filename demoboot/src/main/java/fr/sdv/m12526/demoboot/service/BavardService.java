package fr.sdv.m12526.demoboot.service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class BavardService {

    @Value("${spring.application.names:default value}")
    private  String nom;

    void setNom(String newNom){
        this.nom = newNom;
    }

    public String getNom(){
        return this.nom;
    }

    public String parler(){
        String nomClass = this.getClass().getSimpleName();
        return nom + nomClass;
    }

    @PostConstruct()
    private void postConstruct() {
        System.out.println("PostConstruction Fait");
    }
}
