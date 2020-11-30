public class Exceptions {
    public static class RussianRapException extends Exception {
        public RussianRapException(String e) {
            super(e);
        }
    }

    public static void listenMorgenshtern(int age) throws RussianRapException {
        if (age < 14) {
            System.out.println("Tryyyaaaaa");
        } else {
            throw new RussianRapException("Sorry, but you are too old to listen Morgenshtern :(");
        }
    }

    public static void main(String[] args) {
        try {
            listenMorgenshtern(20);
        } catch (RussianRapException e) {
            System.out.println(e.getMessage());
        }
    }

}



