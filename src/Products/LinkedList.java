package Products;

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
            } else {
                Product linkedProduct = headProduct.getLinkProduct();
                while (linkedProduct != null){
                    linkedProduct = linkedProduct.getLinkProduct();
                }

                linkedProduct = productToBeRegistered;
            }
        } catch (Exception e){
            System.out.println(e);
        }

    }


}
