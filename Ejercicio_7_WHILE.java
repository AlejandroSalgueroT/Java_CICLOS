public class Ejercicio_7_WHILE {
    public static void main(String[] args) {
         //7.	Escribir en pantalla el resultado de sumar los primeros 20 múltiplos de 3.
         int suma=0,contador=0;
         while (contador<20) {
            contador++;
            int mult=contador*3;
            suma+=mult;
         }

         System.out.println("El resultado de sumar los primeros 20 múltiplos de 3 es: "+suma);
     }
    }

