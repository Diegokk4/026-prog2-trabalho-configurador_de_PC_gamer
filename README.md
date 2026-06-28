# 💻 Configurador de PC Gamer

Este projeto é um sistema desktop de configuração de hardware para montagem de PCs gamers. Ele permite que o usuário gerencie o catálogo de peças, monte o setup, monitore o consumo de energia em tempo real e exporte o orçamento final.

## 👥 Integrantes do Grupo
- Diego Oliveira Ricardo

## 🎯 Tema Escolhido
**Configurador de PC Gamer** (Desenvolvido no âmbito da disciplina de Programação de Computadores II).

## 🚀 Funcionalidades (CRUD Implementado)
- **Painel de Administração (CRUD):** Inserção, edição, exclusão e listagem de peças no catálogo do sistema operando via Banco de Dados em Memória (ArrayLists).
- **Montagem Dinâmica:** Escolha de processador, memória RAM, placa de vídeo, armazenamento e periféricos com atualização das tabelas de especificações em tempo real.
- **Monitoramento de Hardware:** Barras de progresso responsivas indicando o consumo de energia (TDP em Watts) e o Score de Desempenho geral da máquina.
- **Limpeza Rápida:** Botão de reset rápido para zerar a build atual e começar um novo orçamento.
- **Exportação:** Geração de um arquivo de texto (`.txt`) contendo o orçamento completo e detalhado.

## 🛠️ Tecnologias Utilizadas
- **Linguagem:** Java (JDK 17+)
- **Interface Gráfica:** Java Swing
- **Design Pattern:** MVC (Model-View-Controller)
- **Gerenciamento de Dependências:** Apache Maven
- **Estilização UI:** FlatLaf (Dark/Light Mode)
- **Ambiente de Desenvolvimento:** Apache NetBeans IDE

## 💻 Instruções para Execução

### Pré-requisitos:
- Tenha o [JDK](https://www.oracle.com/java/technologies/downloads/) instalado e configurado no seu ambiente.
- Tenha o [Apache NetBeans IDE](https://netbeans.apache.org/) instalado.

### Como executar:
1. Clone este repositório para sua máquina local.
2. Abra o NetBeans e vá em `Arquivo` > `Abrir Projeto`.
3. Selecione a pasta raiz deste projeto.
4. Aguarde o Maven realizar o download das dependências (FlatLaf).
5. Localize a classe `Configurador.java` dentro do pacote `com.mycompany.configurador`.
6. Clique com o botão direito na classe e selecione **"Executar Arquivo"** (ou pressione `Shift + F6`).
