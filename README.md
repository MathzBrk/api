# API REST de Médicos e Pacientes

Este projeto é uma API REST desenvolvida em Java com Spring Boot, que permite realizar operações CRUD (Criar, Ler, Atualizar, Deletar) para médicos e pacientes, além de cadastrar consultas médicas. O sistema também implementa autenticação segura e documentação interativa para facilitar o uso da API.

## Funcionalidades

- **CRUD de Médicos:** Gerencie informações de médicos como nome, especialidade, e outros atributos relevantes.
- **CRUD de Pacientes:** Mantenha o cadastro de pacientes com informações pessoais e de contato.
- **Cadastro de Consultas:** Registre consultas médicas, vinculando médicos e pacientes.
- **Autenticação JWT:** Garanta o acesso seguro à API através de tokens JWT.
- **Validação de Dados:** Validação de dados dos DTOs utilizando Bean Validation.
- **Documentação com Swagger:** Visualize e teste a API diretamente no navegador.

## Tecnologias Utilizadas

- **Java 17**: Linguagem principal do projeto.
- **Spring Boot**: Framework para o desenvolvimento da API.
- **MySQL**: Banco de dados relacional para armazenar informações.
- **Spring Data JPA**: Para o mapeamento objeto-relacional (ORM).
- **Flyway**: Gerenciamento e versionamento do banco de dados.
- **Spring Security**: Implementação de segurança na aplicação.
- **JWT (JSON Web Tokens)**: Para autenticação segura.
- **Lombok**: Redução de boilerplate no código.
- **Bean Validation**: Validação de campos nos DTOs.
- **JUnit**: Testes unitários para controllers e repositórios.
- **Swagger**: Documentação interativa da API.

## Instalação e Configuração

1. **Clone o Repositório:**
   ```bash
   git clone https://github.com/MathzBrk/api
   ```

2. **Configure o Banco de Dados:**
   Certifique-se de que o MySQL está instalado e rodando. Crie um banco de dados para a aplicação.

3. **Configure o `application.properties`:**
   Edite as configurações de conexão do banco de dados:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/nome_do_banco
   spring.datasource.username=seu_usuario
   spring.datasource.password=sua_senha
   ```

4. **Execute as Migrações do Banco de Dados:**
   As migrações serão aplicadas automaticamente pelo Flyway ao iniciar a aplicação.

5. **Instale as Dependências:**
   Use o Maven para instalar as dependências do projeto:
   ```bash
   mvn clean install
   ```

6. **Execute a Aplicação:**
   ```bash
   mvn spring-boot:run
   ```

7. **Acesse a Documentação:**
   Acesse o Swagger para testar a API:
   ```
   http://localhost:8080/swagger-ui.html
   ```

## Endpoints Principais

### Médicos
- **GET** `/api/medicos`: Lista todos os médicos.
- **POST** `/api/medicos`: Adiciona um novo médico.
- **PUT** `/api/medicos`: Atualiza as informações de um médico.
- **DELETE** `/api/medicos/{id}`: Remove um médico.

### Pacientes
- **GET** `/api/pacientes`: Lista todos os pacientes.
- **POST** `/api/pacientes`: Adiciona um novo paciente.
- **PUT** `/api/pacientes`: Atualiza as informações de um paciente.
- **DELETE** `/api/pacientes/{id}`: Remove um paciente.

### Consultas
- **POST** `/api/consultas`: Cadastra uma nova consulta.

## Testes

Os testes foram implementados com JUnit para garantir a qualidade do código:
- Testes de controladores para validar as regras de negócio.
- Testes de repositórios para verificar a persistência de dados.


**Desenvolvedor:** Matheus  
Sinta-se à vontade para entrar em contato para dúvidas ou sugestões!
