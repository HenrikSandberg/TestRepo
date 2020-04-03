public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        System.out.println(new Person("Henrik", 28).toString());
        Person b = new Person("Mathias", 19);
        System.out.println(b.toString());
    }
}