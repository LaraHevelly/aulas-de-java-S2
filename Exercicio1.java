
package exercicio1;

import java.util.Scanner;
public class Exercicio1 {

    
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        double saldo=0;
        boolean sair= false;
        double metodo;
        Exercicio1 bb= new Exercicio1();
        while(sair==false){
            bb.menu();
            int dd= a.nextInt();
            switch(dd){
                case 1:
                    
                    break;
                case 2:
                  metodo = bb.sacar(saldo);
                  break;
                case 3:
                    metodo = bb.depo
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
        double dôh = b.nextDouble();
        saldo = saldo - dôh;
        return saldo;
  
}
