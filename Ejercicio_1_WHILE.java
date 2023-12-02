import java.util.Scanner;
public class Ejercicio_1_WHILE {
    public static void main(String[] args) {
        //1.	Leer un número positivo entero y mostrar todos los enteros comprendidos entre 1 y el número leído.
        Scanner sc =new Scanner (System.in);
        System.out.println("Ingrese un numero entero positivo: ");
        int numero = sc.nextInt();
        int contador=0;
        
        if (numero>0) {
             while (contador<numero) {
            contador++;
            System.out.println(contador);

        }
        }else{
            System.out.println("El numero ingresado no es un valor entero positivo");
        }
       
        sc.close();



    }
}
