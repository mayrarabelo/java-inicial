package desafios;

public class RaizQuadradaPell {		
/**
 * 
 * @param numero
 * @return
 */
	int raiz(int numero){
		int raiz = 0, impar = 1;
		while (numero >= impar){
			numero -= impar;
			impar += 2;
			++raiz;
			
		}
		return raiz;
		
	}

}
