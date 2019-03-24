import java.util.Scanner;

public class Lista0110 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x;
        x = ler.nextInt();

        System.out.println("Resultado da ultima divisao: " + (UltimaDvisao(x)) + ("\nTotal de divisões: " + (QuantidadeDivisao(x))));
    }

    public static float UltimaDvisao(int x){
        float ultimo = x;
        while (true){
            if(ultimo < 1) break;
            ultimo /=2;
        }
        return ultimo;
    }

    public static int QuantidadeDivisao(int x){
        int count = 0;
        float ultimo = x;
        while (true){
            if(ultimo < 1) break;
            ultimo /=2;
            count ++;
        }
    return count;
    }
}