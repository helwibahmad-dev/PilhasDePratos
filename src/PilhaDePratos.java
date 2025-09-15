public class PilhaDePratos {
    private int[] pilha;
    private int topo;

    public PilhaDePratos(int capacidade) {
        pilha = new int[capacidade];
        topo = -1;
    }

    public boolean estaVazia(){
        return topo == -1;
    }
    public boolean estaCheia(){
        return topo == pilha.length -1;
    }

    public void push(int prato){
        if (estaCheia()){
            System.out.println("Não é possivel adicionar, já tem muitos pratos. (A pilha está cheia!)");
        } else {
            pilha[++topo] = prato;
            System.out.println("Prato " + prato + " adicionado.");
        }
    }

    public int pop(){
        if (estaVazia()){
            System.out.println("Não foi possivel retirar, não tem nenhum prato. (A pilha está vazia)");
            return -1;
        } else {
            int removerPrato = pilha[topo--];
            return removerPrato;
        }
    }

    public int peek(){
        if (estaVazia()){
            System.out.println("A pilha está vazia. Nenhum prato no topo.");
            return -1;
        }else {
            return pilha[topo];
        }

    }

    public void mostrarPilha(){
        if (estaVazia()){
            System.out.println("A pilha está vazia.");
        } else {
            System.out.println("O prato está: ");
            for (int i = 0; i <= topo; i++){
                System.out.println(pilha[i] + " ");
            }
            System.out.println();
        }
    }
}
