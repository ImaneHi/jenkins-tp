package org.example.personnems.service;

import org.example.personnems.domain.Personne;

import java.util.ArrayList;
import java.util.List;

public class PersonneServiceImpl implements PersonneService {
    private static Integer id = 0;
    private static List<Personne> personnes = new ArrayList<>();
    @Override
    public List<Personne> recupererPersonnes() {
        return personnes;
    }
    @Override
    public void ajouterPersonne(Personne personne) {
        id += 1;
        personne.setId(id);
        personnes.add(personne);
    }
    @Override
    public void deletePersonne(Integer id) {
        personnes.remove(personnes.stream().filter(personne -> personne.getId().equals(id)).findFirst());
    }
}
