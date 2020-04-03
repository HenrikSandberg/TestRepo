
public class Person {
    private String navn;
    private int alder;

    Person(String navn, int alder) {
        this.navn = navn;
        this.alder = alder;
    }

    @Override 
    public String toString() {
        return "Hallo " + navn;
    }

}