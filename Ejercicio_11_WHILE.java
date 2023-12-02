import java.util.Scanner;
public class Ejercicio_11_WHILE {
    public static void main(String[] args) {
        //11.	Leer un número entero y determinar cuántas veces contiene el dígito 1
        ////////////////////////////////////////////////////////////////////////////////////////////////////////
        //INGRESO DE DATOS
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero entero");
        int numero = scanner.nextInt();
        ////////////////////////////////////////////////////////////////////////////////////////////////////////
        //DECLARACION DE VARIABLES
        int contador=0,digito=0;
        ////////////////////////////////////////////////////////////////////////////////////////////////////////
        //SOLUCION PROBLEMA
        while(numero>0 ){
            digito=numero%10;
            if(digito==1){
                contador++;
            }
            numero=numero/10;
            System.out.println();
        }
        System.out.println("El digito ingresado contiene "+contador+" el digito 1");
        //EXPLICACION SOLUCION PROBLEMA

        /*
        Declaramos las variables: contador lo que hara es contar cuantos 1 hay en el numero ingresado 
        y digito es donde se guardara el ultimo digito del numero

        Creamos un ciclo while: lo que hara el cilo while es simpre que numero sea mayor que 0 entonces extaemos el ultimo digito del valor ingresado.

        Creamos un if: si el digito que extraemos en el while es igual a 1 entonces en la variabe contador se va a sumar 1 

        Borramos el ultimo digito del numero: Luego de extraerlo y comprobar que no es 1 entonces pasamos al otro digito del numero, para eso
        dividimos en numero entre 10 y lo guardamos en la misma variable para que se el while pueda extraer de nuevo el numero.
         */
        ////////////////////////////////////////////////////////////////////////////////////////////////////////        





        scanner.close();
    }
}
