package pwo;

public class Zadanie1 {

    public static final int FROM = 0, TO = 100;
    public static final String FILE_NAME = "fibseq100.txt";

    public static void main(String[] args) {

        System.out.println("Fibonacci wersja 2");

        boolean ok = SequenceTools.writeToFile(
                new FibonacciGenerator(), FROM, TO, FILE_NAME);
        if (ok) {
            System.out.println("Wynik zapisany do pliku: "
                    + FILE_NAME);
        } else {
            System.out.println("Błąd");
        }

        LucasGenerator lucasGenerator = new LucasGenerator();
        ok = SequenceTools.writeToFile(lucasGenerator, 0, 10, "lucas_sequence.txt");
        if (ok) {
            System.out.println("Wynik zapisany do pliku: lucas_sequence.txt");
        } else {
            System.out.println("Błąd");
        }
    }
}
