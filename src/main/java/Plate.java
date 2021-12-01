public class Plate {
    public int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("Еды в тарелке: " + food);
    }

    public void decreaseFood(int n) {
            food -= n;
    }

    public void increaseFood(int n) {
        food += n;
        System.out.println("В тарелку досыпали " + n + " еды.");
    }
}
