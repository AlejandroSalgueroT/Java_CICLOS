import java.util.Scanner;
public class Ejercicio_13_DO_WHILE {
    public static void main(String[] args) {
        //////////////////////////////////////////////////////////////////////////////////////
        /*CREAMOS OBJETO SCANNER */
        Scanner sc= new Scanner(System.in);

        //////////////////////////////////////////////////////////////////////////////////////
        /*DECLARAMOS VARIABLES */
        int numero=0;
        int digito=0;
        int contador=0;

        //////////////////////////////////////////////////////////////////////////////////////
        /*INICIAMOS EL CICLO DO-WHILE
         * Lo que hara este ciclo es leer datos indefinidamente hasta que el ususario ingrese el numero 0
         * para ello dentro del DO mostramos en pantalla el mensaje de ingresar valor
         * guardamos el valor en la variable numero y comprobamos si es 0 o un numero negativo
         * si no es 0 ni un numero negativo sumamos el valor que ingreso el usuario con la variable digito
         * y le sumamos 1 a la variable contador porque ya el ciclo se ejecuto una vez correctamente o sea ya se ingreso el primer dato
         * El ciclo se mantendra mientras el numero que ingrese el usuario sea diferente de 0
         */
        do {
            System.out.println("Ingrese el valor");
            numero = sc.nextInt();

            if (numero<=0) {
                System.out.println("El valor ingresado es igual o menor que 0");
            }
                else{
                    digito+=numero;
                    contador++;
            }

        } while (numero!=0);

        //////////////////////////////////////////////////////////////////////////////////////
        /*PROMEDIO
         * En el ciclo do while sumamos cada dato que se ingresaba y se contaba el numero de datos ingresados.
         * Con la suma y el numero de datos sacamos el promedio con la siguiente operacion:
         */

        float resultado= digito/contador;
    
        //////////////////////////////////////////////////////////////////////////////////////
        //RESULTADO
        System.out.println("El promedio entero de los numeros leidos es: "+ resultado);

        



    sc.close();
    }
}
