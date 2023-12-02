import java.util.Scanner;
public class Ejercicio_15_FOR{
    public static void main(String[] args) {
        //15.	Mostrar en pantalla la tabla de multiplicar del número 5.


    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese hasta que digito desea que se genere la tabla de multiplicar ");
    int numero = sc.nextInt();
    int multiplicacion =   5;

    if (numero<0) {
        System.out.println("Procura ingresar un valor entero positivo.");
        numero=numero*-1;
    }


    for(int contador=0;contador<=numero;contador++){  
    int resultado= multiplicacion*contador;
    System.out.println(multiplicacion+(" * ")+contador+(" = ")+resultado);
    }



        sc.close();
    }
}
