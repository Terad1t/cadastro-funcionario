# Etapa 1: build do projeto
FROM maven:3.9.2-eclipse-temurin-17 AS build

WORKDIR /app

# Copia o pom.xml e baixa dependências
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copia o código fonte e builda o jar
COPY src ./src
RUN mvn clean package -DskipTests

# Etapa 2: imagem leve apenas para rodar
FROM eclipse-temurin:17-jre

WORKDIR /app

# Copia o jar da etapa de build
COPY --from=build /app/target/java-postgres-dao-1.0.0.jar ./app.jar

# Comando padrão para rodar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
