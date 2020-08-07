public class ClienteEspecial extends Cliente{
	// Substitui o valor da divida maxima herdada da classe Cliente
	static final int dividaMaxima = 50000;
	static final String tipo = "CE";
	
	/* Construtor da Classe ClienteEspecial
	 * Este construtor invoca o construtor da classe Cliente.
	 */
	ClienteEspecial(String nome, int cpf, int valor){
		super(nome, cpf, valor);
	}
	
	/* Metodo que retorna o valor do atributo tipo do objeto atual */
	String retornaTipo() {
		return tipo;
	}
	
	public boolean obterEmprestimo(int valor) {
		
		//TODO implemente seu codigo aqui		

		//sao usados gets e sets porque os atributos da classe pai sao "private"
		
		if (valor <= 0) { // verifica se o parametro e valido
			return false;
		} else if (valor + this.getValorDaDivida() > dividaMaxima) { 
			// confere se o cliente e aplicavel ao emprestimo - compara o valor da divida + emprestimo com a divida maxima
			return false;
		}

		// passada as verificacoes o metodo altera o valor da divida e o valor da conta corrente do cliente

		this.setValorDaDivida(this.getValorDaDivida() + valor);
		this.setValorContaCorrente(this.getValorContaCorrente() + valor);

		return true;
	}
	
}
