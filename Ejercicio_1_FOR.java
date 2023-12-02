import java.util.Scanner;
public class Ejercicio_1_FOR {
    public static void main(String[] args) {
    //1.	Leer un número positivo entero y mostrar todos los enteros comprendidos entre 1 y el número leído.

        
    
    
        //Importamos Scanner para ingresar el valor por consola
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese un valor entero positivo");
        int entero= numero.nextInt();

        //Verificamos que el numero ingresado sea un entero positivo
        if (entero>0){
        
        //Iniciamos el ciclo, inicializamos la variable contador en 1, 
        //creamos la condicion que el ciclo se tiene que correr mientras contador sea menor igual a entero, y cada recorrido del ciclo va sumando 1

        for (int contador = 1; contador <= entero; contador+=1) {
                
                System.out.println(contador);
            }

        //si el valor no es un entero positivo mostramos en pantalla
        }else{
            System.out.println("El valor ingresado no es un entero positivo");
        }

        numero.close();







    }
}
