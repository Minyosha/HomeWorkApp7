public class Cat {
    public String name;
    public int appetite;
    public boolean fedUp = false;

    public Cat (String name, int appetite, boolean fedUp) {
        this.name = name;
        this.appetite = appetite;
        this.fedUp = false;
    }
    public void eat(Plate plate) {
        plate.decreaseFood(appetite);
    }
}