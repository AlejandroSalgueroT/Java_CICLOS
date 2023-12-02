import java.util.Scanner;
public class Ejercicio_13_WHILE {
    public static void main(String[] args) {
        //13.	Leer números hasta que digiten 0 y determinar a cuánto es igual el promedio entero de los números leídos.
        Scanner sc= new Scanner(System.in);
        int numero=1;
        int contador=-1;
        int suma=0;

        while (numero!=0) {
            System.out.println("Ingrese un valor entero");
            numero=sc.nextInt();
            contador++;
            suma+=numero;

        }

        int promedio=suma/contador;
        System.out.println("El promedio entero de los numeros leidos es: "+promedio);
        

sc.close();
    }
}
