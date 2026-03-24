public class MainPilhaDinamica {
    public static void main(String[] args) {
        PilhaDinamica pilhaDinamica = new PilhaDinamica();

        pilhaDinamica.exibirPilha();

        pilhaDinamica.empilhar("matheus");
        pilhaDinamica.empilhar("márcia");
        pilhaDinamica.empilhar("murilo");
        pilhaDinamica.empilhar("felipe");
        pilhaDinamica.exibirPilha();
        pilhaDinamica.quantidadeElementos();
        pilhaDinamica.mostrarTopo();

        pilhaDinamica.desempilhar();
        pilhaDinamica.desempilhar();
        pilhaDinamica.desempilhar();
        pilhaDinamica.exibirPilha();
        pilhaDinamica.quantidadeElementos();
        pilhaDinamica.mostrarTopo();

    }
}

