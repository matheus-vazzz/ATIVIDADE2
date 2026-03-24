public class PilhaSimples implements PilhaOperacoes {
    String[] pilha;
    int topo;
    int tamanho;

    public PilhaSimples(int tamanho) {
        this.tamanho = tamanho;
        this.pilha = new String[tamanho];
        this.topo = -1;
        System.out.println("A Pilha foi criada com sucesso. Ela possui " + tamanho + " espaços disponíveis.");
    }

    private boolean estaCheia() {
        if(this.topo == this.tamanho - 1) {
            System.out.println("A pilha está cheia.");
            return true;
        }
        return false;
    }

    private boolean estaVazio() {
        if(this.topo == -1) {
            System.out.println("A pilha está vazia.");
            return true;
        }
        return false;
    }

    @Override
    public void quantidadeElementos() {
        System.out.println("Quantidade de elementos: " + (this.topo + 1));
    }

    @Override
    public void exibirPilha() {
        if(!estaVazio()) {
            for(int i = this.topo; i >= 0; i--) {
                System.out.println("Pilha[" + i + "] = " + this.pilha[i]);
            }
        }
    }

    @Override
    public void empilhar(String elemento) {
        if(!estaCheia()) {
            this.topo++;
            this.pilha[this.topo] = elemento;
            System.out.println("Elemento " + elemento + " adicionado na pilha.");
        }
    }

    @Override
    public void desempilhar() {
        if(!estaVazio()) {
            System.out.println("Elemento " + this.pilha[this.topo] + " removido da pilha.");
            this.pilha[this.topo] = null;
            this.topo--;
        }
    }

    @Override
    public void mostrarTopo() {
        if(!estaVazio()) {
            System.out.println("Topo da pilha: " + this.pilha[this.topo]);
        }
    }
}