import java.util.Scanner;
public class Ejercicio_3_FOR {
    //3.	Leer 2 números y mostrar todos los enteros comprendidos entre ellos.
    public static void main(String[] args) {
        Scanner entero1 = new Scanner(System.in);
        System.out.println("Ingrese el primer valor");
        int numero1 = entero1.nextInt();

        Scanner entero2 = new Scanner(System.in);
        System.out.println("Ingrese el segundo valor");
        int numero2 = entero2.nextInt();


        if(numero1<numero2){
        for(int contador = numero1 ; contador<=numero2; contador++){
            System.out.println(contador);
        }
        }

        else if(numero1>numero2){
            for(int contador=numero2;contador<=numero1;contador++){
            System.out.println(contador);
            }
        }
        entero1.close();
        entero2.close();



        
    }
}
