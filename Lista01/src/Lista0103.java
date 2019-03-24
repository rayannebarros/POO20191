import java.util.Scanner;

public class Lista0103 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float nota1;
        float nota2;
        float nota3;
        nota1 = ler.nextFloat( );
        nota2 = ler.nextFloat( );
        nota3 = ler.nextFloat( );

        System.out.println("A media final do aluno eh: " + ((nota1 * 2 + nota2 * 3 + nota3 * 5)/10));
    }
}
