FROM openjdk:21
WORKDIR /usr/src/app
COPY . .
RUN javac Caesar.java
CMD ["java","Caesar"]
