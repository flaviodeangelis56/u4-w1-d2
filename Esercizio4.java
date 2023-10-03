import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Inserisci un numero intero: ");
        int numero = scanner.nextInt();


        if (numero < 0) {
            System.out.println("Il tuo numero è negativo");
        } else {

            for (int i = numero; i >= 0; i--) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
