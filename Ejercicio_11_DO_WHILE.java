import java.util.Scanner;
public class Ejercicio_11_DO_WHILE{
    public static void main (String[]args){
    //11.	Leer un número entero y determinar cuántas veces contiene el dígito 1
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int numero = sc.nextInt();

        int contador=0;

        do{
            int digito = numero%10;
            if (digito==1){
                contador++;
            }
            numero=numero/10;

        }
        while (numero>0);
        
        System.out.println("El numero ingresado contiene "+contador+" numeros uno");
        





sc.close();
}

}