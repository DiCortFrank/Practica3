public class Ejercicio6{
public static String eliminarDuplicados(String texto){
if (texto == null){
return "";
}
StringBuilder resultado = new StringBuilder();
for( int i=0; i<texto.length(); i++){
char actual = texto.charAt(i);
if(resultado.indexOf(String.valueOf(actual)) ==-1){
resultado.append(actual);
}
}
return resultado.toString();
}
public static void main(String[]args){

System.out.println(eliminarDuplicados("programacion"));
System.out.println(eliminarDuplicados("mississippi"));
System.out.println(eliminarDuplicados("aabbcc"));
System.out.println(eliminarDuplicados("123123456"));
}
}


