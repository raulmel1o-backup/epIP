# EP Introdução à Programação

No primeiro semestre de 2020, foram propostos quatro EP's (exercício programa) para os alunos da disciplina de Introdução à Programação, ministrada pelo docente Norton Trevisan Roman, com o intuito de avaliar o desempenho do aluno na disciplina.

Cada um dos EP's possui um enunciado em formato PDF, disponível dentro do diretório correspondente a cada EP, todos os EP's foram desenvolvidos em **Java**

## EP1

Para o EP 1 foi proposto o desenvolvimento de um método que recebe como parâmetro um valor inteiro maior que zero e retorna o menor número de cédulas possível para a realização do saque.

Cédulas disponíveis: { 
                       B$1,00, 
                       B$5,00, 
                       B$10,00, 
                       B$50,00 
                     }

Compilar: `javac ep1/CaixaEletronico.java`

Executar: `cd ep1` -> `java CaixaEletronico`

Mais detalhes em ep1/Enunciado.pdf

## EP2

Para o EP 2 foi proposto o desenvolvimento de um método que calcule a raíz quadrada utilizando o método de Newton. O método assinado como `static double raizQuadrada(double a, double epsilon)`, recebe como parâmetros um número real (a) maior ou igual a zero e um número real (epsilon) maior que zero e menor que 1. A saída do método é o valor da raíz quadrada com uma precisão "epsilon" ou -1 caso algum dos parâmetros seja inválido.

Compilar: `javac ep2/Raiz.java`

Executar: `cd ep2` -> `java Raiz`

Mais detalhes em ep2/Enunciado.pdf

## EP3

O EP 3 propõe a criação de um método `static int verificaStatus(char[][] tabuleiro)`, o qual recebe como parâmetro um array multidimensional de 3x3, simbolizando um tabuleiro de nove posições, como o do jogo da velha. O método retorna um número inteiro entre 0 e 4 de acordo com o estado do tabuleiro.

Código estado tabuleiro: { 
                           0: Jogo não iniciado, 
                           1: Jogo encerrado - jogador 1 vencedor,
                           2: Jogo encerrado - jogador 2 vencedor,
                           3: Jogo encerrado - empate,
                           4: Jogo já iniciado e em andamento
                         }
                         
Compilar: `javac ep3/JogoDaVelha.java`

Executar: `cd ep3` -> `java JogoDaVelha`

Mais detalhes em ep3/Enunciado.pdf

## EP4

O EP 4 propõe a construção de um sistema simplificado para o gerenciamento de um banco. O sistema é composto pelas classes: Pessoa, Gerente, Cliente, ClienteEspecial, Banco, ExecutaBanco e as interfaces InterfaceCliente, InterfaceGerente.

Adicionalmente há uma classe Testes, a qual contém testes unitários para os métodos desenvolvidos.

Testes: inserir `Testes.executar()` no método `public static void main(String[] args)` da classe ExecutaBanco

Compilar: `javac ep4/*.java`

Executar: `cd ep4` -> `java ExecutaBanco`

Mais detalhes em ep4/Enunciado.pdf
