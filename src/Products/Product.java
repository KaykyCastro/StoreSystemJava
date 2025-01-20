package Products;

public class Product {
    private String name;
    private int barCode;
    private Product linkProduct;

    public Product(String name, int barCode){
        this.name = name;
        this.barCode = barCode;
    }

    public String getName() {
        return name;
    }

    public int getBarCode() {
        return barCode;
    }

    public Product getLinkProduct() {
        return linkProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", barCode=" + barCode +
                '}';
    }
}
