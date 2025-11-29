package Lektion8;

public class Einfacher_Rechner {
    public static void main(String[] args){
        if (args.length < 2){
            System.out.println("Bitte mindestens 2 Argumente eingeben!");
            return;
        }
        String operator = args[args.length -1];
        int ergebnis = Integer.parseInt(args[0]);
        switch (operator){
            case "+":
                for (int i = 1; i < args.length-1; i++){
                    ergebnis += Integer.parseInt(args[i]);
                }
                break;
            case "-":
                for (int i = 1; i < args.length-1; i++){
                    ergebnis -= Integer.parseInt(args[i]);
                }
                break;
            default:
                System.out.println("ungültiger Operator");
                return;
        }
        System.out.println("Ergebnis: " + ergebnis);
    }
}
