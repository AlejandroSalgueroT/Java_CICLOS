import java.util.Scanner;
public class Ejercicio_14_FOR {
    public static void main(String[] args) {

         /*14.	Leer 2 números enteros y determinar a cuánto es igual el producto mutuo del primer dígito de cada uno. */
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int numero1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numero2 = sc.nextInt();
        sc.close();

        for(;numero1>9;){
            numero1=numero1/10;
        }
        for(;numero2>9;){
            numero2=numero2/10;
        }

        System.out.println(numero1);
        System.out.println(numero2);

        int resultado=numero1*numero2;
        System.out.println("el producto mutuo del primer dígito de cada uno es :"+resultado);


        
    }
}
