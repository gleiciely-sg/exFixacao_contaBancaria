package application;

import java.util.Locale;
import java.util.Scanner;

import entities.DadosConta;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DadosConta dc;		
		
		System.out.printf("==================================%n"
						+ "       BANCO MEU DINHEIRO%n"
						+ "==================================%n");
		
		System.out.print("\nNÚMERO DA CONTA: ");
		int conta = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("NOME DO TITULAR: ");
		String nome = sc.nextLine();
	
		System.out.print("\nDESEJA REALIZAR UM DEPÓSITO? S/N ");
		String resp = sc.nextLine();
		
		if (resp.equalsIgnoreCase("S")) {
			System.out.print("\nDIGITE O VALOR DO DEPÓSITO: ");
			double depositoInicial = sc.nextDouble();
			dc = new DadosConta (conta, nome, depositoInicial);
			
		}else {
			dc = new DadosConta(conta, nome);
		}
		
		System.out.println(dc);
		
		System.out.print("DIGITE O VALOR DO SAQUE: ");
		double saque = sc.nextDouble();
		dc.sacarValor(saque);
		
		if(dc.getSaldo() < 0) {
			System.out.printf(dc.saldoNegativo());
		}
		
		System.out.println(dc.saldo());
		
		System.out.print("DIGITE O VALOR DO DEPÓSITO: ");
		double deposito = sc.nextDouble();
		dc.depositarValor(deposito);
		
		
		System.out.println(dc.saldo());
		
		sc.close();

	}

}
