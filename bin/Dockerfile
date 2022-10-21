#
# Build stage
#
FROM maven:3.6.0-jdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

#
# Package stage
#
FROM gcr.io/distroless/java  
COPY --from=build /home/app/target/servicioMateriales-0.0.1-SNAPSHOT.jar /usr/local/lib/servicioMateriales.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/servicioMateriales.jar"]