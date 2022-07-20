
public class Main {

	public static void main(String[] args) {
		
		Cliente taciara = new Cliente();
		taciara.setNome("Taciara");
		
		Conta cc = new ContaCorrente(taciara);
		cc.depositar(150);
		cc.sacar(28);
		
		Conta cp = new ContaPoupanca(taciara);
		
		cc.transferir(50, cp); 
		cp.depositar(28);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();

	}

}
