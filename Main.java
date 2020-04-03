public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Person a = new Person("Henrik", 28);
        String print = a.toString();
        System.out.println(print);

        Person b = new Person("Mathias", 19);
        System.out.println(b.toString());
    }
}