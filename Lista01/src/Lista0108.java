import java.util.Scanner;
public class Lista0108 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int i, numero, sum = 0, maior = -1, menor = 100000;

        for (i =0; i < 10; i++){
            numero = ler.nextInt();
            sum += numero;
            if (numero > maior) maior = numero;
            if (numero < menor) menor = numero;
        }
        double media = sum/10;
        System.out.println("Média: " + (media) + "\nMaior: " + (maior) + "\nMenor: " + (menor));

    }
}
