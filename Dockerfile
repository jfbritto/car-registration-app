# Etapa de build: compila a aplicação e gera o executável
FROM openjdk:17-jdk-slim AS builder
WORKDIR /app
# Copia os arquivos do projeto para o container
COPY . /app
# Concede permissão de execução ao Gradle Wrapper (se necessário)
RUN chmod +x ./gradlew
# Compila e gera o jar executável (bootJar)
RUN ./gradlew clean bootJar

# Etapa final: roda o aplicativo
FROM openjdk:17-jdk-slim
WORKDIR /app
# Copia o jar gerado na etapa anterior para esta imagem
COPY --from=builder /app/build/libs/*.jar app.jar
# Expõe a porta padrão (configure conforme necessário)
EXPOSE 8080
# Comando para iniciar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
