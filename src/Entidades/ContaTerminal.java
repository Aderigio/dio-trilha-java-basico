package Entidades;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        int numero;
        String agencia;
        String nome;
        double saldo;
        Scanner scan = new Scanner(System.in);

        System.out.println("Olá, será necessário informar algumas informações, vamos lá: \n\n");

        System.out.println("Por favor, primeiro digite o Nome de Usuário: ");
        nome = scan.nextLine();

        System.out.println("Agora, digite o número da Agência: ");
        agencia = scan.nextLine();

        System.out.println("Agora, digite o número da Conta sem o dígito: ");
        numero = scan.nextInt();

        System.out.println("Por fim, digite seu saldo: ");
        saldo = scan.nextDouble();

        System.out.println("Obrigado pelas informações!\n\n");
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", "
                + "conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque.");

    }

}
