import java.util.Scanner;

public class Lista0104 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float nota1, nota2, nota3, nota4;
        nota1 = ler.nextFloat( );
        nota2 = ler.nextFloat( );
        nota3 = ler.nextFloat( );
        nota4 = ler.nextFloat( );

        float media = (nota1+nota2+nota3+nota4)/4;

        if (media >= 7.0){
            System.out.println("O aluno está aprovado");
        }

        else if (media >= 5.0 && media < 7.0){
            System.out.println("O aluno está na final");

        }
        else  {
            System.out.println("O aluno está reprovado");
        }
    }
}