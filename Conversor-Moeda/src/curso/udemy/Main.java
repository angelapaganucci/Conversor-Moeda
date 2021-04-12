package curso.udemy;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o preço do Dólar?");
        double precoDolar = sc.nextDouble();
        System.out.print("Qual o valor em Dólar?");
        double totalDolar = sc.nextDouble();
        double total = CurrencyConverter.dolarParaReal(totalDolar, precoDolar);
        System.out.printf("Total em Reais = R$ %.2f%n", total);

        sc.close();


    }
}
