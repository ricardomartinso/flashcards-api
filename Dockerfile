FROM maven:3.8.3-openjdk-17
WORKDIR /home/app
COPY pom.xml .
COPY src ./src

RUN mvn dependency:go-offline

# Expõe a porta
EXPOSE 8080

# Comando para rodar no modo desenvolvimento
ENTRYPOINT ["mvn", "spring-boot:run"]
