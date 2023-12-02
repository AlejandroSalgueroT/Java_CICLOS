import java.util.Scanner;
public class Ejercicio_14_WHILE {
    public static void main(String[] args) {
        /*14.	Leer 2 números enteros y determinar a cuánto es igual el producto mutuo del primer dígito de cada uno. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer valor");
        int numero =sc.nextInt();

        System.out.println("Ingrese el segundo valor");
        int numero2 = sc.nextInt();


            if (numero<0){
            numero=numero*-1;
            }if (numero2<0){
            numero2=numero2*-1;
            }


            while (numero>9) {
            numero= numero/10;
            }
            while (numero2>9) {
            numero2= numero2/10;
            }

            int resultado = numero*numero2;
            System.out.println("El producto mutuo del primer digito de cada numero es: "+resultado);



sc.close();
    }
}
