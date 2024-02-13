FROM registry.ustpace.com/docker/openjdk:8-jre-alpine

WORKDIR /app

COPY ./target/*.jar /app/app.jar

ENTRYPOINT ["/entrypoint.sh"]
CMD ["java", "-jar", "app.jar"]