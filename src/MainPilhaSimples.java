public class MainPilhaSimples {
    public static void main(String[] args) {
        PilhaSimples pilhaSimples = new PilhaSimples(5);

        pilhaSimples.exibirPilha();

        pilhaSimples.empilhar("felipe");
        pilhaSimples.empilhar("murilo");
        pilhaSimples.empilhar("márcia");
        pilhaSimples.empilhar("matheus");
        pilhaSimples.quantidadeElementos();
        pilhaSimples.exibirPilha();
        pilhaSimples.mostrarTopo();

        pilhaSimples.desempilhar();
        pilhaSimples.desempilhar();
        pilhaSimples.desempilhar();
        pilhaSimples.quantidadeElementos();
        pilhaSimples.mostrarTopo();
    }
}
