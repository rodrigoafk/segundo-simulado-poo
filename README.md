* Aluno: Rodrigo Macedo Amancio
* Curso: Sistemas de Informação
* Matrícula: 599575
* Disciplina: Programação Orientada a Objetos

---

## Questão 1

b) O trecho compila? Justifique usando o conceito de relação "é um".

- O primeiro trecho (Cliente c = new ClienteVip(...)) compila, pois todo ClienteVip é um Cliente. A classe filha pode assumir a forma da classe pai.
- O segundo trecho (ClienteVip v = new Cliente(...)) não compila. Nem todo Cliente é um ClienteVip. A variável do tipo da filha não pode apontar para um objeto da classe pai sem um cast explícito, pois o pai não possui os atributos e comportamentos específicos da filha.

---

## Questão 2 

b) 1. Por que new Produto(...) não compila? Que vantagem isso traz para o projeto?
Não compila porque Produto é uma classe abstrata e não pode ser instanciada. A vantagem é que ela serve como um molde seguro para garantir que as subclasses tenham os mesmos atributos e comportamentos, evitando que um "Produto genérico" e sem regras específicas seja criado no sistema.

b) 2. exibirResumo() está em Produto, mas chama um método que Produto não implementa. Explique por que isso funciona.
Funciona graças ao polimorfismo e herança. O método exibirResumo() sabe que, em tempo de execução, o objeto será obrigatoriamente uma das subclasses concretas instanciadas. Como essas subclasses são obrigadas a implementar o calcularPrecoFinal(), o método da subclasse será o executado.

---

## Questão 3 - Interfaces

c) 1. Por que Entregavel foi feita como interface, e não como mais uma classe abstrata na hierarquia de Produto?
Porque Entregavel representa um comportamento adicional, e não a identidade do objeto. Além disso, o Java não permite herança múltipla de classes. Se fosse classe abstrata, ProdutoFisico não poderia usar extends Produto e extends Entregavel ao mesmo tempo.

c) 2. Cite duas diferenças entre interface e classe abstrata em Java.
1. Atributos: Classes abstratas permitem atributos comuns, enquanto interfaces só aceitam atributos static final (constantes).
2. Herança/Implementação: Uma classe pode herdar (extends) de apenas uma classe abstrata, mas pode implementar (implements) várias interfaces simultaneamente.

---

## Questão 4 - Polimorfismo

b) Qual a saída do código e qual mecanismo decide qual versão do método é executada?

Saída:
Teclado: 110.0
E-book Java: 47.5
Streaming: 108.0

Mecanismo: É o Polimorfismo (ligação dinâmica). Embora a lista utilize o tipo genérico Produto como referência, em tempo de execução a JVM identifica o tipo real do objeto instanciado na memória (Fisico, Digital ou Assinatura) e executa o calcularPrecoFinal() específico de cada um.

c) A linha p1.calcularFrete("60000-000"); compila? Se não, reescreva-a e explique.

Não compila. A referência p1 é do tipo Produto, e essa classe não possui o método calcularFrete() (ele pertence apenas à interface Entregavel / classe ProdutoFisico).
- Correção: ((Entregavel) p1).calcularFrete("60000-000");
- Explicação: O tipo da referência (Produto) dita o que o compilador deixa você chamar. O tipo do objeto real (ProdutoFisico) diz à JVM como o método vai rodar na hora da execução.

---

## Questão 5 - Exceções

b) Qual a saída do trecho abaixo (considerando estoque = 3 e tentativa de adicionar 10)?

Saída:
B: Estoque insuficiente para Teclado. Disponível: 3
C
D

Explicação: O try tenta adicionar 10 itens, estourando o limite de 3. Isso lança a exceção imediatamente (pulando a impressão do "A"). O catch captura e imprime a mensagem (B). O bloco finally sempre é executado ao final (imprimindo C). Após isso, o fluxo do programa segue normalmente (imprimindo D).

c) Por que o compilador obriga a tratar EstoqueInsuficienteException e não PagamentoRecusadoException? Em que situação usar cada?
O compilador obriga a tratar EstoqueInsuficienteException porque ela herda de Exception (é Checked). Já PagamentoRecusadoException herda de RuntimeException (é Unchecked).
- Quando usar Checked: Falhas previsíveis na regra de negócio das quais o sistema ou usuário podem se recuperar facilmente (ex: alertar falta de estoque para alterar a quantidade).
- Quando usar Unchecked: Erros de lógica do programador ou falhas sistêmicas que quebram o fluxo sem uma recuperação imediata esperada no momento do erro (ex: transação negada por falta de limite no cartão).
