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