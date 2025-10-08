# Etapa de build: compila SIEMPRE el jar fresco con tu application.properties
FROM maven:3.9.9-eclipse-temurin-21 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn -q -DskipTests dependency:go-offline
COPY src ./src
RUN mvn -q -DskipTests package

# Etapa de runtime: imagen liviana con JRE 21
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
COPY --from=build /app/target/*-SNAPSHOT.jar /app/api-v1.jar

# Render asigna el puerto en runtime; no lo seteamos aquí
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/api-v1.jar"]