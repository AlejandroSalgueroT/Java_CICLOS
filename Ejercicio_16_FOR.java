import java.util.Scanner;

public class Ejercicio_16_FOR {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingrese un numero entero para determinar si pertenece al a serie de Fibonacci");
        int numero =sc.nextInt();
        int n1=1,n2=1,n3=0;

        sc.close();



        for(;numero>n3;) {
            n1=n1+n2;
            n2=n1-n2;
            n3=n1+n2;
        }
            if(numero==1||numero==2){
                System.out.println("Si pertenece");
            }
            else if (numero==n3) {
                System.out.println("si pertenece");
            }
    
            else{
            System.out.println("No pertenece");
            }
        
    
    
    
    sc.close();
        }
    }

