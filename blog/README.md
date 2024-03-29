## 2. Exercício do Sistema de Blogs
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

A aplicação é uma classe que faz o acoplamento das regras que
definem os objetos e estruturas que atendem os usuários em relação
aos blogs.

<br>

### Usuario
<br>

Esta classe representa um usuário do sistema de blogs. 
Cada usuário é identificado por um nome e um email único. 
Os usuários são capazes de criar e interagir com blogs, como serem 
donos de blogs, escrever notas e comentários.

<br>

### Blogs
<br>

A classe Blog modela um blog dentro do sistema. Cada blog possui um título,
uma data de criação e um dono, que é um usuário. Além disso, o blog mantém 
uma lista de conteúdos, que podem ser notas ou comentários. 
Os usuários podem criar, visualizar e interagir com os conteúdos do blog.

<br>

### Nota
<br>
Uma subclasse de Conteudo que representa uma nota em um blog. Notas são textos 
escritos pelos usuários para compartilhar informações ou opiniões em um blog 
específico.

<br>

### Comentario
<br>
 Uma subclasse de Conteudo que representa um comentário em uma nota. Comentários 
 são interações feitas pelos usuários em notas existentes, permitindo discussões 
 e feedbacks sobre o conteúdo.

<br>

### Conteudo
<br>

Esta é uma classe abstrata que encapsula os atributos e comportamentos comuns 
entre notas e comentários. Cada conteúdo tem um texto, uma data de criação e 
um autor (usuário que criou o conteúdo).

<br>

