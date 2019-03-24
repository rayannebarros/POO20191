import java.util.Scanner;

public class Lista0109 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1, n2;
        n1 = ler.nextInt();
        n2 = ler.nextInt();

        System.out.println("Soma: "+(Soma(n1,n2))+ "\nPares: "+ (Pares(n1,n2)) +
                "\nImpares: "+ (Impares(n1,n2)));
    }
    public static int Soma(int n1, int n2) {
        int soma = 0;
        for(int i = n1+1; i < n2; i++) {
            soma += i;
        }
        return soma;
    }

    public static int Pares(int n1, int n2) {
        int par = 0;
        for (int i = n1+1; i < n2; i++) {
            if (i % 2 == 0) par++;
        }
        return par;
    }

    public static int Impares(int n1, int n2){
        int impar = 0;
        for(int i = n1+1; i < n2; i++) {
            if(i % 2!=0) impar++;
        }
        return impar;
    }
}