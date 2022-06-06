
public class ContaCorrente extends ContaBancaria{
	
	
	private double saldo = ContaBancaria.getSaldo(); //O saldo da conta corrente é igual ao da conta bancária

	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		saldo +=valor;
	}

	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		saldo -=valor;
	}


	@Override
	public double CalcularSaldo() {
		// TODO Auto-generated method stub
		return saldo-(saldo*0.10);
	}
	
}
