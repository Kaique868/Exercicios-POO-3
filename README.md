# Resposta Questão 4
## Diferença Fundamental
Array de Tipos Primitivos (``int[], double[], char[]``): Cada posição do array armazena diretamente o valor literal (o número ou dado real).

Array de Objetos ``(Aluno[], Produto[], String[])``: Cada posição do array armazena apenas uma referência (um endereço de memória) que aponta para onde o objeto real está localizado na memória, e não o objeto em si.



**a) Como a memória é alocada em cada caso?**
 
Array de Primitivos:
Quando você cria um array como ``int[] numeros = new int[3];``, o Java aloca um único bloco contíguo de memória na heap. Cada uma das 3 posições desse bloco guarda diretamente o valor numérico (por padrão, inicializados com 0).


Array de Objetos:
Quando você cria um array de objetos como ``Aluno[] turma = new Aluno[3];``, o Java aloca um bloco contíguo de memória na heap, mas esse bloco guarda apenas referências (ponteiros). Inicialmente, todas as posições recebem o valor especial null. Os objetos reais precisam ser criados separadamente (com o operador new) e atribuídos a cada posição do array (ex: ``turma[0] = new Aluno("Ana");``).



**b) Quais cuidados devem ser tomados ao acessar elementos de um array de objetos?**

O principal cuidado ao lidar com arrays de objetos é o risco de ``NullPointerException``.

**O problema:** Como as posições de um array de objetos recém-criado iniciam como ``null``, tentar chamar um método ou acessar um atributo de uma posição que ainda não recebeu um objeto válido causará uma exceção e encerrará o programa abruptamente.

**A solução:** Sempre verifique se a posição do array é diferente de ``null`` antes de tentar interagir com o objeto, ou garanta que todas as posições foram devidamente inicializadas com instâncias válidas antes de usá-las em laços de repetição.
