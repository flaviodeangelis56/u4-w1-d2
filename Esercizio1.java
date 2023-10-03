import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("inserici una stringa per verificare se la lunghezza è pari o dispari : ");
        String inputPariDispari = input.nextLine();
        System.out.println("Se esce true la tua stringa è pari se false è dispari : " + stringaPariDispari(inputPariDispari) );

        System.out.println("inserici una anno per verificare che sia un anno bisestile : ");
        int inputAnno = Integer.parseInt(input.nextLine());
        System.out.println("Se esce true è bisestile se false no : " + annoBisestile(inputAnno));
        input.close();
    }

    public static boolean  stringaPariDispari (String str) {
        if (str.length() % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

    public static boolean annoBisestile (int anno) {
        if(anno % 4 == 0) {
            return true;
        } if (anno % 100 == 0 && anno % 400 == 0) {
            return true;
        }else {
            return false;
        }
    }
}
