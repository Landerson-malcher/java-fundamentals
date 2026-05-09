# UFC Java - Agregação de Classes

Projeto prático desenvolvido durante o curso de ADS para demonstrar o conceito de **agregação** em Orientação a Objetos.

## Conceito

Agregação é um tipo de relacionamento entre classes onde um objeto utiliza outro objeto para funcionar, mas ambos existem de forma independente. Neste projeto, a classe `Luta` agrega objetos do tipo `Lutador` para simular uma luta de UFC.

## Classes

### Lutador
Representa um lutador do UFC com seus atributos e comportamentos individuais.

- Atributos: nome, nacionalidade, idade, altura, peso, vitórias, derrotas, empates
- Métodos: `apresentar()`, `ganharLuta()`, `perderLuta()`, `empatarLuta()`, `getCategoria()`

### Luta
Responsável por organizar e executar uma luta entre dois lutadores.

- Atributos: desafiado, desafiante, rounds, aprovada
- Métodos: `Marcarluta()`, `lutar()`
- A luta só é aprovada se os dois lutadores forem da mesma categoria de peso
- O vencedor é sorteado aleatoriamente entre empate, vitória do desafiante ou vitória do desafiado

### ClasseLutador
Classe auxiliar de apoio às definições do lutador.

### UFCjava
Classe principal com o método `main`. Cria os lutadores, instancia uma luta e executa.

## Como funciona

```java
Lutador l1 = new Lutador("DAVI", "BRASIL", 31, 1.75f, 68.8f, 11, 2, 1);
Lutador l2 = new Lutador("putscrypt", "Brasil", 29, 1.68f, 57.8f, 14, 12, 3);

Luta UFC01 = new Luta();
UFC01.Marcarluta(l1, l2);
UFC01.lutar();
```

Se os lutadores forem de categorias diferentes, a luta não acontece. Caso contrário, o resultado é sorteado e os atributos de cada lutador são atualizados automaticamente.
