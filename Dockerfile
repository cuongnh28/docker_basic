FROM openjdk:11

VOLUME /tmp

ADD /target/btl-ltw-0.0.1-SNAPSHOT.jar app.jar

CMD ["java","-jar","app.jar"]