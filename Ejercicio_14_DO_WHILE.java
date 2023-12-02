import java.util.Scanner;
public class Ejercicio_14_DO_WHILE {
    public static void main(String[] args) {
        /*14.	Leer 2 números enteros y determinar a cuánto es igual el producto mutuo del primer dígito de cada uno. */
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int numero1=sc.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        int numero2=sc.nextInt();

        while (numero1>9) {
            numero1=numero1/10;
        }
        while (numero2>9) {
            numero2=numero2/10;
        }
        int producto=numero1*numero2;
        System.out.println("El producto mutuo del primer dígito de cada uno: "+producto);
sc.close();
    }
}
