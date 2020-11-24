public class Jarvis {

    public Jarvis(String...names) {
        for (String name : names) {
            System.out.println("Hello, dear " + name);
        }
    }

    public static void main(String[] args) {
        Jarvis jarvis1 = new Jarvis("Stark");
        Jarvis jarvis2 = new Jarvis("Freddy", "Jhonny", "Richy");
    }
}
