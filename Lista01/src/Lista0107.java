import java.util.Scanner;
public class Lista0107 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int nota;
        nota = ler.nextInt();
        String conceito;

        if(nota>=0 && nota <= 49) conceito = "Insuficiente";
        else if(nota>=50 && nota <= 64) conceito = "Regular";
        else if(nota>=65 && nota <= 84) conceito = "Bom";
        else conceito = "Ótimo";

        System.out.println("O aluno eh: " + (conceito));
    }

}
