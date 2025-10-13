package Practice.no1;

public abstract class Robot {
    private String name;

    public Robot (String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public abstract void move();
    public abstract void attack();
}
