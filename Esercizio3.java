import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Inserisci una stringa da suddividere in caratteri, :q per interrompere il programma: ");
          String input = scanner.nextLine();

            if (input.equals(":q")) {
                break;
            }

            String[] arrayCaratteri = input.split("");
            String stringaFinale = "";

            for (int i = 0; i < arrayCaratteri.length; i++) {
                stringaFinale += arrayCaratteri[i];
                if (i < arrayCaratteri.length - 1) {
                    stringaFinale += ",";
                }
            }

            System.out.println(stringaFinale);
        }

        scanner.close();
    }
}
