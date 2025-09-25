#!/bin/bash

echo "Building project..."
mvn clean compile

echo "Running tests..."
mvn test

echo "Creating package..."
mvn package

echo "Build completed!"

# Display build results
echo ""
echo "Build Summary:"
echo "- JAR file: target/mon-projet-java-1.0.0-SNAPSHOT.jar"
echo "- Test results: target/surefire-reports/"
echo "- Coverage report: target/site/jacoco/index.html"