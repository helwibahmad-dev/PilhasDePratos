//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // adc 5 pratos
        PilhaDePratos pilhas = new PilhaDePratos(5);

        for (int i = 1; i <= 5; i++){
            pilhas.push(i);
        }
        System.out.println();

        //-2 pratos
       System.out.println("Prato retirado: " + pilhas.pop());
       System.out.println("Prato retirado: " + pilhas.pop());

        System.out.println();

        // qual pratos está no topo?
        System.out.println("O prato está: " + pilhas.peek());
        System.out.println();

        // Exibindo eatado final da pilha
        pilhas.mostrarPilha();
        System.out.println();


        //simulando erro

        //se rodar direto ele funciona pq na atividade pede para remover 2.
        System.out.println("Simulando erro. Adiconando pratos extras: ");
        pilhas.push(6);

        System.out.println("A Pilha foi esvaziada!!");
        while (!pilhas.estaVazia()){
            pilhas.pop();
        }
        System.out.println("Tentando remover pilha vazia: ");
        pilhas.pop();
    }
}