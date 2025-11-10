import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<Midia> midias;

    public Catalogo() {
        this.midias = new ArrayList<>();
    }

    public void adicionarMidias(Midia midia) {
        this.midias.add(midia);

    }

    public Midia buscarPorTítulo(String titulo) {
        for (Midia midia : midias) {
            if (midia.getTitulo().equalsIgnoreCase(titulo)) {
                return midia;
            }
        }
    }

    public List<Midia> buscarPorArtista(String artista) {
        List<Midia> resultado = new ArrayList<>();
        for (Midia midia : midias) {
            if (midia.getArtista().equalsIgnoreCase(artista)) {
                resultado.add(midia);
            }
        }
        return resultado;
    }

    public List<Midia> buscarPorGenero(String genero) {
        List<Midia> resultado = new ArrayList<>();
        for (Midia midia : midias) {
            if (midia.getGenero().equalsIgnoreCase(genero)) {
                resultado.add(midia);
            }
        }
        return resultado;
    }

    public List<Midia> buscarPorDuracao(Double duracao) {
        List<Midia> resultado = new ArrayList<>();
        for (Midia midia : midias) {
            if (midia.getDuracao() == duracao) {
                resultado.add(midia);
            }
        }
        return resultado;
    }
    public  void listarMidias(){
        if(Midia.isEmpty()){
            System.out.println("Não possui nenhuma música cadastrada.");
        }
        for(Midia midia : midias){
            System.out.println(midias);
        }
    }

}
