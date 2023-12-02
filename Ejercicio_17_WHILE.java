public class Ejercicio_17_WHILE {
    public static void main(String[] args) {
        //17.	Determinar a cuánto es igual el promedio entero de los elementos de la serie de Fibonacci entre 0 y 1000.
       

        int n1=1,n2=0,n3=1;
        int contador =0,promedio=0;
        while (980>=n3) {
            n1=n1+n2;
            n2=n1-n2;
            n3=n1;
            promedio=promedio+=n3;
            contador++;
            
        }

        int resultado = promedio/contador;
        System.out.println("El promedio entero de los elermentos de la serie de Fibonacci entre 0 y 1000 es: " + resultado);
    }
}
