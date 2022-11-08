FROM maven:3.6.1-jdk-11 AS MAVEN_BUILD

COPY ./ ./

RUN mvn clean package

FROM adoptopenjdk/openjdk11:alpine-jre


COPY --from=MAVEN_BUILD /target/mo.air.traffic-0.0.1-SNAPSHOT.jar mo.air.traffic-1.0.0.jar

CMD ["java","-jar","/mo.air.traffic-1.0.0.jar"]
