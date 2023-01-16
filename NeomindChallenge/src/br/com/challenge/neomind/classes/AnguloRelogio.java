package br.com.challenge.neomind.classes;

public class AnguloRelogio {

	// VALORES DE ANGULO POR HORA E MINUTO RESPECTIVAMENTE (CALCULO: 360/12 E 360/60)
	final int ANGULOPORHORA = 30;
	final int ANGULOPORMINUTO = 6;
	
	//MÉTODO QUE RETORNA O VALOR DO ANGULO
	public int retornaAnguloRelogio(int hora, int minuto) {
		
		int anguloHora;
		int anguloMinuto;
		
		if(hora > 12) {
			hora -= 12;
		}
		
		anguloHora = hora*ANGULOPORHORA;
		anguloMinuto = minuto*ANGULOPORMINUTO;
		
		/*
		 * Para ordem uniforme do calculo do ângulo, foi aplicado a condição que o apenas contabilizará o ângulo dentro
		 * do escopo do ponteiro de Hora e Minuto
		 * 
		 * Exemplo: Caso seja 00:00h (0°), será contabilizado a partir daí, como em 00:10h (60°), e após concluir o ciclo de hora,
		 * 			onde seria 01:00h, o ângulo será de 330°, pois o ponteiro de minutos ainda não chegou no ponteiro de horas!
		 */
		
		if(anguloMinuto<anguloHora) {
			return (360+anguloMinuto)-anguloHora;
		}else if(anguloMinuto == anguloHora) {
			return 0;
		}else {
			return anguloMinuto-anguloHora;
		}
		
	}
	
}
