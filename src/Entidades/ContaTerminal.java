package Entidades;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        int numero;
        String agencia;
        String nome;
        double saldo;
        Scanner scan = new Scanner(System.in);

        System.out.println("Ol�, ser� necess�rio informar algumas informa��es, vamos l�: \n\n");

        System.out.println("Por favor, primeiro digite o Nome de Usu�rio: ");
        nome = scan.nextLine();

        System.out.println("Agora, digite o n�mero da Ag�ncia: ");
        agencia = scan.nextLine();

        System.out.println("Agora, digite o n�mero da Conta sem o d�gito: ");
        numero = scan.nextInt();

        System.out.println("Por fim, digite seu saldo: ");
        saldo = scan.nextDouble();

        System.out.println("Obrigado pelas informa��es!\n\n");
        System.out.println("Ol� " + nome + ", obrigado por criar uma conta em nosso banco, sua ag�ncia � " + agencia + ", "
                + "conta " + numero + " e seu saldo de R$" + saldo + " j� est� dispon�vel para saque.");

    }

}
