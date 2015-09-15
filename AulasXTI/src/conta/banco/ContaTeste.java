package conta.banco;

public class ContaTeste {

	public static void main(String[] args) {

		Conta conta = new Conta();
		conta.cliente = "Fulano";
		conta.saldo = 1500;
		conta.exibeSaldo();
		
		Conta destino = new Conta();
		destino.cliente = "Sicrano";
		destino.saldo = 8000;
		destino.exibeSaldo();
		
		conta.transferenciaPara(destino, 1550.00);
		conta.exibeSaldo();
		destino.exibeSaldo();
		
//		conta.saca(1000);
//		conta.exibeSaldo();
//		
//		conta.deposito(650);
//		conta.exibeSaldo();

	}

}
