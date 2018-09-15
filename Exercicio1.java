
package exercicio1;

import java.util.Scanner;
public class Exercicio1 {

    
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        double saldo=0;
        boolean sair= false;
        double metodo;
        Exercicio1 J= new Exercicio1();
        while(sair==false){
            J.menu();
            int dd= W.nextInt();
            switch(dd){
                case 1:
                    
                    break;
                case 2:
                  metodo = J.sacar(saldo);
                  break;
                case 3:
                    metodo = J.depo
            }
            
        }
        
    }
    public void menu(){
        System.out.println("1- Ver saldo");
        System.out.println("2- Sacar");
        System.out.println("3- Depositar");
        System.out.println("4- Sair");
       
    }
    public double  sacar(double saldo){
        Scanner b = new Scanner(System.in);
        System.out.println("Qual valor deseja sacar");
        double iti = b.nextDouble();
        saldo = saldo - iti;
        return saldo;
    }
    public void depositar(double saldo){
        Scanner c = new Scanner(System.in);
        System.out.println("Qual valor deseja depositar");
        double eti = c.nextDouble();
        saldo = saldo - eti;
        return saldo;
    }
    public double  sair(double saldo){
        Scanner b = new Scanner(System.in);
        System.out.println("Deseja realmente sair");
        double d = b.nextDouble();
        saldo = saldo - d;
        return saldo;
  
}
