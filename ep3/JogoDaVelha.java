/*********************************************************************/
/**   ACH2001 - Introdução à Programação                            **/
/**   EACH-USP - Primeiro Semestre de 2020                          **/
/**   <ACH2001> - <Norton Trevisan Roman>                           **/
/**                                                                 **/
/**   Terceiro Exercício-Programa                                   **/
/**                                                                 **/
/**   <Raul Mello Silva>                        <11870986>          **/
/**                                                                 **/
/**   <16/05/2020>                                                  **/
/*********************************************************************/

/*
	Jogo da Velha - programa para verificar o status de um jogo.
	
	Lista de Status calculado:
	0 - Jogo não iniciado: o tabuleiro está 'vazio', isto é sem peças X e O;
    1 - Jogo encerrado1: o primeiro jogador (que usa as peças X) é o ganhador;
    2 - Jogo encerrado2: o segundo jogador (que usa as peças O) é o ganhador;
    3 - Jogo encerrado3: empate - todas as casas do tabuleiro estão preenchidas com X e O, mas nenhum dos jogadores ganhou;
    4 - Jogo já iniciado e em andamento: nenhuma das alternativas anteriores.	
*/

public class JogoDaVelha {
	static final char pecaX = 'X';
	static final char pecaY = 'O';
	static final char espacoVazio = ' ';

	/*
		Determina o status de uma partida de Jogo da Valha
		
		Entrada:
			tabuleiro - matriz 3x3 de caracteres representando uma partida válida de Jogo da Velha
			
		Saída:
			um inteiro contendo o status da partida (valores válidos de zero a quatro)
	*/
	static int verificaStatus(char[][] tabuleiro) {
		int status = -1;

		// escreva seu código aqui
		if (tabuleiroVazio(tabuleiro)) {
			return 0;
		} else if (vitoriaPorLinhas(tabuleiro) == 1 || vitoriaPorColunas(tabuleiro) == 1 || vitoriaPorDiagonal(tabuleiro) == 1) {
			return 1;
		} else if (vitoriaPorLinhas(tabuleiro) == 2 || vitoriaPorColunas(tabuleiro) == 2 || vitoriaPorDiagonal(tabuleiro) == 2) {
			return 2;
		} else if (casasPreenchidas(tabuleiro)) {
			return 3;
		} else {
			return 4;
		}
	}
	
	// metodo que verifica se o tabuleiro esta vazio	
	static boolean tabuleiroVazio(char[][] tabuleiro) {
		int countEmpty = 0;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (tabuleiro[i][j] == espacoVazio) {
					countEmpty++;
				}
			}
		}
		
		if (countEmpty == 9) {
			return true;
		}
		
		return false;
	}
	
	// metodo que verifica vitoria por linhas
	static int vitoriaPorLinhas(char[][] tabuleiro) {
		for (int i = 0; i < 3; i++) {
			int countX = 0;
			int countO = 0;
			
			for (int j = 0; j < 3; j++) {
				if (tabuleiro[i][j] == pecaX) {
					countX++;
				} else if (tabuleiro[i][j] == pecaY) {
					countO++;
				}
			}
			
			if (countX == 3) {
				return 1;
			} else if (countO == 3) {
				return 2;
			}
		}
		
		return 0;
	}
	
	// metodo que verifica vitoria por colunas
	static int vitoriaPorColunas(char[][] tabuleiro) {
		for (int i = 0; i < 3; i++) {
			int countX = 0;
			int countO = 0;
			
			for (int j = 0; j < 3; j++) {
				if (tabuleiro[j][i] == pecaX) {
					countX++;
				} else if (tabuleiro[j][i] == pecaY) {
					countO++;
				}
			}
			
			if (countX == 3) {
				return 1;
			} else if (countO == 3) {
				return 2;
			}
		}
		
		return 0;
	}
	
	// metodo que verifica vitoria por diagonais
	static int vitoriaPorDiagonal(char[][] tabuleiro) {
		int countX = 0;
		int countO = 0;
		
		for (int i = 0; i < 3; i++) {
			if (tabuleiro[i][tabuleiro.length - 1 - i] == pecaX) {
				countX++;
			} else if (tabuleiro[i][tabuleiro.length - 1 - i] == pecaY) {
				countO++;
			}
		}
			
		if (countX == 3) {
			return 1;
		} else if (countO == 3) {
			return 2;
		}
		
		countX = 0;
		countO = 0;
		
		for (int i = 0; i < 3; i++) {
			if (tabuleiro[i][i] == pecaX) {
				countX++;
			} else if (tabuleiro[i][i] == pecaY) {
				countO++;
			}
		}
			
		if (countX == 3) {
			return 1;
		} else if (countO == 3) {
			return 2;
		}
		
		return 0;
	}
	
	// metodo que verifica se todas as casas estao preenchidas
	static boolean casasPreenchidas(char[][] tabuleiro) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (tabuleiro[i][j] == espacoVazio) {
					return false;
					
				}
			}
		}
		
		return true;
	}
	
	/*
		Apenas para seus testes. ISSO SERÁ IGNORADO NA CORREÇÃO
	*/
	public static void main(String[] args) {
		// escreva seu código (para testes) aqui
	}
}