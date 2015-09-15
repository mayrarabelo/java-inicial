package desafios;
import java.util.Random;
import javax.swing.JOptionPane;

/*
*Criar um game de sorteio de dados
*verificar se o número que o usuário escolheu é igual ao que saiu
*se sim o programa deve dizer que "Acertou"
*se não dizer "Não acertou"
*/

public class GameDesafioDosDados {
	public static void main(String[] args) {

		int[] dado = { 1, 2, 3, 4, 5, 6 };
		Random d = new Random();

		String entrada = JOptionPane.showInputDialog("Escolha um númedo do dado (de 1 a 6) ");
		int dadoUsuario = Integer.parseInt(entrada);
		int dadoSorteio = dado[d.nextInt(dado.length)];

		String resultado = (dadoUsuario == dadoSorteio) ? "Acertou!" : "Não acertou!";

		JOptionPane.showMessageDialog(null, "Número sorteado = " + dadoSorteio + "\n" + resultado);

	}
}
