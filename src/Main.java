import Products.Product;

public class Main {
    public static void main(String[] args) {

    Store amazon = new Store("Amazon");

    Product book = new Product("Homens de Honra", 1);
    Product computer = new Product("Notebook Asus", 2);
    Product teste = new Product("Teste", 3);

    amazon.registerProduct(book);
    amazon.registerProduct(computer);
    amazon.registerProduct(teste);

    amazon.listAllProductsInStock();


    }
}