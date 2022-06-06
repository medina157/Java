
public class ContaInvestimento extends ContaBancaria{
	
	private double saldo = 0;//A conta investimento começa com 0, você precisa transferir o dinheiro da conta corrente para a conta de investimentos.

	

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
		return saldo+(saldo*0.05);
	}

	
}
