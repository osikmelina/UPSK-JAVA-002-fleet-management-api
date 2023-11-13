# API de Software de Gestão de Frotas

## Índice

- [1. Preâmbulo](#1-preâmbulo)
- [2. Resumo do projeto](#2-resumo-do-projeto)
- [3. Objetivos de aprendizagem](#3-objetivos-de-aprendizagem)
- [4. Critérios de aceitação do projeto](#4-critérios-de-aceitação-do-projeto)
- [5. Stack de tecnologia](#5-stack-de-tecnologia)
- [6. Modelo Base](#6-modelo-base)
- [7. Dicas, guias e leituras complementares](#7-dicas-dicas-e-leituras-complementares)
- [8. Edição Hacker](#8-edição-hacker)

---

## 1. Preâmbulo

De acordo com [Wikipedia](https://pt.wikipedia.org/wiki/Internet_das_coisas),
a internet das coisas (IoT, em inglês) é um conceito que se refere à
interconexão digital de objetos cotidianos com a internet. Constitui uma mudança
radical na qualidade de vida das pessoas na sociedade, oferecendo muitas novas
oportunidades de acesso a dados, serviços específicos na educação, segurança,
assistência médica e transporte, entre outros campos.

Em logística e gestão de frotas de automóveis, por exemplo, é possível rastrear
a localização e as condições da carga e dos veículos o tempo todo, por meio de
sensores sem fio conectados à internet que enviam alertas em caso de
eventualidades (atrasos, danos, roubos, etc).

![zach-vessels-utMdPdGDc8M-unsplash](https://user-images.githubusercontent.com/110297/136462570-852fcc55-e363-4262-a8f3-6bb65702e75a.jpg)

A IoT também apresenta desafios como o armazenamento, análise e visualização da
grande quantidade de informações que ela gera. Estima-se que até 2025, os
dispositivos IoT gerem [79,4 zettabytes](https://www.statista.com/statistics/1017863/worldwide-iot-connected-devices-data-size/) (1 zettabyte equivale a 1 trilhão
de gigabytes). Como desenvolvedoras, devemos estar cientes desses desafios e
contribuir para sua resolução com nossa experiência, conhecimento e vontade de
aprender.

## 2. Resumo do projeto

Neste projeto, você construirá a API REST de um
[Software de Gestão de Frotas](https://en.wikipedia.org/wiki/Fleet_management)
para consultar as localizações dos veículos de uma empresa de táxis em Pequim,
China.

Forneceremos milhões de localizações de milheres de táxis. Esperamos
que, como desenvolvedora, você explore novas alternativas e técnicas para
armazenar e consultar essa grande quantidade de informações e possa garantir
a melhor experiência do usuário em sua API REST.

## 3. Objetivos de aprendizagem

Refletir e depois marcar os objetivos que você entendeu e aplicou em seu
projeto. Pense nisso ao decidir sua estratégia de trabalho.

### Java & OOP

- [ ] **Tipos de dados primitivos**
- [ ] **Tipos de dados: primitivos vs não primitivos**
- [ ] **Strings (cadeias de caracteres)**
- [ ] **Arrays (matrizes)**
- [ ] **Modificadores de acesso: `private`**
- [ ] **Modificadores de acesso: `protected`**
- [ ] **Modificadores de acesso: `public`**

- #### Programação Orientada a Objetos (OOP)

  - [ ] **Classes**
  - [ ] **Objetos**
  - [ ] **Métodos**
  - [ ] **Atributos**
  - [ ] **Construtores**
  - [ ] **Encapsulamento**
  - [ ] **Abstração**
  - [ ] **Composição**
  - [ ] **Interfaces**
  - [ ] **Herança: `super`**
  - [ ] **Herança: `extends`**
  - [ ] **Herança: `overrride`**
  - [ ] **Linguagem Unificada de Modelagem (UML): Diagramas de classes**

- [ ] **Variáveis**
- [ ] **Condicionais**
- [ ] **Uso de loops/ciclos**

- #### Coleções

  - [ ] **Listas: ArrayList**
  - [ ] **Mapas: HashMap**
  - [ ] **Conjuntos: HashSet**

- #### Testes

  - [ ] **JUnit**
  - [ ] **Mockito**

### Spring Framework

<details><summary>Links</summary><p>

- [Referência](https://docs.spring.io/spring-framework/reference/)
</p></details>

- [ ] **Spring `initializr`**

- #### Conceitos Principais

<details><summary>Links</summary><p>

- [Tecnologias Principais](https://docs.spring.io/spring-framework/reference/core.html)
</p></details>

* [ ] **Beans**
* [ ] **Inversão de Controle (IoC)**
* [ ] **Anotações**

- #### Spring Boot

<details><summary>Links</summary><p>

- [Referência](https://docs.spring.io/spring-boot/docs/current/reference/html/)
</p></details>

* [ ] **Servlets**
* [ ] **Controllers**
* [ ] **Services**

- #### Spring Data JPA

<details><summary>Links</summary><p>

- [Referência](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/)
</p></details>

* [ ] **Entidade**
* [ ] **Repositório**

- #### Spring Web

<details><summary>Links</summary><p>

- [Criando um Serviço Web RESTful](https://spring.io/guides/gs/rest-service/)
</p></details>

* [ ] **REST Controller**
* [ ] **RequestMapping**
* [ ] **RequestParam**

- #### Testes

  - [ ] **Teste Spring**
  - [ ] **Hamcrest**

### Hibernate ORM

<details><summary>Links</summary><p>

- [O que é um ORM?](https://hibernate.org/orm/what-is-an-orm/)
- [Primeiros Passos](https://docs.jboss.org/hibernate/orm/6.3/quickstart/html_single/)
- [Guia do Usuário](https://docs.jboss.org/hibernate/orm/6.3/userguide/html_single/Hibernate_User_Guide.html)
</p></details>

- [ ] **Configuração e Entidades**

- #### Mapeamento de Entidades

<details><summary>Links</summary><p>

- [Mapeamento de Entidades](https://docs.jboss.org/hibernate/orm/6.3/userguide/html_single/Hibernate_User_Guide.html#EntityMapping)
</p></details>

* [ ] **Entidades**
* [ ] **Tabelas**
* [ ] **Colunas**
* [ ] **Chave Primária**
* [ ] **Chave Estrangeira (Relacionamentos)**
* [ ] **Campos Básicos**
* [ ] **Campos Temporais**

- [ ] **JPQL (Java Persistence Query Language)**

### Banco de Dados & SQL

<details><summary>Links</summary><p>

- [O que é um SGBD?](https://docs.oracle.com/en/database/oracle/oracle-database/19/cncpt/database-architecture.html#GUID-CEBABHDF)
- [Introdução ao SQL](https://docs.oracle.com/en/database/oracle/oracle-database/19/sqlrf/Introduction-to-SQL.html)
</p></details>

- [ ] **Sistemas de Gerenciamento de Banco de Dados (SGBD)**
- [ ] **DDL (Data Definition Language): `CREATE`, `ALTER`, `DROP`**
- [ ] **DML (Data Manipulation Language): `SELECT`, `INSERT`, `UPDATE`, `DELETE`**
- [ ] **Consultas SQL: `JOIN`**
- [ ] **Índices**
- [ ] **Transações**
- [ ] **Programação com SQL**

### APIs & REST

<details><summary>Links</summary><p>

- [O que é REST](https://restfulapi.net/)
- [Introdução ao REST](https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Overview)
- [Documentação JSONPlaceholder](https://jsonplaceholder.typicode.com/)
</p></details>

- [ ] **RESTful API**
- [ ] **Recursos e Rotas (Endpoints)**
- [ ] **Métodos HTTP: `GET`, `POST`, `PUT`, `DELETE`**
- [ ] **Status HTTP: `200`, `201`, `204`, `400`, `401`, `403`, `404`, `500`**
- [ ] **JSON (JavaScript Object Notation)**

### Deploy

<details><summary>Links</summary><p>

- [Preparando-se para a Produção](https://docs.spring.io/spring-boot/docs/current/reference/html/deployment.html)
- [Implantação da Aplicação Spring Boot no Heroku](https://www.heroku.com/deployment)
</p></details>

- [ ] **Variáveis de Ambiente**

### Fundamentos

<details><summary>Links</summary><p>

- [Projeto Frotas](#2-resumo-do-projeto)
</p></details>

- [ ] **Documentação**

### Versionamento

<details><summary>Links</summary><p>

- [Versionamento Semântico 2.0.0](https://semver.org/lang/pt-BR/)
- [Controle de Versão com Git](https://www.atlassian.com/br/git)
</p></details>

- [ ] **Git**
- [ ] **GitHub**

## 4. Critérios de aceitação do projeto

Refletir e marcar as opções que você seguiu ao desenvolver seu projeto.

### Back-end

- [ ] **1. Injeção de Dependências**

  - [ ] A aplicação deve utilizar injeção de dependências do
        Spring (`@Autowired` ou `@Inject`).

- [ ] **2. Modelos de Dados**

  - [ ] A aplicação deve definir modelos de dados para representar as entidades
        do sistema.

- [ ] **3. Repositórios de Dados**

  - [ ] A aplicação deve implementar repositórios de dados (DAOs) para acessar
        as entidades do sistema no banco de dados.

- [ ] **4. Controladores REST**

  - [ ] A aplicação deve implementar controladores REST para expor os recursos
        do sistema por meio da API.

- [ ] **5. Testes de Unidade**

  - [ ] A aplicação deve conter testes de unidade automatizados.

- [ ] **6. Documentação**

  - [ ] A aplicação deve conter uma documentação em Markdown que explique os
        endpoints, modelos e funcionalidades do sistema.

- [ ] **7. Testes de Integração**
  - [ ] A aplicação deve conter testes de integração automatizados.

### Documentação

- [ ] **8. Modelo Base**
  - [ ] A documentação deve seguir o [modelo base](#6-modelo-base) fornecido
        acima.

### Extras

<details><summary>Links</summary><p>

- [Referência: Planejamento de Software](https://aprendizado.mumuki.io/java/aulas/555-planejamento-de-software)
</p></details>

- [ ] **9. Docker**

  - [ ] A aplicação deve utilizar Docker para ser executada em um contêiner.

- [ ] **10. Banco de Dados em Nuvem**

  - [ ] A aplicação deve ser hospedada em um serviço de banco de dados em nuvem.

- [ ] **11. Uso de Cache**

  - [ ] A aplicação deve utilizar caching para melhorar o desempenho em
        operações que são frequentemente executadas.

- [ ] **12. Mensageria**
  - [ ] A aplicação deve implementar comunicação assíncrona por meio de uma
        fila de mensagens.

### Front-end

- [ ] **13. Interface de Usuário**
  - [ ] A aplicação deve ter uma interface de usuário (pode ser em qualquer
        tecnologia).

### Deploy

- [ ] **14. Deploy**
  - [ ] A aplicação deve ser implantada e acessível na web.

## 5. Stack de tecnologia

O propósito dessa seção é definir um conjunto de tecnologias que você possa
utilizar como ponto de partida para desenvolver o projeto. A escolha final
das tecnologias é sua, mas essa lista pode servir como um guia.

- Linguagem: Java
- Framework Back-end: Spring Boot
- Framework ORM: Hibernate
- Banco de Dados: PostgreSQL ou MySQL
- Documentação: Markdown
- Gerenciamento de Dependências: Maven
- Controle de Versão: Git / GitHub
- Deploy: Heroku ou AWS
- Docker (opcional)
- Banco de Dados em Nuvem (opcional)
- Uso de Cache (opcional)
- Mensageria (opcional)
- Interface de Usuário (opcional)

## 6. Modelo Base

- [Projeto Frotas](#2-resumo-do-projeto)

## 7. Dicas, dicas e leituras complementares

<details><summary>Links</summary><p>

- [Versão original](https://github.com/tryber/sd-03-block19-project-frotas/tree/gabrieljony/block19-java-API)
- [Injeção de Dependências](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans)
- [Modelos de Dados](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.entities)
- [Repositórios de Dados](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories)
- [Controladores REST](https://spring.io/guides/gs/rest-service/)
- [Testes de Unidade](https://docs.spring.io/spring/docs/current/spring-framework-reference/testing.html)
- [Documentação em Markdown](https://docs.pipz.com/central-de-ajuda/learning-center/guia-basico-de-markdown#open)
- [Testes de Integração](https://docs.spring.io/spring/docs/current/spring-framework-reference/testing.html#integration-testing)
- [Docker](https://docs.docker.com/get-started/overview/)
- [Banco de Dados em Nuvem](https://aws.amazon.com/pt/rds/)
- [Uso de Cache](https://docs.spring.io/spring-boot/docs/current/reference/html/features.html#features.caching)
- [Mensageria](https://docs.spring.io/spring-framework/docs/current/reference/html/integration.html#spring-integration)
- [Interface de Usuário (UI)](https://www.freecodecamp.org/news/how-to-design-and-develop-a-freecodecamp-guide/)
- [Implantação na Web](https://developer.mozilla.org/pt-BR/docs/Learn/Common_questions/What_is_the_Web/Getting_started)

</p></details>

## 8. Edição Hacker

Você pode explorar as seções do desafio que mais te interessam e escolher as
histórias de usuário e épicos que mais te chamam a atenção, definindo suas
próprias prioridades de acordo com seus objetivos de aprendizado e nível de
confiança. Boa sorte!
