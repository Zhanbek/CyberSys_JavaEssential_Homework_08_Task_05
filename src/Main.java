import model.Animal;

public class Main {
    public static void main(String[] args) {
        Animal first = new Animal("Васька", 5, false);
        Animal second = new Animal("Мурзик", 2, true);
        Animal third = new Animal("Шарик", 1, true);
        Animal fourth = second;

        System.out.println();
        System.out.println("first => " + first);
        System.out.println("second => " +second);
        System.out.println("third => " + third);
        System.out.println("fourth => " + fourth);
        System.out.println("----------------------------------");
        System.out.println("first.hashCode() = " + first.hashCode());
        System.out.println("second.hashCode() = " + second.hashCode());
        System.out.println("third.hashCode() = " + third.hashCode());
        System.out.println("fourth.hashCode() = " + fourth.hashCode());
        System.out.println("----------------------------------");
        System.out.println("first equals second = " + first.equals(second));
        System.out.println("first equals third = " + first.equals(third));
        System.out.println("first equals fourth = " + first.equals(fourth));
        System.out.println();
        System.out.println("second equals third = " + second.equals(third));
        System.out.println("second equals fourth = " + second.equals(fourth));
        System.out.println();
        System.out.println("third equals fourth = " + third.equals(fourth));
        System.out.println("----------------------------------");
    }
}