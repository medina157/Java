
public class ContaInvestimento extends ContaBancaria{
	
	//A conta investimento come�a com 0, igual na vida real que voc� precisa transferir dinheiro da sua conta corrente para a conta de investimentos.
	private double saldo = 0;
	

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	//M�todos com Override
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