public class Ejercicio5 {

    public static boolean esPalindromo(String texto) {
        if (texto == null) {
            return false;
        }

        // 1. Convertir todo a minúsculas
        texto = texto.toLowerCase();

        // 2. Reemplazar vocales con tilde o diéresis por su versión simple
        texto = texto.replace('á', 'a')
                     .replace('é', 'e')
                     .replace('í', 'i')
                     .replace('ó', 'o')
                     .replace('ú', 'u')
                     .replace('ü', 'u');

        int izq = 0;
        int der = texto.length() - 1;

        // 3. Recorrer desde los extremos hacia el centro con un ciclo while
        while (izq < der) {
            char charIzq = texto.charAt(izq);
            char charDer = texto.charAt(der);

            // Si el carácter de la izquierda no es letra ni dígito, se lo salta
            if (!Character.isLetterOrDigit(charIzq)) {
                izq++;
            } 
            // Si el carácter de la derecha no es letra ni dígito, se lo salta
            else if (!Character.isLetterOrDigit(charDer)) {
                der--;
            } 
            // Cuando ambos son letras o números válidos, los compara
            else {
                if (charIzq != charDer) {
                    return false; // No es palíndromo
                }
                izq++;
                der--;
            }
        }

        return true; // Es palíndromo
    }

    public static void main(String[] args) {
        // Pruebas con los ejemplos del documento
        System.out.println(esPalindromo("Anita lava la tina"));        // true
        System.out.println(esPalindromo("¿Acaso hubo búhos acá?"));    // true
        System.out.println(esPalindromo("Java es genial"));           // false
        System.out.println(esPalindromo("Somos"));                    // true
    }
}
