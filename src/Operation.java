import java.util.Scanner;
public class Operation {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner (System.in);
        int num1 = 0, num2 = 0, result = 0, parametro = 0;

        System.out.println("Calcolatore delle operazioni basiche");
        System.out.println("Inserisca il primo numero:");
        num1 = in.nextInt ();
        System.out.println("Inserisca il secondo numero");
        num2 = in.nextInt();
        System.out.println("Scelga un opzione per eseguire una delle seguenti operazioni");
        System.out.println("1 per addizione");
        System.out.println("2 per sottrazione");
        System.out.println("3 per moltiplicazione");
        System.out.println("4 per divisione");
        parametro = in.nextInt();

        switch (parametro) {
             case 1: result = num1 + num2;
              System.out.println("El resultado de la suma es: " + result);
                break;
        
             case 2: result = num1 - num2;
              System.out.println("El resultado de la resta es: " + result);
                break;
            
             case 3: result = num1 * num2;
             System.out.println("El resultado de la multiplicacion es: " + result);
               break;

             case 4: result = num1 / num2;
             System.out.println("El resultado de la divison es: " + result);
               break;
            
             default: 
             System.out.println("La opcion no existe");
                break;
        }
    }
    }
