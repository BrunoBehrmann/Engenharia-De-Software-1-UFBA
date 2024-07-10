## 1. Exercício Sistema de Blogs
* SEMESTRE:   2024.1
* DOCENTE:    Claudio Nogueira Santana
* DISCENTE: Bruno de Sousa Behrmann

## Descrição da atividade

Considere os requisitos do sistema de blog descritos abaixo. Desenhe o diagrama de classes em alguma ferramenta de sua preferência (sugestão draw.io). No diagrama, desenhar as classes, atributos, relacionamentos, multiplicidade e navegabilidade. Nas classes, basta colocar os atributos. Não é necessário colocar métodos.

Além disso, escreva o código correspondente ao diagrama de classes em qualquer linguagem orientada a objetos.

Faça aqui na atividade o upload da imagem do diagrama (arquivo de imagem) e dos arquivos do código fonte. 

Requisitos
* Um blog tem um título e uma data de criação e além disso é um conjunto de conteúdos.

* Estes conteúdos podem ser notas ou comentários sobre as notas. Tanto notas quanto comentários têm características comuns como o texto e a data de sua criação.

* Todo usuário possui um e-mail que deve ser único, ou seja, não há mais de um usuário com o mesmo e-mail)

* O sistema deve:

    Permitir a criação de blogs
    Permitir a utilização de blogs
        Qualquer usuário pode ler conteúdos
        Somente o dono do blog pode criar notas
        Qualquer usuário pode criar comentários. Para criar um comentário o usuários precisa ler as notas.
        Somente o dono do blog pode remover conteúdos. Para remover um conteúdo ele precisará ler o conteúdo. Caso ele remova um comentário, o autor do comentário deve ser notificado por e-mail.

## Para fins de organização
<br>

Neste projeto são utilizadas as versões:<br>
Eclipse IDE 2024-3<br>
Java version 1.8.0_202<br>
JRE JavaSE-17<br><br>

Como a aplicação encontra-se modularizada, os principais módulos,
dentre os arquivos com extensão (.java), são: <br>
* main.java : onde se encontra o módulo principal. Nela contem os
exemplos de criação e utilização das classes.

* Aplicacao.java : que contém uma parte dos relacionamentos de classe
<br>

## Para compilar

Na interfacel do Eclipse IDE siga o caminho e selecione: Project -> Build Automatically

<br>

## Para executar (testar)
Abra o arquivo no Ecclipse IDE e pressione F11

## Descrição das classes

### Aplicação
<br>

A classe Aplicação é responsável por coordenar as interações do usuário com o sistema de blogs. 
Ela gerencia a criação de usuários, blogs, notas, comentários e outras operações relacionadas à 
interação do usuário com o sistema. A classe também controla o fluxo de execução da aplicação, 
apresentando menus e direcionando o usuário para as funcionalidades desejadas.

<br>

### Blog
<br>

A classe Blog representa um blog dentro do sistema. Cada blog possui um título, uma data de criação, 
um dono (usuário) e uma lista de notas associadas a ele. Esta classe permite a criação e remoção de 
notas dentro do blog, bem como a obtenção de informações sobre o blog, como título, data de criação 
e notas associadas.

<br>

### Comentário
<br>

A classe Comentário representa um comentário feito em uma nota dentro de um blog. Cada comentário 
possui um texto, um ID único, um autor (usuário) e uma data de criação. Esta classe permite a criação
e remoção de comentários, bem como a obtenção de informações sobre o comentário, como texto, autor e 
data de criação.

<br>

### Conteúdo
<br>

A classe Conteúdo é uma classe abstrata que serve como base para outros tipos de conteúdo dentro do 
sistema de blogs. Ela possui informações comuns a diferentes tipos de conteúdo, como texto, data de criação,
autor e o blog ao qual o conteúdo está associado. Esta classe permite a obtenção de informações sobre o 
conteúdo, como texto, data de criação, autor e blog associado.

<br>

### Main
A classe Main serve como ponto de entrada da aplicação. Ela contém o método main, que inicia a execução 
da aplicação, criando uma instância da classe Aplicação e chamando o método iniciar() para iniciar a 
interação com o usuário.

### Nota
<br>

A classe Nota representa uma nota dentro de um blog. Cada nota possui um texto, uma data de criação, um
autor (usuário) e uma lista de comentários associados a ela. Esta classe permite a criação e remoção de 
comentários em uma nota, bem como a obtenção de informações sobre a nota, como texto, data de criação 
e comentários associados.

<br>

### Usuário
<br>

A classe Usuário representa um usuário dentro do sistema de blogs. Cada usuário possui um nome, um e-mail
e uma lista de blogs associados a ele. Esta classe permite a adição e remoção de blogs associados a um 
usuário, bem como a obtenção de informações sobre o usuário, como nome, e-mail e blogs associados.

<br>

