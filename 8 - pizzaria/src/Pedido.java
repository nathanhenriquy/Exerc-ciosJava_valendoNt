import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private String nome;
    private double total;
    private List<Pizza> pizzas;
    private String enderecoEntrega;

    public Pedido(String nome, String enderecoEntrega) {
        this.nome = nome;
        this.enderecoEntrega = enderecoEntrega;
        this.total = 0;
        this.pizzas = new ArrayList<>();
    }

    public void adicionarPizza(Pizza pizza) {
        pizzas.add(pizza);
        total += pizza.getValor();
    }

    public void cancelarPedido() {
        pizzas.clear();
        total = 0.0;
    }

    public double calcularTotal() {
        return total;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void exibirDetalhesPedido() {
        System.out.println();
        System.out.println("====================");
        System.out.println("Detalhes do Pedido:");
        System.out.println("Nome do Cliente: " + nome);
        System.out.println("Endereço de Entrega: " + enderecoEntrega);
        System.out.println("Pizzas:");
        for (int i = 0; i < pizzas.size(); i++) {
            Pizza pizza = pizzas.get(i);
            System.out.println("- " + pizza.getNome() + " - R$" + pizza.getValor());
        }
        System.out.println("Total: R$" + total);
        System.out.println("====================");

    }
}
