import java.util.Scanner;
public class Ejercicio_2_WHILE {
    public static void main(String[] args) {
    //2.	Leer un número entero positivo y mostrar todos los pares comprendidos entre 1 y el número leído.    
        Scanner sc =new Scanner (System.in);
        System.out.println("Ingrese un numero entero positivo: ");
        int numero = sc.nextInt();
        int contador= 0;

        if(numero>0){
                while (contador<numero) {
                    contador+=2;
                    System.out.println(contador);
                }
        }
        else{
            System.out.println("El numero ingresado no es un valor entero positivo.");
        }



        sc.close();
    }
}
