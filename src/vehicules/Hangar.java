public class Hangar {
    public static void main(String[] args) {
        Car clio = new Car("renault", 400);
        Car matiz = new Car("chevrolet", 100400);

        Car titanic = new Car("big boat", 1400);
        Car raft = new Car("just wood", 1);

        System.out.println(matiz.doStuff());
        System.out.println(titanic.doStuff());
    }
}
