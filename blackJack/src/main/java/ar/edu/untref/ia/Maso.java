package ar.edu.untref.ia;

import java.util.*;

public class Maso {

	private List<String> cartas;

	public Maso() {
		this.cartas = new ArrayList<>();
		String[] cartas = {"2 de diamantes", "2 de corazones", "2 de trebol", "2 de picas", 
						   "3 de diamantes", "3 de corazones", "3 de trebol", "3 de picas", 
						   "4 de diamantes", "4 de corazones", "4 de trebol", "4 de picas",
						   "5 de diamantes", "5 de corazones", "5 de trebol", "5 de picas", 
						   "6 de diamantes", "6 de corazones", "6 de trebol", "6 de picas", 
						   "7 de diamantes", "7 de corazones", "7 de trebol", "7 de picas",
						   "8 de diamantes", "8 de corazones", "8 de trebol", "8 de picas", 
						   "9 de diamantes", "9 de corazones", "9 de trebol", "9 de picas", 
						   "10 de diamantes", "10 de corazones", "10 de trebol", "10 de picas",
						   "Jack de diamantes", "Jack de corazones", "Jack de trebol", "Jack de picas", 
						   "Reina de diamantes", "Reina de corazones", "Reina de trebol", "Reina de picas", 
						   "Rey de diamantes", "Rey de corazones", "Rey de trebol", "Rey de picas", 
						   "As de diamantes", "As de corazones", "As de trebol", "As de picas" };

		for (String carta : cartas) {
			this.cartas.add(carta);
		}
		this.mezclar();
	}

	protected String getCarta() {
		String carta = this.cartas.get(0);
		this.cartas.remove(0);
		return carta;
	}

	protected List<String> getCartasRestantes() {
		return this.cartas;
	}

	public void mezclar() {
		Collections.shuffle(this.cartas);
	}
}