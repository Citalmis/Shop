public class Buyer {
    private String name;
    private double money;
    private Age age;

    public String getName(){
        return name;
    }
    public double getMoney(){
        return money;
    }
    public void setMoney(double value){
        money=value;
    }
    public Age getAge(){
        return age;
    }
    public Buyer(String name, double money, int age){
        this.name=name;
        this.money=money;
        if(age<18){
            this.age=Age.teenager;
        }
        else{
            this.age=Age.old;
        }
    }
}
