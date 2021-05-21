<h1 align="center">Hangman - The Game</h1>

> Backend of an application for the Hangman game.<br>
> RESTful API built using Java with Spring Boot.<br>
> The frontend application that consumes this API can be found in the following repository: [Frontend](https://github.com/leonardongl/hangman-web).<br>
> If you want to know more about the Hangman game go to [Wikipedia](https://en.wikipedia.org/wiki/Hangman_(game)).

## Prerequisites
- Java >= 11
- Maven >= 3
- IDE (Preferably IntelliJ or Eclipse)

## Cloning project
```sh
$ git clone https://github.com/leonardongl/hangman-api.git
```

## How to build
- After cloning the project, open it in the IDE of your choice
- Build the project as a Maven application
- Run the application
- If you have any questions, watch this [video](https://www.youtube.com/watch?v=iWfIR2nc69A&ab_channel=TotalCross)

## How to play
- To play, you need to build the frontend of this application that is mentioned above or access the following website [Hangman](http://hangman.noronhaleao.com.br/)

## Endpoints
- Return a random word to play
```sh
{BASEURL}/words/get-word
```
- Pass a <b>{index}</b> and a <b>{text}</b> as parameter and returns the word if you got it right
```sh
{BASEURL}/words/guess-word/{index}/{text}
```
- Pass a <b>{index}</b> and a <b>{letter}</b> as parameter and returns the positions where that letter appears in the word
```sh
{BASEURL}/words/find-letter/{index}/{letter}
```

## Automated and Unit Tests
- Unit tests were implemented using JUnit 5 for each endpoint
- You can find it in [WordControllerTests](https://github.com/leonardongl/hangman-api/blob/master/src/test/java/com/leonardongl/hangman/controllers/WordControllerTest.java)

## Deploy
- The API was deployed in [Heroku](https://www.heroku.com/) and can be consumed following the endpoints above with the following BASEURL: https://damp-depths-34440.herokuapp.com/
- You can use a API client tool to consumes, like [Postman](https://www.postman.com/)

## Author
👤 **Leonardo Augusto Noronha Leão**

* Github: [@leonardongl](https://github.com/leonardongl)
* LinkedIn: [@leonardo-augusto-noronha-leão](https://linkedin.com/in/leonardo-augusto-noronha-leão-338bb118b)