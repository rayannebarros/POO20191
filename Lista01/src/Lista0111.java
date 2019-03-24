import java.util.Scanner;

public class Lista0111 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double total = 0;
        int quantos_produtos = ler.nextInt();
        for(int i = 0; i<quantos_produtos;i++){
            int cod = ler.nextInt();
            int qntd = ler.nextInt();

            if(cod == 10) total = 1.5 * qntd;
            else if(cod == 11) total = 1.8 * qntd;
            else if(cod == 12) total = 1.9 * qntd;
            else if(cod == 20) total = 10 * qntd;
            else if(cod == 30) total = 8 * qntd;
            else if(cod == 50) total = 2.5 * qntd;
            double valor = total;
            if (total > 50.0) {
                valor = total * 0.95;
                System.out.println(valor);
            }
            else System.out.println(total);
        }
    }
}