# Engenharia de Software 1 - UFBA
Disciplina: MATA62 - Universidade Federal da Bahia

Este repositório visa registrar meu progresso e aprendizado em Engenharia de Software durante o semestre de 2024.1. Todas as atividades e exercícios realizados estão documentados nos arquivos `<nome-do-exercicio>.txt` em cada pasta. Está contido nesse Readme o resumo de cada atividade.

## Sumário

- [Trabalho Prático](#trabalho-prático)
- [Padrões GRASP, Diagramas de Classes e Diagramas de Sequência](#padrões-grasp-diagramas-de-classes-e-diagramas-de-sequência)
- [Princípios de Projeto](#princípios-de-projeto)
- [Padrões de Projeto](#padrões-de-projeto)
- [Resumo](#resumo)

## Trabalho Prático

**Disponível no repositório:** [Engenharia-De-Software-1-Trabalho-pratico ](https://github.com/BrunoBehrmann/Engenharia-De-Software-1-Trabalho-pratico)

---

## Padrões GRASP, Diagramas de Classes e Diagramas de Sequência

### 1. Sistema de Blogs
Neste exercício, criei um diagrama de classes e implementei o código com POO, focando em herança e encapsulamento para representar o sistema de blogs.

### 2. Criar Nota - Diagrama de Sequência
Desenvolvi um diagrama de sequência usando padrões GRASP como Creator e Baixo Acoplamento para o processo de criar uma nova nota no blog.

### 3. Listar Notas - Diagrama de Sequência
Aqui, trabalhei em um diagrama de sequência com o padrão GRASP Expert para listar as notas de um blog e implementei as chamadas de método necessárias.

### 4. Cliente, Aluguel e Fita - Diagrama de Classes
Criei um diagrama de classes para as entidades Cliente, Aluguel e Fita, detalhando métodos, atributos e relacionamentos com base no código fornecido.

### 5. Listar Filmes Alugados - Diagrama de Sequência
Desenvolvi um diagrama de sequência para listar filmes alugados por um cliente, aplicando os padrões GRASP Expert e Baixo Acoplamento.

### 6. Alugar Fita - Diagrama de Sequência
Desenhei um diagrama de sequência para o método de aluguel de fita, usando o padrão GRASP Creator para gerenciar o processo de aluguel.

### 7. Padrão Expert
Corrigi o código para aderir ao padrão GRASP Expert, ajustando a implementação para melhorar a conformidade com o padrão.

### 8. Criar Comentário - Diagrama de Sequência
Trabalhei em um diagrama de sequência para o método de criar comentário, aplicando os padrões GRASP Expert, Creator e Baixo Acoplamento.

---

## Princípios de Projeto

### 9. Princípio da Responsabilidade Única
Reestruturei um código para seguir o Princípio da Responsabilidade Única (SRP), garantindo que cada classe tenha uma responsabilidade única e clara.

### 10. Princípio da Segregação de Interfaces
Refatorei o código para aplicar o Princípio da Segregação de Interfaces (ISP), dividindo interfaces grandes em menores e mais específicas.

### 11. Princípio da Inversão de Dependências
Apliquei o Princípio da Inversão de Dependências (DIP), removendo dependências diretas e introduzindo abstrações para melhorar a modularidade.

### 12. Princípio Aberto/Fechado
Modifiquei o código com base no Princípio Aberto/Fechado (OCP), permitindo extensões sem modificar as classes existentes.

### 13. Princípios de Projeto em Cálculo de Impostos
Refatorei o código para facilitar mudanças futuras no cálculo de impostos e mecanismo de registro, aplicando OCP e DIP para extensibilidade e flexibilidade.

---

## Padrões de Projeto

### 14. Padrão Strategy
Utilizei o Padrão Strategy para remover o uso de switch-case na classe Fita, criando estratégias diferentes para tipos de fita.

### 15. Padrão State
Implementei o Padrão State para gerenciar estados de um aplicativo de comunicação, permitindo transições suaves entre Offline, Online e Conectado.

### 16. Padrão Singleton
Apliquei o Padrão Singleton aos estados do aplicativo, garantindo que cada estado tenha uma única instância reutilizada durante o ciclo de vida do aplicativo.

### 17. Padrão Observer
Criei um sistema de monitoramento de títulos públicos com o Padrão Observer, notificando sites sobre alterações nos valores dos títulos.

---

## Resumo

Durante o semestre, explorei diversos aspectos da Engenharia de Software, focando em princípios de design e padrões de projeto. Realizei exercícios práticos em diagramas de classes e sequência, e apliquei conceitos como SRP, ISP, DIP e OCP. Além disso, trabalhei com padrões como Strategy, State, Singleton e Observer para aprimorar a estrutura e a eficiência do código.
