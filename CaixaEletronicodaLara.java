//aluno(a) lara hevelly santos sousa ^^
package basico;
import java.util.Scanner;
public class CaixaEletronico {
    public static void main (String[]args){
        Scanner tcl = new Scanner(System.in);
        double saldo = 0;
        double sacar;
        double depositar;
        boolean Sair = false;
        int opcao = 1;
        CaixaEletronico obj=new CaixaEletronico();
        while(opcao != 0){
            obj.menu();
            opcao= tcl.nextInt();
            //estrutura condicional :)
            if(opcao==1){
                System.out.println("Quanto tu quer?");
                sacar=tcl.nextDouble();
                saldo = saldo-sacar;
                System.out.println(saldo); 
            }
            if(opcao==2){
                System.out.println(saldo);
            }
            if(opcao==3){
                System.out.println("Deposite algum valor");
                depositar = tcl.nextDouble();
                saldo = depositar + saldo;
                System.out.println(saldo);
            }
             if(opcao==4){
                System.out.println("sair s ou n");
               String xxx=tcl.next();
               if ("s".equals(xxx)){
                   Sair = true;
                   break;
               }
             }
            
        }
   }
public void menu(){
    //meu lindo menu s2
    System.out.println("caixa eletronico");
    System.out.println("Escreva!!");
    System.out.println("1-sacar");
    System.out.println("2-ver saldo");
    System.out.println("3-depositar");
    System.out.println("4-sair");
}
}
