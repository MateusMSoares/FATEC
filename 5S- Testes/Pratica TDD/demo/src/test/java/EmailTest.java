import com.example.Email;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmailTest {

    @Test
    public void testValidEmailFormats() {
        // Testa emails válidos no formato correto
        Email email1 = new Email("a@b.c");
        assertEquals("a@b.c", email1.getName());
        
        Email email2 = new Email("user@domain.com");
        assertEquals("user@domain.com", email2.getName());
        
        Email email3 = new Email("test@example.org");
        assertEquals("test@example.org", email3.getName());
    }
    
    @Test
    public void testInvalidEmailFormats() {
        // Testa emails sem @
        assertThrows(IllegalArgumentException.class, () -> new Email("userdomain.com"));
        
        // Testa emails com múltiplos @
        assertThrows(IllegalArgumentException.class, () -> new Email("user@domain@.com"));
        
        // Testa emails sem ponto no domínio
        assertThrows(IllegalArgumentException.class, () -> new Email("user@domain"));
        
        // Testa emails com múltiplos pontos no domínio
        assertThrows(IllegalArgumentException.class, () -> new Email("user@domain.com.br"));
        
        // Testa @ no início
        assertThrows(IllegalArgumentException.class, () -> new Email("@domain.com"));
        
        // Testa @ no final
        assertThrows(IllegalArgumentException.class, () -> new Email("user@"));
        
        // Testa ponto no início do domínio
        assertThrows(IllegalArgumentException.class, () -> new Email("user@.com"));
        
        // Testa ponto no final do domínio
        assertThrows(IllegalArgumentException.class, () -> new Email("user@domain."));
        
        // Testa email vazio
        assertThrows(IllegalArgumentException.class, () -> new Email(""));
        
        // Testa email null
        assertThrows(IllegalArgumentException.class, () -> new Email(null));
    }
    
    @Test
    public void testSetNameValidation() {
        Email email = new Email("valid@test.com");
        
        // Testa definir um email válido
        email.setName("another@valid.com");
        assertEquals("another@valid.com", email.getName());
        
        // Testa definir um email inválido
        assertThrows(IllegalArgumentException.class, () -> email.setName("invalid-email"));
    }
    
    @Test
    public void testMinimumRequirements() {
        // Testa o formato mínimo: um caractere em cada parte
        Email email = new Email("a@b.c");
        assertEquals("a@b.c", email.getName());
        
        // Testa que funciona com caracteres únicos
        Email email2 = new Email("x@y.z");
        assertEquals("x@y.z", email2.getName());
    }
}