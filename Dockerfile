FROM openjdk:17
WORKDIR /usr/src/app
COPY . .
RUN javac Caesar.java
ENTRYPOINT ["java","Caesar"]

