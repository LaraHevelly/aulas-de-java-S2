import java.util.Random;
public class Class {
    public static void main(String[] args) {
        int vetor[]= new int[100];
        Random nmr= new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i]= nmr.nextInt(100);
        }
        System.out.println("lamento informar,seu vetor não foi encontrado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor [i]+"");
             }
        // 
        int aux= 0;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[i]< vetor[j]){
                aux= vetor[i];
                vetor [i]= vetor[j];
                vetor[j]= aux;
                }
            }
            System.out.println("vetor encontrado");
        for (; i < vetor.length; i++) {
            System.out.println(vetor [i]+"");
             }
        //sorry
        }
    }
}
