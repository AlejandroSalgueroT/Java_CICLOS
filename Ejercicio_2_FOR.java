import java.util.Scanner;
public class Ejercicio_2_FOR {
    //2.	Leer un número entero positivo y mostrar todos los pares comprendidos entre 1 y el número leído.
    public static void main(String[] args) {

        //Bloque de ingreso de datos
        Scanner entero = new Scanner(System.in);
        System.out.println("Ingrese un valor entero positivo");
        int numero = entero.nextInt();

        //Solucion del problema
        if(numero>0){
            for (int contador = 2; contador <= numero; contador+=2) {
                System.out.println(contador);
            }
        }else{
            System.out.println("El valor ingresado no es un entero positivo");
        }

        entero.close();

    }
}
