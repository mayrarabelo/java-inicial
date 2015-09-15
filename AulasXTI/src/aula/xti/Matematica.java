package aula.xti;

public class Matematica {
	
	/**
	 * 
	 * @param um
	 * @param dois
	 * @return o maior entre os dois números
	 */
	int maior(int um, int dois){
		if (um > dois){
			return um;
		}else {
			return dois;			
		}
	}

	/**
	 * 
	 * @param um
	 * @param dois
	 * @return a soma dos dois números
	 */
	double soma(double um, double dois){
		double s = um + dois;
		return s;
	}
}
