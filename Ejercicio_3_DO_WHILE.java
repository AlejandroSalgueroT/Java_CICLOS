import java.util.Scanner;
public class Ejercicio_3_DO_WHILE {
    public static void main(String[] args) {
        //3.	Leer 2 números y mostrar todos los enteros comprendidos entre ellos.
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingrese el primer valor entero: ");
        int numero1 = sc.nextInt();
        System.out.println("Ingrese el segundo valor entero: ");
        int numero2 = sc.nextInt();

        if (numero1<numero2){
            do {
                numero1++;
                System.out.println(numero1);
                } while (numero1<numero2);
        }
        else{
            do {
                numero2++;
                System.out.println(numero2);
                } while (numero2<numero1);
        }

    sc.close();
    }
}
