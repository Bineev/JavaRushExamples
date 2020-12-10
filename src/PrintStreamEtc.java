import java.io.*;

public class PrintStreamEtc {
    public static void main(String[] args) throws IOException {
        String toPrint = "Hello, World!";
        PrintStream ps = new PrintStream(new File("c:\\test\\1.txt"));
        ps.println(toPrint);

        InputStream defaultIn = System.in;
        ByteArrayInputStream input = new ByteArrayInputStream(toPrint.getBytes());
        System.setIn(input);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = reader.readLine()) != null) {
            System.out.println(s);
        }
    }
}
