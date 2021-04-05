
Repositório abrange conceitos de de menssageria, algo também usado para,
processar lotes com grande quantidade de dados, processo de pagamentos,
geração de relatórios, etc.

### Tecnologias
* Backend
  * Spring Boot
* Processamento de Filas
  * RabbitMQ
* Documentação das APIS
  * Swagger
* Banco de dados
  * Postgresql
  * MongoDB
* Docker

### Execução
Para executar ó sistema será necessário ter JDK, Docker e Docker Compose instalados na máquina.
Após instalação dos mesmos a primeira parte a executar é o docker, abrindo a pasta do projeto,
poderá ir no terminal da sua preferencia e rodar:

```
docker-compose up -d
```

Após a execução do comando poderá validar os serviços foram iniciados, conforme seu respectivo S.O:

###### WINDOWS/MAC/Linux
Poderá ir no terminal de sua preferencia, e digitar o comando:
 ```
 docker container ps
 ```
 
 ###### WINDOWS/MAC
 Para usuários de windows e Mac mais especificamente o Windows 10 Pro, e tiverem o app Docker Desktop poderá abri-lo e verificar se os containers foram iniciados na Aba **Containers/Apps**, clicar no app **poc-sl** o status dos containers deve start **Running**
  
 
Após isso poderá ir na Idea que preferir, VSCode, Intellij, NetBeans, SpringTools, e iniciar as Aplicaçoes.

### Conclusões
Projeto ainda em desenvolvimento.
