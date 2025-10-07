package com.example;

import java.util.ArrayList;
import java.util.List;

public class PersonDAO {

    public void save(Person person) {
        return;
    }

    public List<String> isValidToInclude(Person person) {
        List<String> errors = new ArrayList<>();

        if (person.getName() == null || person.getName().trim().isEmpty()) {
            errors.add("Nome não pode ser nulo ou vazio");
        } else {
            String[] nameParts = person.getName().trim().split("\\s+");
            if (nameParts.length < 2) {
                errors.add("Nome deve ter pelo menos 2 partes");
            }
            
            if (!person.getName().matches("^[a-zA-ZÀ-ÿ\\s]+$")) {
                errors.add("Nome deve conter apenas letras e espaços");
            }
        }

        if (person.getAge() < 1 || person.getAge() > 200) {
            errors.add("Idade deve estar no intervalo [1, 200]");
        }

        if (person.getMail() == null) {
            errors.add("Person deve ter pelo menos um objeto Email associado");
        } else {
            if (person.getMail().getName() == null || !person.getMail().isValidEmail(person.getMail().getName())) {
                errors.add("Email deve estar no formato _____@____.____ com cada parte tendo ao menos um caractere");
            }
        }

        return errors;
    }
}
