import java.util.Scanner;
public class Ejercicio_4_FOR {
    public static void main(String[] args) {
        //4.	Leer un número entero de 3 dígitos y mostrar todos los enteros comprendidos entre 1 y cada uno de los dígitos
        
        
        Scanner entero = new Scanner(System.in);
        System.out.println("Ingrese el valor entero");
        int numero = entero.nextInt();

        if (numero<0){numero=numero*-1;}

        if(numero>=99&&numero<=999){
            int digito1 = numero /100;
            int digito2 = (numero/10)%10;
            int digito3 = numero %10;

            System.out.print("Primer digito ("+ digito1+"): ");
            for(int contador=1;contador<=digito1;contador++){
                System.out.print(contador+(","));
            }
            System.out.println("\n");

            System.out.print("Segundo digito ("+ digito2+"): ");
            for(int contador=1;contador<=digito2;contador++){
                System.out.print(contador+(","));
            }
            System.out.println("\n");

            System.out.print("Tercer digito ("+ digito3+"): ");
            for(int contador=1;contador<=digito3;contador++){
                System.out.print(contador+(","));
            }









        }else{
            System.out.println("El numero no es de tres cifras");
        }
        entero.close();

    }
}
