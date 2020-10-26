public class tovarP extends Tovar {
    private int quantity;

    public int getQuantity() {
        return quantity;
    }
    public tovarP(String name, double purshPrice, double buyPrice, double salePrice, int bbDate, int quantity ){
        super(name, purshPrice, buyPrice, salePrice, bbDate);
        this.quantity=quantity;
    }
    public double price(int n){
        return super.getBuyPrice()*n;
    }

    public void display(){
        super.display();
        System.out.println(" "+quantity+" штук");
    }
}
