package Products;

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
                headProduct = productToBeRegistered;
                quantityOfProdutcs++;
            } else {
                Product linkedProduct = headProduct.getLinkProduct();
                while (linkedProduct != null){
                    linkedProduct = linkedProduct.getLinkProduct();
                }

                linkedProduct = productToBeRegistered;
                quantityOfProdutcs++;
            }
        } catch (Exception e){
            System.out.println(e);
        }

    }

    public void listAllProducts() {
        if(headProduct != null) {
            if(quantityOfProdutcs == 1){
               System.out.println(headProduct);
            } else {
                Product headProductToList = headProduct;
                while (headProductToList != null){
                    System.out.println(headProductToList);
                    headProductToList = headProductToList.getLinkProduct();
                }
            }
        }
    }

}
