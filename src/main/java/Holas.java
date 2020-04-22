import java.util.Scanner;
public class Holas {
    public static void main(String[] args) {
        boolean creciente=false, decreciente=false;
        Scanner sc = new Scanner (System.in);
        System.out.println("Arreglo numerico Creciente, Decreciente, Desordenado o Identico.\n");
        System.out.println("¿Cuantos numeros quieres usar?");
        int cant=sc.nextInt();
        
        int [] numeros = new int [cant];
        
        System.out.println("Guardando datos");
        for(int i=0; i<numeros.length; i++){
            System.out.print("Numero: ");
            numeros[i]=sc.nextInt();
        }
        //Condicionamos el Arreglo
        for(int i=0; i<numeros.length-1; i++){
            if(numeros[i] < numeros[i+1]){
                creciente=true;
            }
            if(numeros[i] > numeros[i+1]){
                decreciente=true;
            }
        }
        //Probabilidades del Arreglo
        if(creciente==true && decreciente==false){
            System.out.println("El arreglo es Creciente.");
        }
        if(creciente==false && decreciente==true){
            System.out.println("El arreglo es Decreciente.");
        }
        if(creciente==true && decreciente==true){
            System.out.println("El arreglo esta Desordenado.");
        }
        if(creciente==false && decreciente==false){
            System.out.println("El arreglo es Identico.");
        }
        //Mostrar todo el Arreglo
        System.out.println("El Arreglo es: ");
        for(int i=0; i<numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }
}