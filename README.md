# SmartHome Manager — Padrão Visitor

Projeto acadêmico da UCSAL para demonstrar o padrão de projeto **Visitor** em Java.

## Integrantes

- Nome do aluno responsável pelo Visitor: __________________
- Demais integrantes: __________________

## 1. Objetivo

O projeto simula um sistema de automação residencial com lâmpadas inteligentes, termostatos e câmeras de segurança.

O padrão Visitor é utilizado para executar operações sobre diferentes tipos de dispositivos sem colocar todas essas operações dentro das classes dos dispositivos.

## 2. O que é o Visitor?

Visitor é um padrão comportamental que permite adicionar novas operações a uma estrutura de objetos sem modificar as classes desses objetos.

A estrutura possui elementos visitáveis, que implementam `DispositivoVisitable`, e visitantes, que implementam `DispositivoVisitor`.

Cada elemento possui o método `aceitar(visitor)`. Esse método chama o método de visita correspondente ao seu tipo:

```java
@Override
public void aceitar(DispositivoVisitor visitor) {
    visitor.visitar(this);
}
```

Esse mecanismo é conhecido como **Double Dispatch**, pois a operação escolhida depende do tipo do Visitor e do tipo concreto do dispositivo.

## 3. Problema do mundo real

Uma casa inteligente possui vários dispositivos. O sistema precisa executar operações diferentes:

- Calcular a potência nominal total dos dispositivos.
- Gerar recomendações de manutenção.

Uma alternativa seria colocar métodos de consumo e manutenção em todas as classes. Isso aumentaria o acoplamento e misturaria responsabilidades.

Com Visitor, cada operação fica em uma classe própria.

## 4. Participantes do padrão

### Elementos visitáveis

- `LampadaInteligente`
- `TermostatoInteligente`
- `CameraSeguranca`

Todas implementam `DispositivoVisitable`.

### Visitor

- `DispositivoVisitor`: interface que declara os métodos de visita.

### Visitors concretos

- `ConsumoEnergiaVisitor`: soma a potência nominal dos dispositivos.
- `ManutencaoVisitor`: gera mensagens de manutenção e conta os dispositivos analisados.

## 5. Funcionamento

O `Main` cria uma lista de dispositivos e dois Visitors:

```java
ConsumoEnergiaVisitor consumo = new ConsumoEnergiaVisitor();
ManutencaoVisitor manutencao = new ManutencaoVisitor();
```

Depois, cada dispositivo aceita os dois visitantes:

```java
for (DispositivoVisitable dispositivo : dispositivos) {
    dispositivo.aceitar(consumo);
    dispositivo.aceitar(manutencao);
}
```

## 6. Resultado esperado

```text
Consumo analisado: Lâmpada da Sala
Manutenção: verificar vida útil da Lâmpada da Sala
Consumo analisado: Termostato do Quarto
Manutenção: verificar sensor do Termostato do Quarto
Consumo analisado: Câmera da Garagem
Manutenção: verificar lente e conexão da Câmera da Garagem

Potência total nominal: 75.0 W
Dispositivos analisados: 3
```

> Observação: a potência total é a soma da potência nominal cadastrada. Não representa consumo real em kWh, pois o cálculo real exigiria o tempo de funcionamento.

## 7. Vantagens

- Novas operações podem ser criadas em novos Visitors.
- As classes dos dispositivos permanecem focadas em seus próprios dados.
- As operações ficam organizadas e separadas.
- O padrão utiliza polimorfismo e Double Dispatch.

## 8. Limitações

- Adicionar um novo tipo de dispositivo exige alterar `DispositivoVisitor`.
- O número de classes pode aumentar.
- O padrão é mais adequado quando existem vários tipos de elementos e várias operações sobre eles.

## 9. Tecnologias

- Java 17
- Maven
- JUnit 5
- Git/GitHub

## 10. Como executar

Compile:

```bash
mvn clean compile
```

Execute os testes:

```bash
mvn test
```

Execute a classe `br.ucsal.smarthome.Main` pela IDE.

## 11. Relação com o trabalho em grupo

Este módulo implementa exclusivamente o padrão Visitor. Os padrões Decorator e Iterator devem ser desenvolvidos pelos demais integrantes em seus próprios pacotes.

## 12. Referência

GAMMA, Erich et al. *Design Patterns: Elements of Reusable Object-Oriented Software*. Addison-Wesley.
