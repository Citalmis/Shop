public class Tovar {

    private String name;
    private double purshPrice;
    private double buyPrice;
    private double salePrice;
    private int bbDate;


    public String getName() {
        return name;
    }

    public double getPurshPrice() {
        return purshPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public Tovar(String name, double purshPrice, double buyPrice, double salePrice, int bbDate){
        this.name=name;
        this.purshPrice=purshPrice;
        this.buyPrice=buyPrice;
        this.salePrice=salePrice;
        this.bbDate=bbDate;
    }

    public void display(){
        System.out.println(" "+name+" закупочная цена: "+purshPrice);

    }
}
