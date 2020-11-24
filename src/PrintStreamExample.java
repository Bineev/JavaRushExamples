import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamExample {
    static int count = 1;
    String name;
    int age;
    PrintStream printStream;

    public PrintStreamExample(String name, int age) throws FileNotFoundException {
        this.age = age;
        this.name = name;
        printStream = new PrintStream("c:\\Files\\log" + count + ".txt");
        printStream.printf("%d. name: %s, age: %d", count++, name, age);
    }

    public static void main(String[] args) throws FileNotFoundException {
        PrintStreamExample user1 = new PrintStreamExample("Nina", 25);
        PrintStreamExample user2 = new PrintStreamExample("Valera", 29);
    }
}
