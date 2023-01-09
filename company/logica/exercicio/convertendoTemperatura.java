package company.logica.exercicio;
//Escreva um programa que, com base em uma temperatura em graus celsius,
//a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F),
//seguindo as fórmulas:
// F = C * 1.8 + 32;
// K = C + 273.15;
// Re = C * 0.8;
// Ra = C * 1.8 + 32 + 459.67
import java.util.Scanner;
public class convertendoTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double kelvi,reamur,rankine,fahrenheit;

        System.out.print("DIGITE UMA TEMPERATURA:");
        double celsius = scanner.nextDouble();

        fahrenheit = (celsius * 1.8) +32;
        kelvi = celsius +273.15;
        reamur = celsius *0.8;
        rankine = celsius * 1.8 + 32 +459.67;
        System.out.println("Temperatura de CELSIUS para FAHRENHEIT = "+fahrenheit);
        System.out.println("Temperatura de CELSIUS para KELVIN = "+kelvi);
        System.out.println("Temperatura de CELSIUS para REAMUR = "+reamur);
        System.out.println("Temperatura de CELSIUS para RANKINE = "+rankine);

    }
}
