import java.util.Scanner;
public class Ejercicio_13_FOR {
    public static void main(String[] args) {
        //13.	Leer números hasta que digiten 0 y determinar a cuánto es igual el promedio entero de los números leídos.
        Scanner sc = new Scanner(System.in);
        sc.close();
        int numero1=1;
        int suma=0;
        int contador=-1;

        for(;numero1!=0;contador++){
            System.out.println("Ingrese un numero entero");
            numero1=sc.nextInt();
            suma+=numero1;
        }
        int promedio=suma/contador;
        System.out.println("El promedio entero de los numeros leidos es: "+promedio);



sc.close();
    }
}
