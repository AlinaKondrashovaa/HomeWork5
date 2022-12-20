package Task;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Барсик", 10);
        cats[1] = new Cat("Мурзик", 20);
        cats[2] = new Cat("Алиса", 15);
        cats[3] = new Cat("Семен", 30);
        cats[4] = new Cat("Марфа", 10);
        Plate plate = new Plate(50);
        plate.info();
        for (Cat cat : cats) {
            cat.eat(plate);
            plate.info();
            System.out.println(cat.getName() + " Сытый:" + cat.isSatisfied());
        }
    }

}
