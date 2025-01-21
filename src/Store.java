import Products.LinkedList;
import Products.Product;

import java.util.List;
import java.util.Scanner;

public class Store {
    private String name;
    private LinkedList productsForSale;
    private LinkedList productsInStock;
    private LinkedList productsSold;

    public Store(String name) {
        this.name = name;
        this.productsForSale = new LinkedList();
        this.productsInStock = new LinkedList();
        this.productsSold = new LinkedList();
    }

    public void registerProduct(Product productToBeRegistered) {
        productsInStock.registerNewProduct(productToBeRegistered);
    }

    public void listAllProductsInStock() {
        System.out.println("Produtos em estoque: ");
        for(Product product : productsInStock.listAllProducts()){
            System.out.println(product);
        }
    }


}
