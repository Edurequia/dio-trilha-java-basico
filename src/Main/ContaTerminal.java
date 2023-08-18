package Main;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String numero;
		int agencia;
		String nomeCliente;
		double saldo;;
		
		System.out.print("Por favor, digite o seu nome: ");
		nomeCliente = sc.next();
		System.out.print("Por favor, digite o número da sua conta: ");
		numero = sc.next();
		System.out.print("Por favor, digite o número de sua agência: ");
		agencia = sc.nextInt();
		System.out.print("Por favor, digite o seu saldo: ");
		saldo = sc.nextDouble();
		
		System.out.println("Olá " + nomeCliente
				+ ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia
				+ ", conta " + numero
				+ " e seu saldo R$" + saldo
				+ " já está disponível para saque.");
		
		
		sc.close();
	}

}
