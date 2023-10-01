FROM maven:3.6.0-jdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package


FROM adoptopenjdk/openjdk11:alpine-jre
COPY --from=build /home/app/target/usersignup-0.0.1-SNAPSHOT.jar /usr/local/lib/demo.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/demo.jar"]


#FROM adoptopenjdk/openjdk11:alpine-jre
#RUN mvn clean
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} application.jar
#EXPOSE 8080
#ENTRYPOINT ["java","-jar","/usersignup-0.0.1-SNAPSHOT.jar"]


# docker build -t app-rest:v1.0 .
# docker create -p 8080:8080 --name web-rest-api  app-rest:v1.0
# docker run -it --rm -p 8080:8080  --name web-rest-api  app-rest:v1.0
# docker  tag app-rest:v1.0   rocha7778/app-rest:v1.0
# docker push rocha7778/app-rest:v1.0
# kubectl port-forward pod/web-java 8080:8080
# 
