import java.util.Scanner;
public class Ejercicio_15_WHILE {
    public static void main(String[] args) {
        //15.	Mostrar en pantalla la tabla de multiplicar del número 5.
        Scanner sc =new Scanner(System.in);
        System.out.println("Indique hasta donde quiere generar la tabla de multiplicar");
        int numero=sc.nextInt();

        int contador=0;

        while (numero>contador) {
            contador++;
            int mult=contador*5;
            System.out.println(contador+"*5= "+mult);
        }



sc.close();















    }
}
