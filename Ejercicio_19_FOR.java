import java.util.Scanner;
public class Ejercicio_19_FOR {
    public static void main(String[] args) {
        //19.	Leer un número y calcular su factorial.
        //El factorial de un número se define como el resultado de multiplicar todos los enteros comprendidos entre 1 y dicho número.
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingrese un valor para calcular su factorial ");
        int numero =sc.nextInt();

        long resultado=1L   ;
        int resultadosuma=0;
        for (int contador =  1; contador <= numero; contador++) {
                resultado=resultado*=contador;
                resultadosuma=resultadosuma+=resultado;
            
        }
        System.out.println(("El factorial de el numero !")+numero+(" es: ")+resultado);
        




        sc.close();
    }
}
