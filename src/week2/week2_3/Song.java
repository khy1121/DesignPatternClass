package week2.week2_3;

public class Song {
    private String name;
    private double price;
    private DiscountRate calc;

    public Song(String name, double price){
        this.name=name;
        this.price=price;
    }

    public void setDiscountOrNot(DiscountRate dr){
        this.calc=dr;
    }

    public double getPrice(){
        return this.price-(this.price*this.calc.calculate());
    }

    public String getName(){
        return this.name;
    }
}
