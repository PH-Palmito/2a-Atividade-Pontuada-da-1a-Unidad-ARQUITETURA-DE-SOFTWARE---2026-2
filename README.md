
Smart Home - 2ª Atividade Pontuada de Arquitetura de Software

Este repositório contém a entrega da 2ª Atividade Pontuada da 1ª Unidade da disciplina de Arquitetura de Software. O projeto consiste na simulação de um sistema para uma Casa Inteligente (Smart Home) desenvolvido em Java, com o objetivo de aplicar conceitos avançados de arquitetura e padrões de projeto (Design Patterns).

📌 Sobre o Projeto

O sistema simula o gerenciamento de diversos dispositivos inteligentes em uma residência, como Lâmpadas, Geladeiras, Televisões, Câmeras de Segurança e Termostatos. A arquitetura foi desenhada para ser altamente extensível, permitindo adicionar novos comportamentos e interagir com os dispositivos de forma padronizada sem ferir os princípios de design de software (SOLID).

🛠️️ Padrões de Projeto Aplicados

A estrutura do código foi dividida em pacotes específicos para cada Design Pattern implementado:

1. Padrão Decorator (src/decorator)

Utilizado para adicionar funcionalidades dinamicamente aos dispositivos sem alterar a estrutura de suas classes base.

Componentes Base: GeladeiraInteligente, LampadaInteligente, TelevisaoInteligente.

Decorators:

MonitoramentoEnergiaDecorator: Adiciona a capacidade de monitorar o consumo elétrico do dispositivo.

NotificacaoDecorator: Adiciona a funcionalidade de emitir alertas e notificações do dispositivo para o usuário.

2. Padrão Iterator (src/iterator)

Implementado para prover uma maneira sequencial de acessar os dispositivos instalados na casa inteligente, ocultando a complexidade da estrutura de armazenamento interno.

Componentes: CasaInteligente (Agregador), DispositivoIterator (Iterador) e DispositivoCasa. Permite percorrer todos os equipamentos da casa de forma limpa e padronizada.

3. Padrão Visitor (src/visitor)

Utilizado para separar os algoritmos dos objetos sobre os quais eles operam. Permite adicionar novas operações aos dispositivos sem precisar modificar as classes dos mesmos (Open/Closed Principle).

Elementos (Visitable): CameraSeguranca, LampadaInteligente, TermostatoInteligente (DispositivoVisitable).

Visitors:

ConsumoEnergiaVisitor: Calcula e coleta relatórios de consumo de energia de diferentes tipos de dispositivos.

ManutencaoVisitor: Avalia os dispositivos e agenda/sugere manutenções baseadas no tipo de equipamento.

🚀 Tecnologias e Ferramentas

Linguagem: Java

Gerenciador de Dependências: Maven (pom.xml)

IDE Recomendada: IntelliJ IDEA / Eclipse / VS Code

📁 Estrutura do Projeto

smarthome/
├── src/
│   ├── application/       # Ponto de entrada do sistema (Main.java)
│   ├── decorator/         # Implementação do padrão Decorator
│   ├── iterator/          # Implementação do padrão Iterator
│   └── visitor/           # Implementação do padrão Visitor
└── pom.xml                # Configuração do Maven


⚙️ Como Executar

Por ser um projeto gerenciado pelo Maven, a execução é bem simples:

Clone o repositório para a sua máquina:

git clone https://github.com/PH-Palmito/2a-Atividade-Pontuada-da-1a-Unidad-ARQUITETURA-DE-SOFTWARE---2026-2.git


Abra a pasta do projeto na sua IDE de preferência.

Se estiver usando o terminal com Maven instalado, você pode compilar o projeto com:

mvn clean install


Execute a classe principal localizada em:
src/application/Main.java

Projeto desenvolvido para a disciplina de Arquitetura de Software - Semestre 2026.2
