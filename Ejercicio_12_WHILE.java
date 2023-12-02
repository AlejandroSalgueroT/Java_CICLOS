import java.util.Scanner;
public class Ejercicio_12_WHILE {
    public static void main(String[] args) {
        //12.	Lee 2 números enteros y determinar cuál de los 2 tiene mayor cantidad de dígitos primos.

        /////////////////////////////////////////////////////////////////////////////////////////////

        /*Ingreso de datos */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el primer valor");
        int numero1 = scanner.nextInt();
        System.out.println("Ingresa el segundo valor");
        int numero2 = scanner.nextInt();

        /////////////////////////////////////////////////////////////////////////////////////////////

        /*Declaracion de variables */
        int contadornum1=0,contadornum2=0;

        /////////////////////////////////////////////////////////////////////////////////////////////

        /*Solucion del problema */

        /*Creamos un ciclo while que lo que hara es extraer el ultimo digito del numero, comprobar si es primo, si es primo suma 1 valor a contador
         * luego divide entre 10 para eliminar el digito comprobado y pasar al siguiente.
         * Hacemos el ciclo para ambos valores ingresados
         */
        while (numero1>0) {
            int digito=numero1%10;
            if (digito == 2 || digito == 3 || digito == 5 || digito == 7) {
                contadornum1++;
            }
            numero1=numero1/10;
        }
        while (numero2>0) {
            int digito=numero2%10;
            if (digito == 2 || digito == 3 || digito == 5 || digito == 7) {
                contadornum2++;
            }
            numero2=numero2/10;
        }

        /*Ya que tengamos alojado en la variable contador cuantos numeros primos tiene cada numero pues comprobamos cual es el mayor
         * y mostramos en pantalla el mensaje
         */

        if (contadornum1==0&&contadornum2==0) {
            System.out.println("Los valores ingresados no tienen numeros primos");
        }
        else if(contadornum1>contadornum2){
            System.out.println("El primer valor ingresado tiene mayor cantidad de numeros primos ("+contadornum1+") en total");
        }
        else{
            System.out.println("El segundo valor ingresado tiene mayor cantidad de numeros primos ("+contadornum2+") en total");
        }








    scanner.close();
}
}