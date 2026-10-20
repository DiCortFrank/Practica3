public class Ejercicio4 {

    public static String comprimir(String texto) {
        if (texto == null || texto.isEmpty()) {
            return "";
        }

        StringBuilder resultado = new StringBuilder();
        int contador = 1;

        for (int i = 0; i < texto.length(); i++) {
            // Verifica si el siguiente carácter es igual al actual
            if (i + 1 < texto.length() && texto.charAt(i) == texto.charAt(i + 1)) {
                contador++;
            } else {
                // Cuando cambia el carácter o se llega al final del texto
                resultado.append(texto.charAt(i)).append(contador);
                contador = 1; // Reinicia el contador para el siguiente carácter
            }
        }

        return resultado.toString();
    }

    public static void main(String[] args) {
        // Pruebas con los ejemplos del documento
        System.out.println(comprimir("aaabbcaaaa")); // Salida esperada: a3b2c1a4
        System.out.println(comprimir("xxxxyzz"));      // Salida esperada: x4y1z2
        System.out.println(comprimir("abcd"));         // Salida esperada: a1b1c1d1
    }
}
