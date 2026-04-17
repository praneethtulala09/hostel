FROM openjdk:17
COPY target/booking-1.0.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]