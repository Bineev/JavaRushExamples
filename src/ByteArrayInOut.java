import java.io.ByteArrayInputStream;

public class ByteArrayInOut {
    public static void main(String[] args) {
        String text = "Hello, World";
        byte[] array = text.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(array);
        byte[] result = new byte[array.length];
        while (bais.available() > 0) {
            result = bais.readAllBytes();
        }
        for (byte b : result) {
            System.out.print((char) b);
        }

    }
}
