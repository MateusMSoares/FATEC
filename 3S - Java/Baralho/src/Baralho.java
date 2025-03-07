import java.util.Collections;
import java.util.List;

public class Baralho {

    private List<Carta> cartas;
    private int fimBaralho;

    public Baralho(List<Carta> cartas) {
        this.cartas = cartas;
        this.fimBaralho = cartas.size();
    }

    public void imprimirBaralho() {
        for (Carta carta : cartas) {
            if (carta != null) {
                System.out.println(carta);
            }
        }
    }

    public boolean hasCarta(Carta carta) {
        return cartas.contains(carta);
    }

    public Carta distribuirCartas() {
        this.fimBaralho--;
        return this.cartas.remove(fimBaralho);
    }

    public void embaralhar() {
        Collections.shuffle(cartas);
    }
}
