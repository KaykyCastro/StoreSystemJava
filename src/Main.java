import Products.Product;

public class Main {
    public static void main(String[] args) {

        Store mercadoNegro = new Store("Mercado Negro");

        Product hand = new Product("Hand", 1);

        mercadoNegro.registerProduct(hand);

    }
}