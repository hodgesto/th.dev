FROM openjdk:8-alpine

COPY target/uberjar/th.dev.jar /th.dev/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/th.dev/app.jar"]
