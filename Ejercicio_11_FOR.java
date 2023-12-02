import java.util.Scanner;

public class Ejercicio_11_FOR {
    
    public static void main(String[] args) {
        //11.	Leer un número entero y determinar cuántas veces contiene el dígito 1
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Ingrese un valor entero; ");
        int numero = sc.nextInt();
        int contador=0;
        for(;numero>0;){
            int digito=numero%10;
            
            numero=numero/10;

            if(digito==1){
                contador++;
            }
sc.close();
        }
        
        System.out.println("El numero contiene "+contador+" numeros uno");



}

    
}