FROM amazoncorretto:24-alpine-jdk

COPY target/demo-EVA-0.0.1-SNAPSHOT.jar /api-v1.jar

# Activa el perfil prod y usa el puerto dinámico de Render
ENV SPRING_PROFILES_ACTIVE=prod
ENV SERVER_PORT=$PORT

ENTRYPOINT ["java","-jar","/api-v1.jar"]