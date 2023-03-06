# Diagrama de Classes do Iphone

#### Autor
- [João Pedro de Carvalho](https://github.com/carvalhaus)

## POO - Desafio

Modelagem e diagramação da representação em UML e Código no que se refere ao componente iPhone.

Com base no vídeo de lançamento do iPhone conforme link abaixo, elabore em uma ferramenta de UML de sua preferência a diagramação das classes e interfaces com a proposta de representar os papéis do iPhone de: Reprodutor Musicial,  Aparelho Telefônico e Navegador na Internet. Em seguida crie as classes e interfaces no formato de arquivos .java

[Lançamento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)

- Minutos relevantes do 00:15 até 00:55

###### Comportamentos esperados:
* Reprodutor Musicial: tocar, pausar, selecionarMusica
* Aparelho Telefônico: ligar, atender, iniciarCorrerioVoz
* Navegador na Internet: exibirPagina, adicionarNovaAba, atualizarPagina


## Realização projeto

O foco desse projeto foi a utilização do paradigma de Programação Orientada a Objetos, com a utilização de classes e objetos.

Foram criadas as classes:
* Iphone;
* AplicacaoEscolhia;
* ReprodutorMusical;
* AparelhoTelefonico;
* NavegadorInternet;

Na classe *Iphone* é executado o algoritmo que interaje com o usuário, solicitando para que o mesmo escolha qual aplicação deseja utilizar, e a partir desse escolha, através de uma estrutura condicional (*Switch-Case*) são executados os métodos de cada aplicação.

Neste projeto tive a oportunidade de utilizar todos os pilares da POO que são o **Encapsulamento**, a **Herança**, a **Abstração** e o **Polimorfismo**.