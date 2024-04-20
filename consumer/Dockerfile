FROM openjdk:21

COPY /target/consumer-0.0.1-SNAPSHOT.jar /app/app.jar

# Defina o diretório de trabalho
WORKDIR /app

# Comando para executar a aplicação quando o contêiner iniciar
CMD ["java", "-jar", "app.jar"]
