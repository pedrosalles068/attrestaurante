//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("cliente1@gmail.com","João","35988996428");
        Bebida bebida1 = new Bebida("Coca Cola",15,"servido na torre","2L","Refrigetante");
        Comida comida1 = new Comida("Pizza",80,"pizza de 12 pedaços","especiais");
        Pedido p1 = new Pedido(1,c1,"preparando");
        p1.adicionaItem(comida1);
        p1.adicionaItem(bebida1);

       p1.imprimirPedido();


    }
}