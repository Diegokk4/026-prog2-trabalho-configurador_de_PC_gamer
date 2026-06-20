Configurador de PC Gamer
Este projeto consiste em um sistema de configuração de hardware para montagem de PCs gamers, permitindo que o usuário selecione componentes, visualize especificações técnicas, monitore o consumo de energia e desempenho, e exporte um orçamento final.

Integrantes do Grupo
Diego Oliveira Ricardo

Tema Escolhido
Configurador de PC Gamer (Desenvolvido no âmbito da disciplina de Programação de Computadores II).

Funcionalidades
Seleção de Hardware: Escolha de processador, memória RAM, placa de vídeo, armazenamento e periféricos via JComboBox.
Validação em Tempo Real: Atualização automática de especificações em tabelas (JTable) e cálculo de orçamento.
Monitoramento: Barras de progresso (JProgressBar) indicando consumo de energia (TDP) e Score de desempenho.
Opcionais: Checkboxes para adição de periféricos extras (Cooler, RGB, Garantia).
Exportação: Geração de um arquivo .txt contendo o resumo da build configurada.
Design Moderno: Interface estilizada utilizando a biblioteca FlatLaf (Dark Mode).

Tecnologias Utilizadas
Linguagem: Java (JDK 17+)
Interface Gráfica: Java Swing
Gerenciamento de Dependências: Apache Maven
Estilização: FlatLaf
Ambiente de Desenvolvimento: Apache NetBeans IDE

Instruções para Execução

Pré-requisitos:
Tenha o JDK (https://www.oracle.com/java/technologies/downloads/) instalado e configurado no seu ambiente.
Tenha o Apache NetBeans IDE (https://netbeans.apache.org/) instalado.

Como executar:
Clone este repositório para sua máquina local.
Abra o NetBeans e vá em Arquivo > Abrir Projeto.
Selecione a pasta raiz deste projeto.
Aguarde o Maven realizar o download das dependências (FlatLaf).
Localize a classe Configurador.java dentro do pacote com.mycompany.configurador.
Clique com o botão direito na classe e selecione "Executar Arquivo" (ou pressione Shift + F6).
