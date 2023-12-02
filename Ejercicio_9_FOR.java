import java.util.Scanner;
public class Ejercicio_9_FOR {
    public static void main(String[] args) {
        //9.	Promediar los x primeros múltiplos de 2 
        //y determinar si ese promedio es mayor que los primeros múltiplos de 5 para valores de x y y leídos

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//INGRESO DE DATOS
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de multiplos de 2 que desee promediar ");
        int numero = scanner.nextInt();

        System.out.println("Ingrese el numero de multiplos de 5 que desee promediar ");
        int numero1 = scanner.nextInt();
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//DECLARACION DE VARIABLES
    int suma2=0,suma5=0;
    int numero2=numero*2;
    int numero5=numero1*5;
    int promedio2=0,promedio5=0;
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//SOLUCION DEL PROBLEMA:    

    //PROMEDIO X PRIMEROS MULTIPLOS DE 2
       for(int contador=0;contador<=numero2;contador+=2){
           suma2+=contador;
           
       }
       promedio2=suma2/numero; 
       System.out.println("Promedio de los "+numero+" primeros multiplos de 2 : "+promedio2);

    //PROMEDIO X PRIMEROS MULTIPLOS DE 5

       for(int contador=0;contador<=numero5;contador+=5){
           suma5+=contador;   
           
       }
       promedio5=suma5/numero1;
       System.out.println("Promedio de los "+numero1+" primeros multiplos de 5 : " +promedio5);

    //CUAL PROMEDIO ES MAYOR 

       if(promedio2>promedio5){
        System.out.println("El promedio de los " +numero+ " primeros multiplos de 2 es MAYOR que el promedio de los "+numero1+" primeros multiplos de 5 ingresados");
       }else{
        System.out.println("El promedio de los " +numero+ " primeros multiplos de 2 es MENOR que el promedio de los "+numero1+" primeros multiplos de 5 ingresados");
       }

/*DESCRIPCION DEL PROBLEMA:
Cálculo de los Múltiplos y Promedios:
Se calculan los múltiplos de 2 y 5 utilizando bucles for. La suma de estos múltiplos se acumula en las variables suma2 y suma5.
Los promedios se calculan dividiendo la suma por el número de múltiplos.

Comparación de Promedios: 
Se compara el promedio de los múltiplos de 2 (promedio2) con el promedio de los múltiplos de 5 (promedio5).
Se imprime un mensaje indicando cuál de los dos promedios es mayor.


 



///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
CIERRE DE OBJETOS*/
        scanner.close();
      
    }
}
