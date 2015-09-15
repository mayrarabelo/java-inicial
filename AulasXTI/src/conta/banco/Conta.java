package conta.banco;

public class Conta {

	String cliente;
	double saldo;

	void exibeSaldo() {
		System.out.println(cliente + ", seu saldo é: R$ " + saldo);
	}

	void saca(double valor) {
		saldo = saldo - valor;

	}

	void deposito(double valor) {
		saldo = saldo + valor;

	}
	
	/**
	 * 
	 * @param destino, para onde vai o dinheiro da transferência
	 * @param valor em dinheiro da transferência
	 */
	void transferenciaPara(Conta destino, double valor) {
		this.saca(valor);
		destino.deposito(valor);
	}

}