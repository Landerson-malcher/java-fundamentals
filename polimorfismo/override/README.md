# Sobreposicao (Override)

Estudo do conceito de **sobreposicao de metodos** em Java, um dos pilares do Polimorfismo.

## O que e

Sobreposicao (override) acontece quando uma classe filha reescreve um metodo que ja existe na sua classe pai, mudando o comportamento mas mantendo a mesma assinatura (nome e parametros).

## Estrutura do projeto

Este projeto simula uma hierarquia de animais, onde a classe `Animal` define comportamentos genericos (`emitirSom`, `locomover`, `alimentar`), e cada subclasse (`Cachorro`, `Ave`, `Peixe`, `Reptil`, `Mamifero`, entre outras) sobrepoe esses metodos com seu proprio comportamento especifico.

## Conceitos aplicados

- Heranca (`extends`)
- Anotacao `@Override`
- Polimorfismo (tratando diferentes subclasses como o tipo `Animal`)
