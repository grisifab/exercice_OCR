package exo6;

public class Exo6 {

	// commentaires rajoutés


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Écrire un programme Java pour tester si un tableau contient une valeur spécifique
		int[] tabIn = {12,24,56,11,14,12,0,4,9,10};
		int ind = -12;
		int valeurSpe = 25;
		
		for(int i=0; i < tabIn.length; i++) {
			if (tabIn[i] == valeurSpe){
				ind = i;
			}	
		}
		
		if (ind != -12){
			System.out.println("La valeur spéciale : " + valeurSpe + " est presente à l'indice " + ind + " du tableau");
		} else {
			System.out.println("La valeur spéciale : " + valeurSpe + " n'est pas presente dans le tableau");
		}
		
	}

}
