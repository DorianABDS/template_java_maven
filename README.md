# 🚀 Java Maven Template

A professional Java template ready to be reused for all your Java projects.

## 📋 Prerequisites

### Required Software

**Java 17+:**
```bash
# Download from: https://adoptium.net/
java -version  # Verify installation
```

**Maven 3.6+:**
```bash
# Download from: https://maven.apache.org/download.cgi
mvn -version   # Verify installation
```

**IDE (recommended):** IntelliJ IDEA, VS Code with Java Extension Pack, or Eclipse

## ⚡ Quick Start

```bash
# 1. Copy this template to your new project
cp -r java-maven-template my-new-project
cd my-new-project

# 2. Test everything works
mvn clean compile test exec:java

# 3. You should see: BUILD SUCCESS and app logs with
```

## 📁 Project Structure

```
java-maven-template/
├── pom.xml                   # Maven configuration
├── README.md                 # This file
├── .gitignore               # Git ignore rules
├── Dockerfile               # Docker configuration
├── scripts/                 # Utility scripts
│   ├── build.sh
│   └── run.sh
└── src/
    ├── main/
    │   ├── java/com/example/
    │   │   ├── App.java              # Main class
    │   │   ├── model/User.java       # Example model
    │   │   ├── service/UserService.java # Example service  
    │   │   └── util/StringUtils.java # Utilities
    │   └── resources/
    │       ├── application.properties
    │       └── logback.xml
    └── test/java/com/example/    # Complete test suite
        ├── AppTest.java
        ├── model/UserTest.java
        ├── service/UserServiceTest.java
        └── util/StringUtilsTest.java
```

## 🔄 How to Use This Template

### 1. Customize for your project:
```xml
<!-- Edit pom.xml -->
<groupId>com.yourcompany</groupId>
<artifactId>your-project-name</artifactId>
<name>Your Project Name</name>
```

### 2. Rename packages:
- Rename `com.example` → `com.yourcompany.yourproject`
- Update all package declarations and imports
- Use IDE refactoring tools for easy renaming

### 3. Update configuration:
```properties
# application.properties
app.name=Your Project Name
app.description=Your project description
```

## 🛠️ Available Commands

```bash
# Basic workflow
mvn clean compile        # Compile code
mvn test                # Run tests (12 tests included)
mvn exec:java           # Run application
mvn package             # Create JAR file

# Development
mvn clean test jacoco:report  # Generate coverage report
mvn test -Dtest=UserServiceTest  # Run specific test
```

## ✨ Features

- ✅ **Java 17** with modern syntax
- ✅ **Complete Maven setup** with useful plugins
- ✅ **JUnit 5 + Mockito** for testing
- ✅ **SLF4J + Logback** for logging
- ✅ **JaCoCo** for code coverage
- ✅ **Example classes** with real functionality
- ✅ **12 unit tests** with 100% coverage
- ✅ **Professional structure** following best practices

## 🚨 Troubleshooting

**Build fails?**
```bash
mvn clean compile -X  # Verbose output
```

**Tests don't run?**
- Ensure test classes end with `Test`
- Check files are in `src/test/java/`

**"Cannot find symbol"?**
- Verify all Java files exist in correct packages
- Run `mvn clean compile`

---

**🎯 Perfect for:** Web apps, REST APIs, microservices, desktop applications, libraries

**Next steps:** Copy template → Customize → Add your features → Start coding! 🚀