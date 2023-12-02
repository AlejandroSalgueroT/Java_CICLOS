public class Ejercicio_5_DO_WHILE {
    public static void main(String[] args) {
        //5.	Mostrar en pantalla todos los pares comprendidos entre 20 y 200.
        int numero=200,contador=20;

        do {
            contador+=2;
            System.out.println(contador);
        } while (contador<numero);



    }
}
