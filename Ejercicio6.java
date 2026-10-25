public class Ejercicio6{
public static String eliminarDuplicados(String texto){
if (texto == null){
return"";
}
StringBuilder resultado = new StringBuilder(){
for( int i=0; i<texto.legth(); i++){
char actual= texto.charAt(i);


