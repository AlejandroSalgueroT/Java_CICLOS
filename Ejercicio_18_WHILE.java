public class Ejercicio_18_WHILE {
    public static void main(String[] args) {
        //18.	Determinar cuántos elementos de la serie de Fibonacci se encuentra entre 1000 y 2000.

        int n1=1,n2=0,n3=1;
        int contador =0;

        while (10000>=n3) {
            n1=n1+n2;
            n2=n1-n2;
            n3=n1;
            
        if(n1>1000&&n1<2000){
            contador++;}
        }
        System.out.println("Se encuentran ("+contador+") elementos en la serie de Fibonnaci entre 1000 y 2000");




    }
}
