import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("inserici un numero da 0 a 3 per stamparlo in lettere : ");
        int inputNumero = Integer.parseInt(input.nextLine());
        System.out.println(stampaNumeri(inputNumero));
        input.close();
    }

    public static String stampaNumeri (int n) {
        switch (n) {
            case 0 : {
                return "zero";
            }
            case 1 : {
                return "uno";
            }
            case 2 : {
                return "due";

            }
            case 3 : {
                return "tre";

            }
            default:
                return "il tuo numero non è compreso tra 0 e 3";

        }

    }
}
