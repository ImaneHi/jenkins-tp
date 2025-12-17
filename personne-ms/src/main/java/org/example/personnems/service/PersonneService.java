package org.example.personnems.service;

import org.example.personnems.domain.Personne;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonneService {
    List<Personne> recupererPersonnes();
    void ajouterPersonne(Personne personne);
    void deletePersonne(Integer id) throws Exception;
}
