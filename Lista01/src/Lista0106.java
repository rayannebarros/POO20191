import java.util.Scanner;

public class Lista0106 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome = ler.next();
        int diarias = ler.nextInt();
        double total = 0;

        if(diarias > 15) total = diarias*5.5;
        else if(diarias == 15) total = diarias*6.0;
        else if(diarias < 15) total = diarias*8.0;

        System.out.println("Nome: " + (nome));
        System.out.println("Total: R$" + (total));
    }
}