import java.util.Scanner;
public class Ejercicio_4_DO_WHILE {
    public static void main(String[] args) {
        //4.	Leer un número entero de 3 dígitos y mostrar todos los enteros comprendidos entre 1 y cada uno de los dígitos
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese un valor entero de 3 digitos: ");
        int numero = sc.nextInt();

        if (numero<0){numero=numero*-1;}

        if (numero>99&&numero<999){

            int digito1=numero/100;
            int digito2=(numero/10)%10;
            int digito3=numero%10;
            int contador1=0,contador2=0,contador3=0;

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.print("Primer digito ("+ digito1+"): ");
            do {
                contador1++;
                System.out.print(contador1+(","));
            } while (contador1<digito1);

            System.out.println("\n");
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.print("Segundo digito ("+ digito2+"): ");
            do {
                contador2++;
                System.out.print(contador2+(","));
            } while (contador2<digito2);

            System.out.println("\n");
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.print("Tercer digito ("+ digito2+"): ");
            do {
                contador3++;
                System.out.print(contador3+(","));
            } while (contador3<digito3);

            System.out.println("\n");
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        }
        else{
            System.out.println("El numero no es de 3 cifras.");
        }
        sc.close();
    }
}
