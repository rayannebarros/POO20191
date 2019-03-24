import java.util.Scanner;

public class Lista0105 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int numero;
        numero = ler.nextInt();
        String mes;
        if (numero == 1) mes = "Janeiro";
        else if (numero == 2) mes = "Fevereiro";
        else if (numero == 3) mes = "Março";
        else if (numero == 4) mes = "Abril";
        else if (numero == 5) mes = "Maio";
        else if (numero == 6) mes = "Junho";
        else if (numero == 7) mes = "Julho";
        else if (numero == 8) mes = "Agosto";
        else if (numero == 9) mes = "Setembro";
        else if (numero == 10) mes = "Outubro";
        else if (numero == 11) mes = "Novembro";
        else if (numero == 12) mes = "Dezembro";
        else mes = "Mês inválido!";

        System.out.println(mes);
    }

}
