public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(40);
        plate.info();

        Cat[] singleCat = new Cat[3];
        singleCat[0] = new Cat("Барсик", 15, false);
        singleCat[1] = new Cat("Пушок", 10, false);
        singleCat[2] = new Cat("Котя", 20, false);

        for (int i = 0; i < singleCat.length; i++) {
            if (singleCat[i].appetite <= plate.food) {
                singleCat[i].eat(plate);
                singleCat[i].fedUp = true;
                System.out.println("Кот " + singleCat[i].name + " съел " + singleCat[i].appetite + " еды.");
                plate.info();
            } else {
                System.out.println("Кот " + singleCat[i].name + " хотел съесть " + singleCat[i].appetite + " еды, " +
                        "но в тарелке столько не было, поэтому кот не стал есть и ушел голодный.");
            }
        }

        plate.info();
        plate.increaseFood(20);
        plate.info();

        System.out.println();
        System.out.println("Статус сытости котов:");
        for (int i = 0; i < singleCat.length; i++) {
            System.out.println("Кот " + singleCat[i].name + ", сытость: " + singleCat[i].fedUp);
        }

    }
}
