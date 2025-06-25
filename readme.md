# Sistema de Autenticação com JWT - Spring Boot

Projeto backend em Java 21 com Spring Boot para autenticação e autorização de usuários utilizando JWT (JSON Web Token).

---

## \:rocket: Tecnologias utilizadas

- Java 21
- Spring Boot 3
- Spring Security
- Spring Data MongoDB
- JWT (jjwt 0.11.5)
- BCrypt (para criptografia de senha)
- MongoDB
- Postman (testes)

---

## \:wrench: Funcionalidades implementadas

-

---

## \:file\_folder: Estrutura do projeto

```
src/main/java/com/seu_pacote
├── config            # Configuração de segurança
├── controller        # Endpoints REST
├── dto              # Objetos de transferência (Request/Response)
├── entity            # Modelo de dados (User)
├── repository        # Interface com MongoDB
├── security          # JwtUtil e Filtro JWT
├── service           # Regras de negócio
```

---

## \:lock: Endpoints disponíveis

### POST `/auth/register`

Registra um novo usuário.

#### Body (JSON):

```json
{
  "username": "rodrigo",
  "email": "rodrigo@email.com",
  "password": "123456"
}
```

### POST `/auth/login`

Realiza login e retorna um JWT válido.

#### Body (JSON):

```json
{
  "email": "rodrigo@email.com",
  "password": "123456"
}
```

#### Resposta:

```json
{
  "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6..."
}
```

### GET `/protected`

Endpoint protegido, acessível apenas com token válido.

#### Header:

```
Authorization: Bearer SEU_TOKEN_AQUI
```

#### Resposta:

```
Acesso permitido! Token JWT válido.
```

---

## \:gear: Configuração da chave JWT

No arquivo `application.yml`:

```yaml
app:
  jwt:
    secret: SUA_CHAVE_BASE64_SEGURA
```

> Recomendado: usar uma chave gerada com 32 bytes base64 (256 bits)

Exemplo de geração (PowerShell):

```powershell
[Convert]::ToBase64String((1..32 | ForEach-Object { Get-Random -Minimum 0 -Maximum 256 }))
```

---

## \:clipboard: Requisitos para rodar o projeto

- Java 21
- MongoDB rodando localmente (porta 27017)

---

## \:bookmark\_tabs: Instruções para executar

```bash
git clone https://github.com/seuusuario/sistema-autenticacao-jwt.git
cd sistema-autenticacao-jwt
mvn clean install
mvn spring-boot:run
```

---

## \:memo: Licença

Este projeto está licenciado sob a Licença MIT.

---

## \:handshake: Contato

Rodrigo Oliveira\
[LinkedIn](https://www.linkedin.com/in/rodrigo-oliveira-b71633170/)\
Email: r.oliveira.95\@hotmail.com

