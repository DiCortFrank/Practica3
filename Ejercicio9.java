public class Ejercicio9{
public static boolean validar(String expresion){
if (expresion == null){
return false;
}
StringBuilder pila = new StringBuilder();
for (int i=0; i < expresion.length(); i++){
char c = expresion.charAt(i);
if (c == '(' || c =='[' || c == '{'){
pila.append(c);
}
else if ( c == ')' || c == ']' || c == '}'){
if (pila.length() == 0){
return false;
}
char tope = pila.charAt(pila.length() -1);
if (( c == ')' && tope == '(') || (c == ']' && tope == '[') || (c == '}' && tope == '{')){
pila.deleteCharAt(pila.length() -1);
}else{
return false;
}
}
}
return pila.length() == 0;
}
public static void main(String[]args){

System.out.println(validar("{a[(b=c)]}"));
System.out.println(validar("{[()]}"));
System.out.println(validar("a+b"));
System.out.println(validar("([)]"));
System.out.println(validar("((a+b)"));
}
}
