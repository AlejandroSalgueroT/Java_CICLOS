import java.util.Scanner;
public class Ejercicio_10_WHILE {
    public static void main(String[] args) {
        //10.	Leer un número entero y determinar cuántos dígitos tiene
        Scanner sc= new Scanner (System.in);
        System.out.println("Ingrese un numero entero: ");
        int numero = sc.nextInt();
        int digitos=1;
        int contador=10;


        if(numero<0){
            numero=numero*-1;
        }


        while (numero>=contador) {
            contador*=10;
            digitos=digitos+1;
        }
        System.out.println("El numero tiene "+ digitos +" digitos");

        sc.close();
    }
}
