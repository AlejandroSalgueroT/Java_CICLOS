import java.util.Scanner;
public class Ejercicio_10_FOR {
    public static void main(String[] args) {
        //10.	Leer un número entero y determinar cuántos dígitos tiene
        ////////////////////////////////////////////////////////////////////////////////////////////////////////
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int numero = scanner.nextInt();
        ////////////////////////////////////////////////////////////////////////////////////////////////////////
        //SI EL NUMERO ES NEGATIVO CONVIERTE A POSITIVO
        if(numero<0){
            numero=numero*-1;
        }
        ///////////////////////////////////////////////////////////////////////////////////////////////////////
        //SOLUCION PROBLEMA:
        int digitos=1;
        for(int contador=10;numero>=contador;contador*=10){
            digitos=digitos+1;
        }
        System.out.println("El numero tiene "+ digitos +" cifra");


        /*Descripcion de la solucion:
        Se utiliza un bucle for para contar los dígitos del número.
        El bucle comienza con un contador igual a 10.
        En cada iteración, el contador se multiplica por 10. Si el número es mayor o igual que el contador, 
        significa que tiene al menos un dígito adicional. En cada iteración, se incrementa la variable digitos en 1.
    
       ///////////////////////////////////////////////////////////////////////////////////////////////////////
       */

        


scanner.close();












    }
}
