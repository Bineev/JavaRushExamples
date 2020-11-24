public class EqualsExample {
    int field1;
    int field2;

    public EqualsExample(int field1, int field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public boolean equals(EqualsExample eq) {
        if (this.field1 == eq.field1 && this.field2 == eq.field2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        // Same object but different links = equals
        Object obj3 = obj1;
        System.out.println(obj3.equals(obj1));
        // String pool
        String a = "Sobaka";
        String b = "Sobaka";
        System.out.println(a.equals(b));
        System.out.println("-----------------------------");
        // method "equals" overrided
        EqualsExample equals1 = new EqualsExample(1, 2);
        EqualsExample equals2 = new EqualsExample(1, 2);
        System.out.println(equals1.equals(equals2));
    }
}




