public class JavaMultithreading {

    public static void main(String[] args) {

    }
}

class Corredor implements  Runnable{
    private String nombre;
    private int distanciaTotal;
    private int distanciaRecorrida;

    public Corredor(String nombre, int distanciaTotal) {
        this.nombre = nombre;
        this.distanciaTotal = distanciaTotal;
        this.distanciaRecorrida = 0;
    }



    @Override
    public void run() {

    }
}


/*


Enunciado del ejercicio:
Escribe un programa en Java que simule una carrera entre varios corredores. Cada corredor será representado por un hilo de ejecución. El programa deberá mostrar el progreso de la carrera en la consola y determinar el ganador.

Requisitos:
Debes crear una clase Corredor que implemente la interfaz Runnable. Cada corredor tendrá un nombre y una velocidad de carrera aleatoria.
Los corredores deben avanzar de forma aleatoria en cada iteración de la carrera.
El progreso de la carrera debe mostrarse en la consola. Puedes utilizar barras de progreso o simplemente imprimir mensajes indicando la posición de cada corredor en cada iteración.
El primer corredor que alcance una distancia determinada (por ejemplo, 100 metros) será declarado como el ganador.
El programa debe imprimir el nombre del corredor ganador al finalizar la carrera.

 */
