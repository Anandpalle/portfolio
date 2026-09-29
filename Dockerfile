# Stage 1: Build the JAR with Maven
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app

# Optimize build memory
ENV MAVEN_OPTS="-Xmx384m"

COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Run with lightweight JRE & explicit memory limits
FROM eclipse-temurin:21-jre
WORKDIR /app

COPY --from=build /app/target/portfolio-1.0.0.jar app.jar

# Render assigns PORT dynamically; expose default fallback
EXPOSE 8080

# Automatically activate 'prod' profile on Render
ENV SPRING_PROFILES_ACTIVE=prod

# Keep JVM within Render's 512MB RAM free tier limit
ENTRYPOINT ["java", "-XX:+UseContainerSupport", "-Xmx350m", "-Xms128m", "-Xss512k", "-XX:CICompilerCount=2", "-jar", "app.jar"]