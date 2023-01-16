package br.com.challenge.neomind;

import java.util.InputMismatchException;
import java.util.Scanner;
import br.com.challenge.neomind.classes.AnguloRelogio;
import br.com.challenge.neomind.object.Relogio;

/**
 * 
 * @author Kalil J. Fakhouri
 * @version 1.0
 *
 */

public class Main {

	//VARIAVEIS
	private static int hour;
	private static int minute;
	private static String option;
	
	//FUNÇÃO DE ENTRADA
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		do {
			
			System.out.println("\n\n|| ----------------- STARTING APPLICATION ----------------- ||");
			System.out.println("|| - DIGITE 'S' PARA SAIR!");
			System.out.println("\n- DEFINA UMA HORA VALIDA (00-24):");
			option = input.next();
			switch (option.toLowerCase()) {
			case "s": {
				System.out.println("|| ----------------- CLOSING APPLICATION ----------------- ||");
				System.exit(1);
			}
			default:
				processingValues();
			}
			
		} while (true);

	}
	
	// FUNÇÃO PARA CAPTURA DE DADOS
	private static void processingValues(){
		
		boolean pass = false;
		
		Scanner input = new Scanner(System.in);
		Relogio relogio = new Relogio();
		AnguloRelogio resposta = new AnguloRelogio();
		
		//VALIDAÇÃO DE HORA
		do {
			
			try {
				
				hour = Integer.valueOf(option);
				
				if (hour < 0 || hour > 24) {
					System.out.println("\n- HORARIO INVALIDO! TENTE NOVAMENTE!\n- DEFINA UMA HORA VALIDA (00-24):");
					option = input.next();
					pass = false;
				}else {
					pass = true;
					relogio.setHour(hour);
				}
				
			} catch (Exception e) {
				System.out.println("\n- VALOR INVALIDO! TENTE NOVAMENTE!\n- DEFINA UMA HORA VALIDA (00-24):");
				option = input.next();
				pass = false;
			} 
			
		} while (!pass);
		
		//VALIDAÇÃO DE MINUTOS
		
		System.out.println("\n- OTIMO! AGORA DEFINA UM MINUTO (00-59):");
		
		do {
			
			try {
				
				minute = input.nextInt();
				
				if(minute < 0 || minute > 59) {
					System.out.println("\n- HORARIO INVALIDO! TENTE NOVAMENTE!\n- DEFINA UM MINUTO VALIDO (00-59):");
					minute = input.nextInt();
					pass = false;
				}else {
					pass = true;
					relogio.setMinute(minute);
				}
				
			} catch (InputMismatchException e) {
				input.next();
				System.out.println("\n- VALOR INVALIDO! TENTE NOVAMENTE!\n- DEFINA UM MINUTO VALIDO (00-24):");
				pass = false;
			} 
			
		} while (!pass);
		
		//RESULTADO FINAL
		System.out.println("\n\n|| - RESULTADO FINAL - ||");
		System.out.println("\n|| - ANGULO EXATO ENTRE "+relogio.getHour()+" horas e "+relogio.getMinute()+" minutos é de: "+resposta.retornaAnguloRelogio(hour, minute)+"° ENTRE A HORA E MINUTO DEFINIDO");
		
	}

}
