import java.util.Scanner;
public class Ejercicio_6_DO_WHILE {
    public static void main(String[] args) {
        //6.	Leer un número entero positivo y determinar a cuánto es igual la suma de todos los elementos comprendidos entre 1 y el número leído.
        Scanner entero = new Scanner(System.in);
        System.out.println("Ingrese el valor entero");
        int numero = entero.nextInt();

        if(numero>0){
           int contador=0;
           int suma =0;
        //////////////////////////////////////////////////
            do{
            contador++;
               suma+=contador;
            }
            while (contador<numero);
        //////////////////////////////////////////////////
               

       System.out.println("El total de la suma es: "+suma);
       }

       else{
           System.out.println("El numero no es un entero positivo");
       }

     
       

entero.close();
    }
}
