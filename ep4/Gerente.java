public class Gerente extends Pessoa implements InterfaceGerente {
	private static final String tipo = "G";
	private Cliente[] clientes;
	private int numClientes;

	/* Construtor da Classe Gerente
	 * Este construtor invoca o construtor da classe Pessoa e inicializa os dois atributos 
	 * do objeto que esta sendo instanciado.
	 */
	Gerente(String nome, int cpf) {
		super(nome, cpf);
		clientes = new Cliente[20];
		numClientes = 0;
	}

	
	/* Metodo que retorna o valor do atributo tipo do objeto atual */
	String retornaTipo() {
		return tipo;
	}

	public int getNumClientes() {
		return numClientes;
	}
	
	/* Metodo para imprimir informacoes sobre os clientes gerenciados pelo gerente atual */
	void imprimirClientes() {
		Cliente atual;
		System.out.println("\tNumero de clientes: " + numClientes);
		for (int c=0; c < numClientes; c++){
			atual = clientes[c];
			System.out.println("\t" + (c+1) + "\t" + atual.retornaTipo() + "\t" + atual.nome + "\t" + atual.cpf + "\t" + atual.getValorContaCorrente() + "\t" + atual.getValorDaDivida() + "\t" + atual.negativado());
		}
	}


	/* Metodo para adicionar um cliente no arranjo de clientes do gerente atual.
	 * Caso o numero de clientes seja igual a 20, nao deve adicionar e deve retornar false.
	 * Caso contrario, ha duas situacoes: 
	 *   1a: o cliente ja consta no arranjo de clientes (verifique isso usando o numero do cpf),
	 *       neste caso o cliente nao deve ser reinserido e o metodo deve retornar false; 
	 *   1a: o cliente passado como parametro nao consta no arranjo de clientes: o cliente 
	 *       deve ser adicionado na posicao numClientes, o atributo numClientes deve ser 
	 *       incrementado em 1 e o metodo deve retornar true. 
	 */
	public boolean adicionarCliente(Cliente cliente) {

		// TODO implemente seu codigo aqui

		if (numClientes == 20) { // verifica se ja foi atingido 20 gerentes por gerente
			return false;
		} else if (consultaCliente(cliente)) { // chama o metodo "consultaCliente()"
			return false;
		}

		// passadas as verificacoes o metodo adiciona o cliente ao array "clientes" e incrementa "numclientes"

		clientes[numClientes] = cliente;
		numClientes++;

		return true;
	}

	
	/* Metodo para cobrar os emprestimos de todos os clientes do gerente atual.
	 * Para cada um dos clientes presentes no arranjo clientes, este metodo deve:
	 *   - nao fazer nada para o cliente, caso seu valorDaDivida seja igual a zero
	 *   - caso contrario, ha duas situacoes:
	 *     1a) se o valorContaCorrente do cliente for maior ou igual ao valorDaDivida, deve
	 *         fazer o cliente pagar a divida, isto e, o valorContaCorrente sera atualizado, 
	 *         descontando-se o valor da divida e o valorDaDivida sera zerado.
	 *     2a) se o valorContaCorrente do cliente for menor do que o valorDaDivida, 
	 *         deve fazer o cliente pagar parte da divida, isto e, o valorDaDivida 
	 *         sera atualizado, tendo seu valor diminuido pelo valorContaCorrente e 
	 *         o valorContaCorrente sera zerado.
	 */
	public void cobrarTodosEmprestimos() {
			
		//TODO implemente seu codigo aqui

		for (int i = 0; i < numClientes; i++) { // itera por todos os itens do array clientes
			int valorDaDivida = clientes[i].getValorDaDivida(); // armazena o valor da divida do cliente
			int valorContaCorrente = clientes[i].getValorContaCorrente(); // armazena o valor da conta corrente do cliente

			if (valorDaDivida == 0) { // avanca para a proxima iteracao se o valor da divida do cliente for 0
				continue;
			} else if (valorContaCorrente >= valorDaDivida) { 
				// paga integralmente a divida dos clientes se o valor da conta corrente for superior ao valor da divida

				clientes[i].setValorContaCorrente(valorContaCorrente - valorDaDivida);
				clientes[i].setValorDaDivida(0);

			} else if (valorContaCorrente < valorDaDivida) {
				// paga parcialmente a divida dos clientes se o valor da conta corrente for inferior ao valor da divida

				clientes[i].setValorContaCorrente(0);
				clientes[i].setValorDaDivida(valorDaDivida - valorContaCorrente);

			}
		}

	}

	/*
	* Metodo para verificar se o cliente passado como parametro esta presente no array clientes.
	* O metodo usa o cpf como comparacao entre os clientes.
	*
	* Retorna "true" se já existe um cliente com o mesmo cpf que o cliente passado como parametro no array "clientes"
	*/
	boolean consultaCliente(Cliente cliente) {
		for (int i = 0; i < numClientes; i++) {
			if (clientes[i].cpf == cliente.cpf) {
				return true;
			}
		}

		return false;
	}

}
