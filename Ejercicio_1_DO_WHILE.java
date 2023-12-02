import java.util.Scanner;
public class Ejercicio_1_DO_WHILE {
    public static void main(String[] args) {
        //1.	Leer un número positivo entero y mostrar todos los enteros comprendidos entre 1 y el número leído.

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un valor entero positivo: ");
        int numero = sc.nextInt();
        int contador=0;

        if(numero>0){
            do {
                contador++;
                System.out.println(contador);
            }while (contador<numero) ;
        }
        else{
            System.out.println("El valor ingresado no es un entero poritivo.");
        }
        


        sc.close();

        
    }
}
