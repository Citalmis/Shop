public class tovarW extends Tovar {
    double quantity;

    public double getQuantity() {
        return quantity;
    }

    public tovarW(String name, double purshPrice, double buyPrice, double salePrice, int bbDate, double quantity){
        super(name, purshPrice, buyPrice, salePrice, bbDate);
        this.quantity=quantity;
    }
    public double price(double w){
        return super.getBuyPrice()*w;
    }
    public void display(){
        super.display();
        System.out.println(" "+quantity+" килограммов");
    }
}
