public class Artifact {
    static int count = 1;
    String culture;
    int age;
    int number;

    public Artifact() {
        this.number = count++;
    }

    public Artifact(String culture) {
        this();
        this.culture = culture;
    }

    public Artifact(String culture, int age) {
        this();
        this.age = age;
        this.culture = culture;
    }

    public static void main(String[] args) {
        Artifact art1 = new Artifact();
        Artifact art2 = new Artifact("Maya");
        Artifact art3 = new Artifact("Aztec", 12);

        System.out.println(art1.number);
        System.out.println(art2.number + " " + art2.culture);
        System.out.println(art3.number + " " + art3.culture + " " + art3.age);

    }
}
