public class FizzBuzz {
    public static void main(String[] args) {
        number();
    }

    private static void number() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}

//Descripción: Imprimir números del 1 al 100. 
//Para múltiplos de 3, imprimir "Fizz"; para múltiplos de 5, imprimir "Buzz"; para múltiplos de ambos, imprimir "FizzBuzz".
//Propósito: Evaluar el conocimiento básico de bucles y condiciones.