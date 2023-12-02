import java.util.Scanner;
public class Ejercicio_16_WHILE {
    public static void main(String[] args) {
        //16.	Leer un número  y determinar si pertenece a la serie de Fibonacci.
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Ingreso de datos y declaracion de variables
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingrese un numero entero para determinar si pertenece al a serie de Fibonacci");
        int numero =sc.nextInt();
        int n1=1,n2=1,n3=0;
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //EXPLICACION SERIE DE FIBONACCI CON WHILE
        while (numero>n3) {
            n1=n1+n2;
            n2=n1-n2;
            n3=n1+n2;
   
        }
        /*
        1. while (numero > n3): Esta es la condición de control del bucle. 
        Mientras numero sea mayor que n3, el bloque de código dentro del bucle se ejecutará. 
        Si en algún momento la condición numero > n3 deja de ser verdadera, 
        el bucle se detendrá y la ejecución del programa continuará con la siguiente instrucción después del bucle.

        2. n1 = n1 + n2;: En esta línea, se actualiza el valor de n1. 
        Se le asigna el resultado de sumar el valor actual de n1 y n2. 
        Esto sigue la regla de la serie de Fibonacci, donde cada término es la suma de los dos términos anteriores.

        3. n2 = n1 - n2;: En esta línea, se actualiza el valor de n2. 
        Se le asigna el resultado de restar el valor actual de n2 al nuevo valor de n1.
         Esto sirve para actualizar n2 al término anterior que tenía n1.

        4. n3 = n1 + n2;: Aquí, se actualiza el valor de n3. 
        Se le asigna el resultado de sumar el nuevo valor de n1 y n2. 
        Esto actualiza n3 al siguiente término de la serie de Fibonacci. */
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //

        if(numero==1||numero==2){
            System.out.println("Si pertenece");
        }
        else if (numero==n3) {
            System.out.println("si pertenece");
        }

        else{
        System.out.println("No pertenece");
        }




sc.close();

        }
    }

