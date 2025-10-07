package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Email {
    private int id;
    private String name;
    
    public Email(String name) {
        if (!isValidEmail(name)) {
            throw new IllegalArgumentException("Email deve estar no formato _____@____.____ com cada parte tendo ao menos um caractere");
        }
        this.name = name;
    }
    
    public void setName(String name) {
        if (!isValidEmail(name)) {
            throw new IllegalArgumentException("Email deve estar no formato _____@____.____ com cada parte tendo ao menos um caractere");
        }
        this.name = name;
    }
    
    public boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }
        
        int atIndex = email.indexOf('@');
        if (atIndex == -1 || email.indexOf('@', atIndex + 1) != -1) {
            return false;
        }
        
        if (atIndex == 0 || atIndex == email.length() - 1) {
            return false;
        }
        
        String localPart = email.substring(0, atIndex);
        String domainPart = email.substring(atIndex + 1);
        
        if (localPart.length() < 1) {
            return false;
        }
        
        int dotIndex = domainPart.indexOf('.');
        if (dotIndex == -1 || domainPart.indexOf('.', dotIndex + 1) != -1) {
            return false;
        }
        
        if (dotIndex == 0 || dotIndex == domainPart.length() - 1) {
            return false;
        }
        
        String domain = domainPart.substring(0, dotIndex);
        String extension = domainPart.substring(dotIndex + 1);
        
        return domain.length() >= 1 && extension.length() >= 1;
    }
}
