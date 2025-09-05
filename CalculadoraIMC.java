import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);

        
        System.out.print("Digite seu nome: ");
        String nome = lerTeclado.nextLine();

        System.out.print("Digite seu gênero (M/F): ");
        char genero = lerTeclado.nextLine().charAt(0);

        System.out.print("Digite sua altura em metros (ex: 1.75): ");
        double altura = lerTeclado.nextDouble();

        System.out.print("Digite seu peso em kg (ex: 70.5): ");
        double peso = lerTeclado.nextDouble();

        
        double imc = peso / (altura * altura);
        String classificacao = "";

        
        switch (genero) {
            case 'M':
            case 'm':
                if (imc >= 40) {
                    classificacao = "Obesidade Mórbida";
                } else if (imc >= 30) {
                    classificacao = "Obesidade Moderada";
                } else if (imc >= 25) {
                    classificacao = "Obesidade Leve";
                } else if (imc >= 20) {
                    classificacao = "Normal";
                } else {
                    classificacao = "Abaixo do Normal";
                }
                break;

            case 'F':
            case 'f':
                if (imc >= 39) {
                    classificacao = "Obesidade Mórbida";
                } else if (imc >= 29) {
                    classificacao = "Obesidade Moderada";
                } else if (imc >= 24) {
                    classificacao = "Obesidade Leve";
                } else if (imc >= 19) {
                    classificacao = "Normal";
                } else {
                    classificacao = "Abaixo do Normal";
                }
                break;

            default:
                classificacao = "Gênero inválido!";
                break;
        }

        
        System.out.println("\nNome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.printf("IMC: %.2f\n", imc);
        System.out.println("Classificação: " + classificacao);

        System.out.println("\nAtitus Educação - O lado certo da força!!!");

        lerTeclado.close();
    }
}