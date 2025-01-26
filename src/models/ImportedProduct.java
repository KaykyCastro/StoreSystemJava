package models;

public class ImportedProduct extends Products{

    private double transferCost;

    public ImportedProduct(String name, int barCode, Category productCategory, double transferCost){
        super(name, barCode, productCategory);
        this.transferCost = transferCost;
    }

    @Override
    double CalculatePrice() {
        return 0;
    }
}
