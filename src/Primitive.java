public class Primitive {
    public static void main(String[] args) {
        char c = 5987;
        System.out.println(c);
        char a = 'a';
        System.out.println(a);
        int a1 = (char) a;
        System.out.println(a1);
        System.out.println(a + 1);

        //String immutable
        String str1 = "sobaka";
        String str2 = str1;
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        str1 = "koshka";
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str1);
        System.out.println(str2);

    }
}
