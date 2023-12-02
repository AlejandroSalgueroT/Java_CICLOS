import java.util.Scanner;
public class Ejercicio_12_FOR {
    public static void main(String[] args) {
        //12.	Lee 2 números enteros y determinar cuál de los 2 tiene mayor cantidad de dígitos primos.
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el primer valor: ");
        int numero1=sc.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        int numero2 = sc.nextInt();
int contador1=0,contador2=0;
sc.close();
if(numero1<0){numero1=numero1*-1;}
if(numero2<0){numero2=numero2*-1;}


        for(;numero1>0;){
            int digito1=numero1%10;
            numero1=numero1/10;
            

            if (digito1==2||digito1==3||digito1==5||digito1==7) {
                contador1++;
            }
        }
        for(;numero2>0;){
            int digito1=numero2%10;
            numero2=numero2/10;
            

            if (digito1==2||digito1==3||digito1==5||digito1==7) {
                contador2++;
            }
        }

if(contador1==0&&contador2==0){
    System.out.println("Los numeros no tienen numeros primos");
}
    else if(contador1==contador2){
        System.out.println("Ambos numeros tienen la misma cantidad de numeros primos");
    }
    else if(contador1>contador2){
        System.out.println("El primer numero tiene mayor cantidad de digitos primos que el segundo numero ");
    }
    else{
        System.out.println("El segundo numero  tiene mayor cantidad de digitos primos que el primer numero ");
    }



    }
}

