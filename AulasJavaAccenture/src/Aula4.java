
/*
 Uma turma de alunos se submeteu a um provão. As notas da prova são 
 valores inteiros no intervalo de 0 (zero) a 100 (cem). 
 Prepare um programa que solicite ao usuário as notas de vários alunos 
 calcule a média da turma (isto é: some todas as notas e divida pelo 
 total de alunos que fizeram a prova). Após cada nota informada, 
 deve-se perguntar ao usuário se deseja incluir mais uma nota. 
 No final deve-se exibir a média geral e o resultado, conforme a seguir: 
 Otimo (maior que 8) Bom (Entre 6 e 8) Regular/Ruim (menor que 6) OBS: 
 Usar interface gráfica para entrada e saída de dados Exercícios
 */


import javax.swing.JOptionPane;

public class Aula4 
{

	public static void main(String[] args) 
	{

		float media;
		int nota, cont= 0, total=0;
		int opcao;

		do {

			String c = JOptionPane.showInputDialog("Entre com a nota do aluno: ");
			nota = Integer.parseInt(c) ;
			opcao =JOptionPane.showConfirmDialog(null, "Deseja incluir mais uma nota?", "Confirmar", JOptionPane.YES_NO_OPTION);
			total = total + nota;
			cont ++;

		}
		while (opcao == 0);

		media = total / cont;

		JOptionPane.showMessageDialog(null, "A média é: "+ media);

		if (media > 80 )
		{		
			JOptionPane.showMessageDialog(null, "Média geral é Otima");
		}else{


			if  (media > 60 && media < 80)
				JOptionPane.showMessageDialog(null, "Média geral é Boa");
			else 
				JOptionPane.showMessageDialog(null, "Média geral é Regular");
		}
	}

}