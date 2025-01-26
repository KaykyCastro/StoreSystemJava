package models;

public enum BarCode {
    NATIONAL(1),
    IMPORTED(2);

    private final int originProduct;

    BarCode(int origin){
        this.originProduct = origin;
    }

    public String createBarCode(){
        String origin;
        if(originProduct == 1){
            return "To-do";
        }
        return null;
    }

}
