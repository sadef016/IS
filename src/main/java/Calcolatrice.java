public class Calcolatrice {

    public int Calcola (int val1, int val2, String op ){
        int risultato=0;
        if (op.equals("+")){
            risultato= val1 + val2;
        }else if (op.equals("-")) {
            risultato= val1 - val2;
        }else if(op.equals("x")){
            risultato= val1 * val2;
        } else if (op.equals("/")){
            risultato= val1/val2;
        } else if (op.equals("%")){
            risultato= val1%val2;
        }else {
            System.out.println("Operatore matematico non valido");
        }
        return risultato;
    }
}