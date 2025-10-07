
### Pré-requisitos

- Java 17 ou superior
- Maven 3.6 ou superior
- Git


### 1. Build do Projeto

Para compilar o projeto:

```bash
mvn clean compile
```

### 2. Executar Testes

Para executar todos os testes:

```bash
mvn test
```

Para executar apenas os testes da calculadora:

```bash
mvn test -Dtest=CalculadoraSalarioTest
```

### 3. Gerar JAR

```bash
mvn package
```

### 4. Limpar Build

```bash
mvn clean
```

