public class Ejercicio11{
public static void main(String[] args){
int[] numeros= {8,3,10,5,4};
int suma=0;
int promedio = 0;
for(int i=0; i< numeros.length; i++){
suma = suma + numeros[i];
}
System.out.println(" "+ suma);
promedio = suma/numeros.length;
System.out.println("Promedio" + promedio);
}
}

