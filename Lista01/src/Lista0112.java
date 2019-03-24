import java.util.Scanner;

public class Lista0112 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        for(int i = 0; i <= 10; i++){
            System.out.println("Valor: "+ i + "\nQuadrado: " + Quadrado(i) + "\nCubo: " + Cubo(i));
        }
    }
    public static int Quadrado(int x){
        return x*x;
    }

    public static int Cubo(int x){
        return x*x*x;
    }
}
