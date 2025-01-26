package models;

public abstract class Products {

    protected String name;
    protected int barCode;
    protected Category categoryProduct;

    public Products(String name, int barCode, Category categoryProduct){
        this.name = name;
        this.barCode = barCode;
        this.categoryProduct = categoryProduct;
    }

    abstract double CalculatePrice();

}
