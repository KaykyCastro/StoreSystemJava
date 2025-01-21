package Products;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    private Product headProduct;
    private int quantityOfProdutcs;

    public LinkedList(){
        this.headProduct = null;
        this.quantityOfProdutcs = 0;
    }


    public int getQuantityOfProdutcs() {
        return quantityOfProdutcs;
    }

    public void registerNewProduct(Product productToBeRegistered) {
        try{
            if(headProduct == null){
                headProduct = new Product(productToBeRegistered.getName(), productToBeRegistered.getBarCode());
                quantityOfProdutcs++;
                System.out.println("Produto adicionado com sucesso!");
            } else {
                Product current = headProduct;
                while (current.getLinkProduct() != null){
                    current = current.getLinkProduct();
                }

                current.setLinkProduct(productToBeRegistered);
                quantityOfProdutcs++;
                System.out.println("Porduto adicionado com sucesso!");
            }
        } catch (Exception e){
            System.out.println(e);
        }

    }

    public List<Product> listAllProducts() {
        if (headProduct == null){
            System.out.println("Não há nenhum produto!");
        } else {
            List<Product> products = new ArrayList<>();
            Product current = headProduct;
            while (current != null){
                products.add(current);
                current = current.getLinkProduct();
            }
            return products;
        }
        return null;
    }
}
