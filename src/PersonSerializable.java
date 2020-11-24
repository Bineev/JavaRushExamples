import java.io.*;

public class PersonSerializable implements Serializable {
    int age;
    String name;

    public PersonSerializable(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //serialize person
        PersonSerializable person = new PersonSerializable(25, "Valera");
        FileOutputStream fos = new FileOutputStream("c:\\Files\\" + person.name + ".dat");
        ObjectOutputStream obs = new ObjectOutputStream(fos);
        obs.writeObject(person);
        //deserialize person
        FileInputStream fis = new FileInputStream("c:\\Files\\Valera.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        PersonSerializable valeraIsBack = (PersonSerializable) ois.readObject();
        System.out.println(valeraIsBack.name + " " + valeraIsBack.age);

    }

}
