import java.util.Random;

public class JavaMultithreading {

    public static void main(String[] args) {

        final int DISTANCIA_TOTAL = 20; // Distancia de la carrera
        Corredor[] corredores = {
                new Corredor("Anderson", DISTANCIA_TOTAL),
                new Corredor("Sergio", DISTANCIA_TOTAL),
                new Corredor("Luis", DISTANCIA_TOTAL)
        };

        Thread[] hilos = new Thread[corredores.length];

        for (int i = 0; i < corredores.length; i++) {
            hilos[i] = new Thread(corredores[i]);
            hilos[i].start();
        }

        for (Thread hilo : hilos) {
            try {
                hilo.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        int distanciaMaxima = 0;
        String ganador = "";
        for (Corredor corredor : corredores) {
            if (corredor.getDistanciaRecorrida() > distanciaMaxima) {
                distanciaMaxima = corredor.getDistanciaRecorrida();
                ganador = corredor.getNombre();
            }
        }
        System.out.println("El ganador es: " + ganador);



    }
}

class Corredor implements  Runnable{
    private String nombre;
    private int distanciaTotal;
    private int distanciaRecorrida;

    public int getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public String getNombre() {
        return nombre;
    }

    public Corredor(String nombre, int distanciaTotal) {
        this.nombre = nombre;
        this.distanciaTotal = distanciaTotal;
        this.distanciaRecorrida = 0;
    }

    @Override
    public void run() {
        Random rand = new Random();
        while (distanciaRecorrida < distanciaTotal) {
            // Avance aleatorio
            int avance = rand.nextInt(11); // Avance entre 0 y 10 metros
            distanciaRecorrida += avance;
            // Mostrar progreso
            System.out.println(nombre + " ha recorrido " + distanciaRecorrida + " metros.");
            try {
                Thread.sleep(100); // Simular tiempo de avance
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(nombre + " ha terminado la carrera!");

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
