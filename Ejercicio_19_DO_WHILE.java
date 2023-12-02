import java.util.Scanner;
public class Ejercicio_19_DO_WHILE {
    public static void main(String[] args) {
           //19.	Leer un número y calcular su factorial.
        //El factorial de un número se define como el resultado de multiplicar todos los enteros comprendidos entre 1 y dicho número.
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero=sc.nextInt();
        long resultado=1L   ;
        int resultadosuma=1;
        int contador =  0;
    sc.close();
        do{
            contador++;
            resultado=resultado*=contador;
            resultadosuma=resultadosuma+=resultado;
        }while(contador <numero);
        System.out.println(("El factorial de el numero !")+numero+(" es: ")+resultado);
    }
}
