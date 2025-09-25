FROM openjdk:17-jdk-slim

WORKDIR /app

# Copy the JAR file
COPY target/template_java_maven*.jar app.jar

# Create logs directory
RUN mkdir -p logs

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]