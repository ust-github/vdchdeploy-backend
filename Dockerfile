FROM registry.ustpace.com/docker/openjdk:8-jre-alpine

WORKDIR /app

COPY ./target/*.jar /app/app.jar

USER ${APP_USER:-nobody}
ENTRYPOINT ["/entrypoint.sh"]
CMD ["java", "-jar", "app.jar"]