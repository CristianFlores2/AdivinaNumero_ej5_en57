package adivinanumero_ej5_en57;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdivinaNumero_ej5_en57 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int aleatorio=(int)(Math.random()*500)+1,n=0,intento=0;
        System.out.println(aleatorio);
        do{
            try{
                System.out.println("Ingrese numero");
                n=s.nextInt();
                if (n>aleatorio) {
                    System.out.println("El numero es menor al introducido");
                    intento++;
                }else if (n<aleatorio) {
                    System.out.println("El numero es mayor al introducido");
                    intento++;
                }
            }catch(InputMismatchException a){
                System.out.println("Error: caracter ingresado");
                intento++;
                s.nextLine();
            }
            
        }while(aleatorio!=n);
        System.out.println("Numero encontrado");
        System.out.println("Numero de intentos: "+intento);
    }
    
}
