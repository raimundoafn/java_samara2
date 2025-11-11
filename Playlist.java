import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nome;
    private List<Midia> midias;

    public Playlist(String nome) {
        this.nome = nome;
        this.midias = new ArrayList<>();
    }

    public void adicionarMidia(Midia m) {
        midias.add(m);
    }

    public void removerMidia(Midia m) {
        midias.remove(m);
    }

    public List<Midia> getMidias() {
        return midias;
    }

    public void listarMidias() {
        System.out.println("\nPlaylist: " + nome);
        if (midias.isEmpty()) {
            System.out.println("Nenhuma mídia na playlist.");
        } else {
            for (Midia m : midias) {
                System.out.println(m);
            }
            System.out.println("Duração total: " + calcularDuracaoTotal() + " min");
        }
    }

    public double calcularDuracaoTotal() {
        double total = 0;
        for (Midia m : midias) {
            total += m.getDuracao();
        }
        return total;
    }
}
