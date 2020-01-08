package exo7;

public class Exo7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Calcul de pi un quart de cercle de 1 de rayon
		// on balaye le carré de 1m par 1m, incluant le quart de cercle
		// si la distance du point (/ à 0.0) est inférieure à 1 on est dans le cercle
		// on calcule ainsi la surface qui doit être de pi/4 m²

		double posX, posY, dist;
		int divXY = 1000; //soit des pas de 1mm
		double pasXY = 1/(float)divXY;
		int surface = 0;
		double piEst;
		
		for(int i=0; i < divXY; i++){
			posX = (pasXY/2)+((double)i*pasXY);
			for(int j=0; j < divXY; j++){
				posY = (pasXY/2)+((double)j*pasXY);
				dist = Math.sqrt(posX*posX + posY*posY);
				if (dist <= 1){surface ++;}		
			}
		}
		piEst = 4 * (double)surface / (divXY * divXY);
		System.out.println(piEst + " " + Math.PI);
		
	}
}
