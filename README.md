C MY COMPILER LANGUAGE

Regras

A gramática CMC Grammar define as seguintes regras:

● prog: Representa um programa completo e pode conter seções opcionais
para inclusões (includes), variáveis globais (globals), funções (functions) e
função principal (main).

● Includes: Especifica as inclusões do programa, que devem estar no início do
código e podem ser de várias formas.

● globals: Define variáveis globais que podem ser acessadas em qualquer
parte do programa.

● vars: Define uma variável com um tipo e um ou mais identificadores.

● functions: Especifica as funções do programa.

● function: Define uma função com um tipo de retorno, um nome e uma lista
de parâmetros opcionais.

● main: Define a função principal do programa.

● block: representa um bloco de código que pode conter uma ou mais linhas.

● line: representa uma linha de código e pode conter declarações de variáveis
(vars), atribuições (attribution), entrada de dados (input), saída de dados
(output), expressões (expr), instruções condicionais (ifstmt), instruções de
loop (whilestmt, forstmt), retorno de funções (retrn) e chamadas de
funções (callfunction).

● attribution: Especifica uma atribuição de valor a uma variável ou uma string.

● input: Representa a leitura de um valor a partir do teclado.

● output: Representa a impressão de um valor na tela.

● outputType: Especifica o tipo de valor a ser impresso (STR, ID ou expr).

● ifstmt: Define uma instrução condicional que pode ou não ter uma cláusula
else.

● whilestmt: Define uma instrução de loop while.

● forstmt: Define uma instrução de loop for.

● callfunction: Representa uma chamada de função com zero ou mais
argumentos.

● retrn: Especifica o retorno de um valor em uma função.

● type: Representa um tipo de variável (INT, FLOAT, BOOLEAN ou STRING).

● assignOP: Representa um operador de atribuição (EQ, NEG, LESS, LESSEQ,
GREATER ou GREATEREQ).

● expr: Define uma expressão matemática.

● term: Define um termo em uma expressão matemática.

● factor: Representa um fator em uma expressão matemática ou uma
constante (NUM ou STR).

● boolExpr: Define uma expressão booleana.

● incr: Especifica o tipo de incremento em um loop for.


Tokens

A gramática CMC Grammar define os seguintes tokens:

● INCLUDE: Representa uma diretiva de inclusão.

● GLOB: Representa uma seção de variáveis globais.

● MAIN: Representa a função principal do programa.

● FUNCTION: Representa uma seção de declaração de função.

● WS: Representa um ou mais espaços em branco.

● NL: Representa uma quebra de linha.

● LC: Representa um comentário de linha.

● IF: Representa uma instrução condicional if.

● ELSE: Representa uma cláusula else em uma instrução condicional if.

● FOR: Palavra-chave para indicar a estrutura de repetição "for".

● WHILE: Palavra-chave para indicar a estrutura de repetição "while".

● WRITE: Palavra-chave para indicar a saída de dados na tela.

● READ: Palavra-chave para indicar a entrada de dados pelo usuário.

● RET: Palavra-chave para indicar a instrução de retorno.

● OP: Caractere de abertura de bloco de código ("{").

● CL: Caractere de fechamento de bloco de código ("}").

● SEP: Caractere separador de elementos (",").

● OPP: Caractere de abertura de parênteses ("(").

● CLP: Caractere de fechamento de parênteses (")").

● EOL: Caractere indicando o final de linha (";").

● AT: Operador de atribuição ("=").

● RNG: Operador de range ("...").

● NEG: Operador de negação ("!=").

● EQ: Operador de igualdade ("==").

● PEG: Operador de atribuição de soma ("+=").

● MEG: Operador de atribuição de subtração ("-=").

● LESS: Operador de comparação menor ("<").

● LESSEQ: Operador de comparação menor ou igual ("=<").

● GREATER: Operador de comparação maior (">").

● GREATEREQ: Operador de comparação maior ou igual (">=").

● CALL: Operador de chamada de função ("->").

● TRUE: Palavra-chave representando o valor booleano verdadeiro.

● FALSE: Palavra-chave representando o valor booleano falso.

● PLUS: Operador de soma ("+").

● MINUM: Operador de subtração ("-").

● MULT: Operador de multiplicação ("*").

● DIV: Operador de divisão ("/").

● MOD: Operador de resto ("%").

● INT: Palavra-chave para indicar o tipo de dado inteiro.

● FLOAT: Palavra-chave para indicar o tipo de dado ponto flutuante.

● BOOLEAN: Palavra-chave para indicar o tipo de dado booleano.

● STRING: Palavra-chave para indicar o tipo de dado string.

● ID: Representando o identificador de uma variável, função ou outra entidade
nomeada no programa.

● NUM: Representando um número inteiro ou ponto flutuante.

● STR: Representando uma cadeia de caracteres delimitada por aspas duplas.


EXEMPLOS:

Teste de saída de dados:

![1](https://user-images.githubusercontent.com/85192052/223570320-aec68698-607c-4d8a-bff7-3ae5a3b2b2cd.png)

Teste de variável global:

![2](https://user-images.githubusercontent.com/85192052/223572192-2810996f-0ce1-4d56-a8d5-61ffa7543149.png)

Teste de atribuição e condição:

![3](https://user-images.githubusercontent.com/85192052/223572251-b13ed3ac-59c9-4b0c-8e31-b722e34d54d8.png)

Teste do laço de repetição “while”:

![4](https://user-images.githubusercontent.com/85192052/223572312-51e1e9be-0f9a-4431-ac62-b698a016f406.png)

Teste do laço de repetição “for”:

![6](https://user-images.githubusercontent.com/85192052/223572432-0866daaa-9079-4e2d-98ca-d230a3de206b.png)

Teste de função com retorno

![5](https://user-images.githubusercontent.com/85192052/223572463-776a02c4-3751-41b1-b7ad-a8e2093312c4.png)


