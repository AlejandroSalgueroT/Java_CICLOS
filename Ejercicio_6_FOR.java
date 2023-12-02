import java.util.Scanner;
public class Ejercicio_6_FOR {
    //6.	Leer un número entero positivo y determinar a cuánto es igual la suma de todos los elementos comprendidos entre 1 y el número leído.
    public static void main(String[] args) {

        Scanner entero = new Scanner(System.in);
        System.out.println("Ingrese el valor entero");
        int numero = entero.nextInt();

        if(numero>0){
            int contador=0;
            int suma =0;
           for(contador=1;contador<=numero;contador++){
            
            suma+=contador;
            
           }
            System.out.println("El total de la suma es: "+suma);
           }

        else{
            System.out.println("El numero no es un entero positivo");
        }

      
        

entero.close();

        
    }
}
