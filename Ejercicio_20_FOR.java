import java.util.Scanner;
public class Ejercicio_20_FOR {
    public static void main(String[] args) {
        //20.	Leer un número entero y calcular a cuánto es igual
        // la sumatoria de todos los factoriales de los números comprendidos entre 1 y el número leído
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingrese un valor para calcular su factorial ");
        int numero =sc.nextInt();

        long resultado=1L   ;
        int resultadosuma=0;
        int resultadofac;

        for (int contador = 1; contador <= numero; contador++) {
            resultadofac = 1;
            for (int factorial = 1; factorial <= contador; factorial++) {
                resultadofac *= factorial;
            }
            System.out.println("El factorial de " + contador + " es: " + resultadofac);
        }

        
        for (int contador =  1; contador <= numero; contador++) {
                resultado=resultado*=contador;
                resultadosuma=resultadosuma+=resultado;
            
        }
        
        System.out.println("El resultado de la suma de los factoriales de los numeros comprendidos entre 1 y el numero leido es: ("+resultadosuma+")");




        sc.close();
    }
}

