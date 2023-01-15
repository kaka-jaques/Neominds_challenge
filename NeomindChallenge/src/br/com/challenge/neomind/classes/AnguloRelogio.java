package br.com.challenge.neomind.classes;

public class AnguloRelogio {

	final int ANGULOPORHORA = 30;
	final int ANGULOPORMINUTO = 6;
	
	public int retornaAnguloRelogio(int hora, int minuto) {
		
		int anguloHora;
		int anguloMinuto;
		
		if(hora > 12) {
			hora -= 12;
		}
		
		anguloHora = hora*ANGULOPORHORA;
		anguloMinuto = minuto*ANGULOPORMINUTO;
		
		if(anguloMinuto<anguloHora) {
			return (360+anguloMinuto)-anguloHora;
		}else if(anguloMinuto == anguloHora) {
			return 0;
		}else {
			return anguloMinuto-anguloHora;
		}
		
	}
	
}
