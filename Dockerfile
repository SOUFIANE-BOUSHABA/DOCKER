FROM openjdk:8
COPY . /
WORKDIR /
RUN javac dataconn.java
CMD ["java", "-cp", "mysql-connector.jar:.", "dataconn"]
