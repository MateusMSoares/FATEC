
import org.junit.jupiter.api.Test;

import com.example.Email;
import com.example.Person;
import com.example.PersonDAO;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class PersonDAOTest {
    
    private PersonDAO personDAO;
    
    @BeforeEach
    void setUp() {
        personDAO = new PersonDAO();
    }
    
    @Test
    void testValidPerson_ShouldReturnEmptyList() {
        Email validEmail = new Email("test@domain.com");
        Person validPerson = new Person(1, "João Silva", 25, validEmail);
        
        List<String> errors = personDAO.isValidToInclude(validPerson);
        
        assertTrue(errors.isEmpty(), "Pessoa válida não deve ter erros");
    }
    
    @Test
    void testPersonWithNullName_ShouldReturnError() {
        Email validEmail = new Email("test@domain.com");
        Person person = new Person(1, null, 25, validEmail);
        
        List<String> errors = personDAO.isValidToInclude(person);
        
        assertTrue(errors.contains("Nome não pode ser nulo ou vazio"));
    }
    
    @Test
    void testPersonWithEmptyName_ShouldReturnError() {
        Email validEmail = new Email("test@domain.com");
        Person person = new Person(1, "", 25, validEmail);
        
        List<String> errors = personDAO.isValidToInclude(person);
        
        assertTrue(errors.contains("Nome não pode ser nulo ou vazio"));
    }
    
    @Test
    void testPersonWithSingleName_ShouldReturnError() {
        Email validEmail = new Email("test@domain.com");
        Person person = new Person(1, "João", 25, validEmail);
        
        List<String> errors = personDAO.isValidToInclude(person);
        
        assertTrue(errors.contains("Nome deve ter pelo menos 2 partes"));
    }
    
    @Test
    void testPersonWithNameContainingNumbers_ShouldReturnError() {
        Email validEmail = new Email("test@domain.com");
        Person person = new Person(1, "João Silva123", 25, validEmail);
        
        List<String> errors = personDAO.isValidToInclude(person);
        
        assertTrue(errors.contains("Nome deve conter apenas letras e espaços"));
    }
    
    @Test
    void testPersonWithNameContainingSpecialChars_ShouldReturnError() {
        Email validEmail = new Email("test@domain.com");
        Person person = new Person(1, "João@ Silva", 25, validEmail);
        
        List<String> errors = personDAO.isValidToInclude(person);
        
        assertTrue(errors.contains("Nome deve conter apenas letras e espaços"));
    }
    
    @Test
    void testPersonWithAgeZero_ShouldReturnError() {
        Email validEmail = new Email("test@domain.com");
        Person person = new Person(1, "João Silva", 0, validEmail);
        
        List<String> errors = personDAO.isValidToInclude(person);
        
        assertTrue(errors.contains("Idade deve estar no intervalo [1, 200]"));
    }
    
    @Test
    void testPersonWithNegativeAge_ShouldReturnError() {
        Email validEmail = new Email("test@domain.com");
        Person person = new Person(1, "João Silva", -5, validEmail);
        
        List<String> errors = personDAO.isValidToInclude(person);
        
        assertTrue(errors.contains("Idade deve estar no intervalo [1, 200]"));
    }
    
    @Test
    void testPersonWithAgeOver200_ShouldReturnError() {
        Email validEmail = new Email("test@domain.com");
        Person person = new Person(1, "João Silva", 201, validEmail);
        
        List<String> errors = personDAO.isValidToInclude(person);
        
        assertTrue(errors.contains("Idade deve estar no intervalo [1, 200]"));
    }
    
    @Test
    void testPersonWithAge1_ShouldNotReturnAgeError() {
        Email validEmail = new Email("test@domain.com");
        Person person = new Person(1, "João Silva", 1, validEmail);
        
        List<String> errors = personDAO.isValidToInclude(person);
        
        assertFalse(errors.contains("Idade deve estar no intervalo [1, 200]"));
    }
    
    @Test
    void testPersonWithAge200_ShouldNotReturnAgeError() {
        Email validEmail = new Email("test@domain.com");
        Person person = new Person(1, "João Silva", 200, validEmail);
        
        List<String> errors = personDAO.isValidToInclude(person);
        
        assertFalse(errors.contains("Idade deve estar no intervalo [1, 200]"));
    }
    
    @Test
    void testPersonWithNullEmail_ShouldReturnError() {
        Person person = new Person(1, "João Silva", 25, null);
        
        List<String> errors = personDAO.isValidToInclude(person);
        
        assertTrue(errors.contains("Person deve ter pelo menos um objeto Email associado"));
    }
    
    @Test
    void testPersonWithInvalidEmail_ShouldReturnError() {
        Email invalidEmail = new Email();
        invalidEmail.setId(1);
        Person person = new Person(1, "João Silva", 25, invalidEmail);
        
        List<String> errors = personDAO.isValidToInclude(person);
        
        assertTrue(errors.contains("Email deve estar no formato _____@____.____ com cada parte tendo ao menos um caractere"));
    }
    
    @Test
    void testPersonWithValidEmail_ShouldNotReturnEmailError() {
        Email validEmail = new Email("usuario@exemplo.com");
        Person person = new Person(1, "João Silva", 25, validEmail);
        
        List<String> errors = personDAO.isValidToInclude(person);
        
        assertFalse(errors.contains("Email deve estar no formato _____@____.____ com cada parte tendo ao menos um caractere"));
    }
    
    @Test
    void testPersonWithMultipleErrors_ShouldReturnAllErrors() {
        Person person = new Person(1, "J", -5, null);
        
        List<String> errors = personDAO.isValidToInclude(person);
        
        assertTrue(errors.contains("Nome deve ter pelo menos 2 partes"));
        assertTrue(errors.contains("Idade deve estar no intervalo [1, 200]"));
        assertTrue(errors.contains("Person deve ter pelo menos um objeto Email associado"));
    }
    
    @Test
    void testPersonWithValidNameTwoParts_ShouldNotReturnNameError() {
        Email validEmail = new Email("test@domain.com");
        Person person = new Person(1, "Ana Maria", 25, validEmail);
        
        List<String> errors = personDAO.isValidToInclude(person);
        
        assertFalse(errors.contains("Nome deve ter pelo menos 2 partes"));
        assertFalse(errors.contains("Nome deve conter apenas letras e espaços"));
    }
    
    @Test
    void testPersonWithValidNameThreeParts_ShouldNotReturnNameError() {
        Email validEmail = new Email("test@domain.com");
        Person person = new Person(1, "Maria José da Silva", 25, validEmail);
        
        List<String> errors = personDAO.isValidToInclude(person);
        
        assertFalse(errors.contains("Nome deve ter pelo menos 2 partes"));
        assertFalse(errors.contains("Nome deve conter apenas letras e espaços"));
    }
}