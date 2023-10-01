import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int risultato = 0 , val1 , val2;
        String op;
        System.out.println("Inserisci primo numero");
        Scanner scanner= new Scanner(System.in);
        Scanner scanner2= new Scanner(System.in);
        val1= scanner.nextInt();
        System.out.println("Inserisci secondo numero");
        val2 = scanner.nextInt();
        System.out.println("Inserisci operatore matematico ('+' '-' 'x' '/')");
        op= scanner2.nextLine();

        Calcolatrice c= new Calcolatrice();
        risultato= c.Calcola(val1,val2,op);

        System.out.println("Il risultato è " + risultato);
    }
}