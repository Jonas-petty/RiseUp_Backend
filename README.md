# 🛫 Rise Up - Back-End  

Esse repositório é direcionado à API referente ao  Back-end da solução RiseUp  
que faz parte do desafio proposto pela empresa Accenture durante  
a residência de Software do Porto Digital.

## Ferramentas Utilizadas:

- Java JDK
- Spring Framework
- Maven
- PostgreSQL

## 🔧 Como utilizar:

### Pre requisitos:

- Java JDK
- Maven
- IDE ex.: VSCode, IntelliJ, Eclipse, NetBeans
- Uma database no PostgreSQL chamada riseup


Obs: Use a IDE para rodar o programa.

* Execute a Classe `RiseupBackendApplication.java`;
* A API deve estar funcionando na porta `8080`

### Endereços para utilização:

Para Adicionar um novo usuário  
POST`http:localhost:8080/usuario` 

Para Exibir todos os usuários cadastrados  
GET`http:localhost:8080/usuarios` 

Para Exibir um usuário expecífico  
GET`http:localhost:8080/usuario/id`

Para fazer um update em um usuário    
PUT`http:localhost:8080/usuario/id`

Para Deletar um usuário  
DELETE`http:localhost:8080/usuario/id` 

obs: O objeto do Usuário de ser:  
```json
{
    "nome": "Nome do Usuário",
    "email": "emailDoUsuario@email.com",
    "senha": "senhaUsuario123"
}
```

---

## Propostas Futuras:

- Adicinar todas as entidades restantes e seus métodos REST
- Integrar com o Front-end
- Hospedar a API em algum serviço de nuvem, faciltando sua utilização

