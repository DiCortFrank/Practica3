public class Ejercicio5 {

    public static boolean esPalindromo(String texto) {
        if (texto == null) {
            return false;
        }

        texto = texto.toLowerCase();

        texto = texto.replace('á', 'a')
                     .replace('é', 'e')
                     .replace('í', 'i')
                     .replace('ó', 'o')
                     .replace('ú', 'u')
                     .replace('ü', 'u');

        int izq = 0;
        int der = texto.length() - 1;


        while (izq < der) {
            char charIzq = texto.charAt(izq);
            char charDer = texto.charAt(der);


            if (!Character.isLetterOrDigit(charIzq)) {
                izq++;
            }
            else if (!Character.isLetterOrDigit(charDer)) {
                der--;
         }
            else {
                if (charIzq != charDer) {
                    return false;
                }
                izq++;
                der--;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(esPalindromo("Anita lava la tina"));        // true
        System.out.println(esPalindromo("¿Acaso hubo búhos acá?"));    // true
        System.out.println(esPalindromo("Java es genial"));           // false
        System.out.println(esPalindromo("Somos"));                    // true
    }
}
