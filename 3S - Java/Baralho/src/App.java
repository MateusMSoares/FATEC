import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
         // Usando List ao invés de arrays
         List<String> naipes = List.of("Ouros", "Espadas", "Copas", "Paus");
         List<String> nomes = List.of("Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei");
 
         List<Carta> cartas = new ArrayList<>();
         

         for (String naipe : naipes) {
             for (String nome : nomes) {
                 cartas.add(new Carta(nome, naipe));
             }
         }
 
         Baralho baralho = new Baralho(cartas);
         
         System.out.println("\nCartas no baralho:");
         baralho.imprimirBaralho();

         baralho.embaralhar();
         
         System.out.println("\nCartas embaralhadas:");
         baralho.imprimirBaralho();
 

         System.out.println("\nDistribuindo uma carta:");
         System.out.println(baralho.distribuirCartas());
    }
}
