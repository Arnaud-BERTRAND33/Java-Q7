public class Hangar {
    public static void main(String[] args) {

        Car clio = new Car("Clio", 10);
        Boat barque = new Boat("Barque", 20);

        System.out.println(clio.doStuff());
        System.out.println(barque.doStuff());

    }
}