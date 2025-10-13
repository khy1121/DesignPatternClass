package week5.GamePack;

public abstract class Console {
    private final String manufacturer;
    protected PackStrategy ps;


    public Console(String manufacturer) {
        this.manufacturer = manufacturer;

    }
    public String getManufacturer() { return manufacturer; }
    public void setPackStrategy(PackStrategy ps) { this.ps = ps; }
    public void insert()  {
        if (ps==null) throw new IllegalStateException("게임팩 없음");
        ps.changePack();
    }
    public abstract void display();
}